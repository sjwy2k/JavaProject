package emp.run;
import emp.model.vo.Employee;
import product.model.vo.Products;
public class TestEmp {
	
	public static void main(String[] args) {
		System.out.println("1번 과제");
		new Employee().printEmployee();
		
		System.out.println("\r\r2번 과제");
		new Products().printProduct();		
	}	
}
