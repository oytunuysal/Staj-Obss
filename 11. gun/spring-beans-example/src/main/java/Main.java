import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String args[]) // static method
	{
		/*
		 * JavaBookLibrary bookLibrary = new JavaBookLibrary(); bookLibrary.addBook(new
		 * Book("Martin Eden")); bookLibrary.addBook(new Book("Hobbit"));
		 * bookLibrary.addBook(new Book("Oz"));
		 * 
		 * BookReader bookReader = new BookReader(bookLibrary); List<Book> books =
		 * bookReader.search("Marting eden"); for (Book book : books) {
		 * System.out.println("Book name:" + book.getTitle()); }
		 */
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class)) {
			BookLibrary bookLibrary = appContext.getBean(BookLibrary.class);
			bookLibrary.addBook(new Book("Martin Eden"));
			bookLibrary.addBook(new Book("Hobbit"));
			bookLibrary.addBook(new Book("Oz"));
			List<Book> books = bookLibrary.search("Martin Eden");
			for (Book book : books) {
				System.out.println(book.getTitle());
			}
		}
	}
}
