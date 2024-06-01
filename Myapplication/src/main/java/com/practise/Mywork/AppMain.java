package com.practise.Mywork;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/practise/Mywork/proConfig.xml");
		
		  EmployeeDao dao=(EmployeeDao)context.getBean("edao");  
		  // int status=dao.saveEmployee(new Employee(103,"Amrita",33000.23));  
		   // System.out.println(status);  
		    
		  //int status = dao.updateEmployee(new Employee(102,"Roopal",42560.25));
		   // System.out.println(status);
		  
//		 Employee e = new Employee();
//		 e.setId(102);
//		  int status = dao.deleteEmployee(e);
//		  System.out.println(status);

		  List<Employee> elist = dao.getAllEmployee();
		  
		  for(Employee e:elist)
		  {
			  
			  System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		  }
	}

}
