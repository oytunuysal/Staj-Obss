import java.util.List;

public interface BookLibrary {
	public List<Book> search(String title);

	public void addBook(Book book);
}
