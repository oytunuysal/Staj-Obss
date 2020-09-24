package tr.com.obss.jss.controller;

import java.security.Principal;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tr.com.obss.jss.entity.Book;
import tr.com.obss.jss.entity.User;
import tr.com.obss.jss.model.BookDTO;
import tr.com.obss.jss.service.BookService;
import tr.com.obss.jss.service.UserService;

@RestController
@RequestMapping("/api/books")
public class BookController {

	private BookService bookService;
	private UserService userService;

	@Autowired
	public BookController(BookService bookService, UserService userService) {
		this.bookService = bookService;
		this.userService = userService;
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@GetMapping("/admin")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<?> adminGet(Principal p, @RequestParam(name = "pageSize", defaultValue = "100") int pageSize,
			@RequestParam(name = "pageNumber", defaultValue = "0") int pageNumber) {
		p.getName();
		Optional<User> user = userService.findByUsername(p.getName());
		User currentUser = user.get();
		if (user.isPresent()) {
			
		}
		return ResponseEntity.ok(bookService.findAll(pageSize, pageNumber));
	}
	
	@GetMapping("")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_USER')")
	public ResponseEntity<?> get(Principal p, @RequestParam(name = "pageSize", defaultValue = "100") int pageSize,
			@RequestParam(name = "pageNumber", defaultValue = "0") int pageNumber) {
		p.getName();
		Optional<User> user = userService.findByUsername(p.getName());
		User currentUser = user.get();
		if (user.isPresent()) {
			
		}
		return ResponseEntity.ok(bookService.findByTitle(""));
	}


	@GetMapping("/searchtitle")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_USER')")
	public ResponseEntity<?> searchByTitle(@RequestParam(name = "title", defaultValue = "") String title) {
		List<Book> bookList = bookService.findByTitle(title);
		return ResponseEntity.ok(bookList);
	}

	@GetMapping("/searchauthor")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_USER')")
	public ResponseEntity<?> searchByAuthor(@RequestParam(name = "author", defaultValue = "") String author) {
		List<Book> bookList = bookService.findByAuthor(author);
		return ResponseEntity.ok(bookList);
	}

	@PostMapping("/addfav/{id}")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_USER')")
	public ResponseEntity<?> addFav(Principal p, @PathVariable long id) {
		// Object principal =
		// SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		p.getName();
		Optional<User> user = userService.findByUsername(p.getName());
		if (user.isPresent()) {
			User currentUser = user.get();
			Book currentBook = bookService.findById(id).get();
			currentUser.getFavbooks().add(currentBook);
			userService.updateFavlist(currentUser);
			// bookService.saveFav(currentUser.getId(), id);

		} else {

		}
		return null;
	}

	@DeleteMapping("/deletefav/{id}")
	@PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_USER')")
	public Set<Book> deleteFav(Principal p, @PathVariable long id) {
		p.getName();
		Optional<User> user = userService.findByUsername(p.getName());
		User currentUser = user.get();
		if (user.isPresent()) {
			Book currentBook = bookService.findById(id).get();
			currentUser.getFavbooks().remove(currentBook);
			userService.updateFavlist(currentUser);
		} else {

		}
		return currentUser.getFavbooks();
	}

	@PostMapping("/addread/{id}")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_USER')")
	public ResponseEntity<?> addRead(Principal p, @PathVariable long id) {
		// Object principal =
		// SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		p.getName();
		Optional<User> user = userService.findByUsername(p.getName());
		if (user.isPresent()) {
			User currentUser = user.get();
			Book currentBook = bookService.findById(id).get();
			currentUser.getReadbooks().add(currentBook);
			userService.updateFavlist(currentUser);
			// bookService.saveFav(currentUser.getId(), id);
		} else {

		}
		return null;
	}
	
	@DeleteMapping("/deleteread/{id}")
	@PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_USER')")
	public Set<Book> deleteRead(Principal p, @PathVariable long id) {
		p.getName();
		Optional<User> user = userService.findByUsername(p.getName());
		User currentUser = user.get();
		if (user.isPresent()) {
			Book currentBook = bookService.findById(id).get();
			currentUser.getReadbooks().remove(currentBook);
			userService.updateReadlist(currentUser);
		} else {

		}
		return currentUser.getReadbooks();
	}

	@PostMapping(value = "")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<?> post(@Valid @RequestBody BookDTO bookDTO) {
		Book book = bookService.save(bookDTO);

		return ResponseEntity.ok(book);
	}

	@PutMapping("/{id}")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<?> update(@PathVariable long id, @Valid @RequestBody BookDTO bookDTO) {
		Book book = bookService.update(id, bookDTO);
		return ResponseEntity.ok(book);
	}

	@DeleteMapping("/{id}")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<?> delete(@PathVariable long id) {
		Book book = bookService.delete(id);
		return ResponseEntity.ok(book);
	}
	
	@PostMapping("/activate/{id}")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<?> activate(@PathVariable long id) {
		Book book = bookService.activate(id);
		return ResponseEntity.ok(book);
	}
}
