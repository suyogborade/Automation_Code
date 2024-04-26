package Java;

public class Employee2 {

	public static void main(String[] args) {
		Employees_Class emp1 = new Employees_Class();
		emp1.id = 101;
		emp1.name = "Gaurav";
		emp1.job = "QA Manager";
		emp1.salary = 200000;

		emp1.display();

		System.out.println();
		Employees_Class emp2 = new Employees_Class();

		emp2.id = 102;
		emp2.name = "Ganesh";
		emp2.job = "Quality Analyst";
		emp2.salary = 80000;

		emp2.display();

	}

}
