import java.util.ArrayList;
import java.util.List;

public class JavaBookLibrary implements BookLibrary {
	private List<Book> books = new ArrayList<Book>() ;

	public List<Book> search(String title) {
		List<Book> returningBooks = new ArrayList<Book>();
		for (Book book : books) {
			if (title.equalsIgnoreCase(book.getTitle())) {
				returningBooks.add(book);
			}
		}
		return returningBooks;
	}

	public void addBook(Book book) {
		books.add(book);
	}
}
