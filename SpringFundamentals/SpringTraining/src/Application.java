import java.util.List;

import com.kanu.training.salesmanager.model.Employee;
import com.kanu.training.salesmanager.service.EmployeeService;
import com.kanu.training.salesmanager.service.EmployeeServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		List<Employee> employees = employeeService.getAllEmployees();
		
		for (Employee employee : employees) {
			System.out.println(employee.getEmployeeName() + " at " 
								+ employee.getEmployeeLocation());
		}
		
		
	}

}
