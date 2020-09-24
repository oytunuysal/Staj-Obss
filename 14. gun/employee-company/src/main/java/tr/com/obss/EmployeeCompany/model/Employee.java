package tr.com.obss.EmployeeCompany.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "employee")
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "nameSurname")
	private String nameSurname;

	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "company_id", nullable = false)
	private Company company;

	public Employee() {

	}

	public Employee(Long id, String nameSurname, Company works) {
		super();
		this.id = id;
		this.nameSurname = nameSurname;
		this.company = works;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public Company getWorks() {
		return company;
	}

	public void setWorks(Company works) {
		this.company = works;
	}


}
