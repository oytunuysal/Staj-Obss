package tr.com.obss.jss.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import tr.com.obss.jss.entity.Book;
import tr.com.obss.jss.model.BookDTO;
import tr.com.obss.jss.repo.BookRepository;

@Service
public class BookService {
	
	private BookRepository bookRepository;
	
	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
    public Page<Book> findAll(int pageSize, int pageNumber) {
        Pageable paged = PageRequest.of(pageNumber, pageSize);
        return bookRepository.findAll(paged);
    }
    
    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitleIsContainingAndOperationTypeIsNotNullAndActiveTrueOrderByIdDesc(title);
    }
    
    public List<Book> findByAuthor(String author) {
        return bookRepository.findByAuthorIsContainingAndIdIsNotNullAndOperationTypeIsNotNullAndActiveTrueOrderByIdDesc(author);
    }
    
    public Optional<Book> findById(long id) {
        return bookRepository.getByIdNative(id);
    }
    
    public void saveFav(long userId, long bookId) {
    	//favRepository.save(userId, bookId);
    	
    }
    
    public Book save(BookDTO bookDTO) {
    	Book book = new Book();
    	book.setTitle(bookDTO.getTitle());
    	book.setAuthor(bookDTO.getAuthor());
    

    	return bookRepository.save(book);
    }
    
    public Book update(long id, BookDTO bookDTO) {
        Optional<Book> byId = bookRepository.findById(id);
        if (byId.isPresent()) {
            Book book = byId.get();
            book.setAuthor(bookDTO.getAuthor());
            book.setTitle(bookDTO.getTitle());
            return bookRepository.save(book);

        }
        throw new IllegalArgumentException("Book not found");
    }

    public Book delete(long id) {
        Optional<Book> byId = bookRepository.findById(id);
        if (byId.isPresent()) {
            Book book = byId.get();
            book.setActive(!book.isActive());
            return bookRepository.save(book);

        }
        throw new IllegalArgumentException("Book not found");
    }
    
    public Book activate(long id) {
        Optional<Book> byId = bookRepository.findById(id);
        if (byId.isPresent()) {
            Book book = byId.get();
            book.setActive(true);
            return bookRepository.save(book);

        }
        throw new IllegalArgumentException("User not found");
    }

}
