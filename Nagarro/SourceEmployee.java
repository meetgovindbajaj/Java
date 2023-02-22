import java.util.*;
class Employee {
    private String name;
    private int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    @Override
	public String toString()
	{
		return "Employee [name=" + name + ", salary=" + salary
				+ "]";
	}
}
class Company {
    public ArrayList<String> highPayList() {
        ArrayList<String> emp = new ArrayList<>();
        EmployeeSalaryComparator employeeSalaryComparator = new EmployeeSalaryComparator();
        Employee[] employeeArray = new Employee[4];
		employeeArray[0] = new Employee("Peter", 80000);
		employeeArray[1] = new Employee("Ram", 75000);
		employeeArray[2] = new Employee("Alex", 120000);
		employeeArray[3] = new Employee("John", 60000);
		Comparator<Employee> descendingEmployeeSalaryComparator = Collections
				.reverseOrder(employeeSalaryComparator);

		Arrays.sort(employeeArray, descendingEmployeeSalaryComparator);
		for(int i=0;i<employeeArray.length;i++){
            emp.add(employeeArray[i].toString());
        }
        return emp;
    }
}
class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getSalary() - emp2.getSalary();
    }

}
public class SourceEmployee {
    public static void main(String[] args) {
        Company c=new Company();
        ArrayList<String> emp=c.highPayList();
        System.out.println(emp);
    }
}
