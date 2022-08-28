package ch06;

public class Engineer extends Employee{

	private String project;

	public Engineer(int no, String name, int year, String department, String project) {
		super(no, name, year, department);
		this.project = project;
		double salary = super.calculateSalary();
		if(salary<7000.0) {
			throw new SalaryPaidOnBankException("Salary cannot bigger than 7000");
		}
	}
	
	@Override
	public void work(){
		System.out.println("Engineer is working on a project: " + project);
	}
	
	public void assignTask(String task){
		System.out.println("Engineer " + name + " works on the task: " + task);
	}
}
