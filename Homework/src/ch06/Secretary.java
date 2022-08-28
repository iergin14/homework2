package ch06;

public class Secretary extends Employee {

	protected Manager managerServed;

	public Secretary(int no, String name, int year, String department, Manager managerServed) {
		super(no, name, year, department);
		double salary = super.calculateSalary();
		if(salary<7000.0) {
			throw new SalaryPaidOnBankException("Salary cannot bigger than 7000");
		}
	}

	public void serve() {
		System.out.println("Secretary " + name + " serves her manager: " + managerServed);
	}

	@Override
	public void work() {
		System.out.println("Secretary is working!");
		serve();
	}
}
