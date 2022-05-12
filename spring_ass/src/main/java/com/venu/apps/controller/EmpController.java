
package com.venu.apps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.venu.apps.entity.Emp;
import com.venu.apps.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	private EmpService empservice;
	@RequestMapping("/")
	public String test() {
		return "tested";
	}
	@RequestMapping("/emps")
	public List<Emp> findAllProducts(){
		return empservice.getemps();
	}
	
	@RequestMapping(value="/addemp" ,method= RequestMethod.POST)
	public Emp addEmpToDB(@RequestBody Emp product) {
		return empservice.saveEmp(product);
	}
	@RequestMapping(value="/addemps" ,method= RequestMethod.POST)
	public List<Emp> addUsers(@RequestBody List<Emp> users) {
		 return empservice.saveEmps(users); 
	}
	@RequestMapping("emp/{id}")
	public ResponseEntity<Emp> getEmployeeById(@PathVariable int id){
		Emp emp = empservice.getEmpById(id);
		return ResponseEntity.ok(emp);
	}
	@RequestMapping(value="/update",method= RequestMethod.PUT)
	public Emp updateProduct(@RequestBody Emp emp) {
		return empservice.updateEmp(emp);
	}
	@RequestMapping(value="/delete/{id}",method= RequestMethod.DELETE)
	public String deleteProduct_pathV (@PathVariable int id) {
		return empservice.deleteEmp(id);
	}
}
