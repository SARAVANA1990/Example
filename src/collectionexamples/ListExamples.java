package collectionexamples;

import java.util.ArrayList;
import java.util.List;

import model.Employee;
//import model.student;

public class ListExamples {
	public static void main(String ags[]){
		
		Employee e1=new Employee();
		Employee e2= new Employee();
		Employee e3=new Employee();
		Employee e4=new Employee();
		
		      e1.setCompanyId("cmp1");
		      e1.setCompanyName("Company One");
		      e1.setEmpId("E1");
		      e1.setEmpDecigination("Engineer");
		      e1.setEmpName("Employee One");
		      e1.setNumberOfEmployee(123);
		      e1.setSalary(222222.00);
		      
		      e2.setCompanyId("cmp2");
		      e2.setCompanyName("Company two");
		      e2.setEmpId("E2");
		      e2.setEmpDecigination("Engineer two");
		      e2.setEmpName("Employee Two");
		      e2.setNumberOfEmployee(456);
		      e2.setSalary(1111111.00);
		      
		      e3.setCompanyId("cmp3");
		      e3.setCompanyName("Company three");
		      e3.setEmpId("E3");
		      e3.setEmpDecigination("Engineer three");
		      e3.setEmpName("Employee Three");
		      e3.setNumberOfEmployee(789);
		      e3.setSalary(3333333333.00);
		      
		      
		      e3.setCompanyId("cmp4");
		      e3.setCompanyName("Company four");
		      e3.setEmpId("E4");
		      e3.setEmpDecigination("Engineer four");
		      e3.setEmpName("Employee Three");
		      e3.setNumberOfEmployee(9876);
		      e3.setSalary(444444444.00);
		      
		List<Employee> list=new ArrayList<Employee>();
           list.add(e1);
           list.add(e2);
           list.add(e3);      
           list.add(e4);
           
           
           
           
           
           
           for (Employee employee : list) {
        	   
        	   System.out.println("EMP ID"+employee.getEmpId());
        	   System.out.println("EMP SAL"+employee.getSalary());
			   System.out.println("Numbe rof Employee"+employee.getNumberOfEmployee());
		}
    	
		
		   
		
	}

}
