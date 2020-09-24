package tr.com.obss.jss.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "BOOK")
public class Book extends EntityBase {

	@Column(name = "TITLE", length = 255)
	private String title;

	@Column(name = "AUTHOR", length = 255)
	private String author;
	
	@ManyToMany(mappedBy = "favbooks")
	@JsonBackReference
	private Set<User> favbyusers;
    
	@ManyToMany(mappedBy = "readbooks")
	@JsonBackReference
	private Set<User> readbyusers;

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
