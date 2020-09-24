package tr.com.obss.jss.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class BookDTO {

	@NotBlank
	@Size(max = 255, min = 3, message = "Please input a valid title")
	private String title;

	@NotBlank
	@Size(max = 255, min = 3, message = "Please input a valid author")
	private String author;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
