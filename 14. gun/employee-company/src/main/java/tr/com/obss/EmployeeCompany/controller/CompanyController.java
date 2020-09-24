package tr.com.obss.EmployeeCompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tr.com.obss.EmployeeCompany.model.Company;
import tr.com.obss.EmployeeCompany.model.Employee;
import tr.com.obss.EmployeeCompany.service.CompanyService;
import tr.com.obss.EmployeeCompany.service.EmployeeService;

@RestController
public class CompanyController {
	@Autowired
	CompanyService companyService;

	@Autowired
	EmployeeService employeeService;

	@PostMapping(value = "saveemployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@PostMapping(value = "savecompany")
	public Company saveCompany(@RequestBody Company company) {
		return companyService.saveCompany(company);
	}
}
