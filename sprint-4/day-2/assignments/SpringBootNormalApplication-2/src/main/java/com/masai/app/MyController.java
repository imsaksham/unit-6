package com.masai.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ComponentScan(basePackages = "com.masai.app.controller")
public class MyController {
	@RequestMapping("/Employee")
	@ResponseBody
	public Employee getEmployee() {
		Employee e=new Employee(1, "Sandeep","Mumbai",2000);
		return e;
		
	}
	@RequestMapping("/list/Employee")
	@ResponseBody
	public List<Employee> getListEmployee() {
		 List<Employee> e=new ArrayList<>();
		 e.add(new Employee(1, "Sandeep", "Uttar Pradesh", 2000));
		 e.add(new Employee(2, "Ashish", "Mumbai", 2000));
		 e.add(new Employee(3, "Rajkumar", "Delhi", 3000));
		 e.add(new Employee(4, "Nitesh", "Chennai", 4300));
		 e.add(new Employee(5, "Pradyuman", "Kolkata", 4500));
		return e;
	}
//		
		
		
	
	

}
