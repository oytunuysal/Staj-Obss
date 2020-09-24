import java.util.List;

public class BookReader {
	private BookLibrary bookLibrary;

	public BookReader(BookLibrary bookLibrary) {
		this.bookLibrary = bookLibrary;
	}

	public List<Book> search(String title) {
		return bookLibrary.search(title);
	}
}
