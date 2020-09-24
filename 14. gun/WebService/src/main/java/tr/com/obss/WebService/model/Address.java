package tr.com.obss.WebService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "address")
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "first_line")
	private String first_line;

	@JsonBackReference
	@OneToOne(mappedBy = "address")
	private User user;

	public Address() {

	}

	public Address(Long id, String first_line) {
		this.id = id;
		this.first_line = first_line;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_line() {
		return first_line;
	}

	public void setFirst_line(String first_line) {
		this.first_line = first_line;
	}

}
