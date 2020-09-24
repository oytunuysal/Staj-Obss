package tr.com.obss.EmployeeCompany.service;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.com.obss.EmployeeCompany.model.Company;
import tr.com.obss.EmployeeCompany.model.Employee;
import tr.com.obss.EmployeeCompany.repository.CompanyRepository;
import tr.com.obss.EmployeeCompany.repository.EmployeeRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	public Company saveCompany(Company company) {
		// employeeRepository.saveAll(Arrays.asList(company.getEmployees()));
		return companyRepository.save(company);
	}
}
