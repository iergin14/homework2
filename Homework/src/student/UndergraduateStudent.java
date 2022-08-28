package student;

import java.util.Date;

public class UndergraduateStudent extends Student{
	
	private String minor;

	public UndergraduateStudent(int no, String name, int year, 
			Date dob, String major, String minor) {
		super(no, name, year, dob, major);
		this.minor = minor;
	}
	
	public String getMinor() {
		return minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}
	
	@Override
	public void study() {
		System.out.println(super.getName() + " is undergraduated student and who study");
		
	}
	@Override
	public void register() {
		System.out.println(super.getName() + " is undergraduated student who registered the university");
		
	}
}
