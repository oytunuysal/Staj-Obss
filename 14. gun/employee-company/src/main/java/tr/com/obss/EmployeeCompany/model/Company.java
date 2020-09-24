package tr.com.obss.EmployeeCompany.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "company")
@Table(name = "company")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "companyName", unique = true)
	private String companyName;

	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Employee> employeeList;
	//@OrderColumn
	//private Employee[] employeeList;

	public Company() {

	}

	public Company(Long id, String companyName) {
		super();
		this.id = id;
		this.companyName = companyName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<Employee> getEmployees() {
		return employeeList;
	}

}
