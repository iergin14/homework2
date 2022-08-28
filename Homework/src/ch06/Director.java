package ch06;


public class Director extends Manager {
	protected double bonus;
	
	public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus) {
		super(no, name, year, workingDepartment, managingDepartment);
		this.bonus = bonus;
		double salary = super.calculateSalary();
		if(salary<7000.0) {
			throw new SalaryPaidOnBankException("Salary cannot bigger than 7000");
		}
	}
	
	@Override
	public void work(){
		System.out.println("Director is working!");
		manage();
	}
	
	public void manage(){
		System.out.println("Director manages whole company!");
		makeAStrategicPlan();
	}
	
	public void makeAStrategicPlan(){
		System.out.println("Director makes a strategic plan for the company!");
	}
	
	public double calculateSalary(){
		return super.calculateSalary() + bonus;
	}
	
	public void printInfo(){
		System.out.println("\nDirector Info");
		super.printInfo();
	}

	@Override
	public String toString() {
		return "Director [bonus=" + bonus + ", departmentManaged=" + departmentManaged + ", no=" + no + ", name="
				+ name + ", year=" + year + ", department=" + department + "]";
	}
}
