package itsector.infy.employee;

public class Employee {

	int empId;

	String empName;

	long salary;

	public Employee() {

	}

	public Employee(int id, String name) {

		empId = id;
		empName = name;

	}

	public Employee(int id, String name, long salary, String email, String address) {

		empId = id;
		empName = name;
		salary = salary;
	}

	public static void main(String[] args) {

		Employee employee = new Employee();

		employee.empId = 101;
		employee.empName = "VIKAS";

		System.out.println(employee);

		Employee employee2 = new Employee(108, "vinod", 3737474, "email@gmail.com", "USA");

		employee.printAnObject(employee2.empId, employee2.empName);

		/*
		 * Employee employee1 = new Employee();
		 * 
		 * employee1.empId=102; employee1.empName="ASHOK";
		 * 
		 * System.out.println(employee1);
		 * 
		 * 
		 * 
		 * Employee employee2 = new Employee(103, "priya");
		 * 
		 * System.out.println(employee2);
		 * 
		 * Employee employee3 = new Employee(104, "hemanth");
		 * 
		 * 
		 * System.out.println(employee3);
		 * 
		 * Employee employee4 = new Employee(105, "hema");
		 * System.out.println(employee4);
		 * 
		 * Employee employee5 = new Employee(106, "sahitya");
		 * 
		 * System.out.println(employee5);
		 * 
		 * Employee employee6 = new Employee(107, "satya");
		 * System.out.println(employee6);
		 * 
		 * 
		 * new Employee(108, "vinod", 3737474, "email@gmail.com", "USA");
		 * 
		 */

	}

	public void printAnObject(int id, String name) {

		System.out.println("ID  :" + id + " NAME  : " + name);

	}

	@Override
	public String toString() {

		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

}
