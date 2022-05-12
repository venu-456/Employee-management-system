
package com.venu.apps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.venu.apps.entity.Emp;
import com.venu.apps.repository.EmpRepo;

@Service
public class EmpService{
	@Autowired
	private EmpRepo emp_repo;
	
	public Emp saveEmp(Emp emp) {
		return emp_repo.save(emp);
	}
	public List<Emp> saveEmps(List<Emp> product) {
		return emp_repo.saveAll(product);
	}
	public List<Emp> getemps(){
		return emp_repo.findAll();
	}
	public Emp getEmpById(int id){
		return emp_repo.findById(id).orElse(new  Emp());
	}
	public String deleteEmp(int id) {
		emp_repo.deleteById(id);
		return "product removed!! "+id;
	}
	public Emp updateEmp(Emp emp) {
		Emp existingEmp =emp_repo.findById(emp.getId()).orElse(null);
		existingEmp.setEmp_name(emp.getEmp_name());
		existingEmp.setEmp_add(emp.getEmp_add());
		existingEmp.setEmp_contact(emp.getEmp_contact());
		existingEmp.setEmp_salary(emp.getEmp_salary());
		return emp_repo.save(existingEmp);
	}
	
}