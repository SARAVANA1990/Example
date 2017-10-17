package lombok_example;
import lombok.Cleanup;
public class Emp_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Employee emp=new Employee();
	  emp.setEmpNo("EMP1");
	  
	  emp_print(emp);
	}
	
	public static void emp_print(Employee e){
		System.out.println(e.getEmpNo());
	}
}
