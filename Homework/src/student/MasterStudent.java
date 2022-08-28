package student;

import java.util.Date;

public class MasterStudent extends GraduatedStudent{

	public MasterStudent(int no, String name, int year, Date dob, String major, 
			String advisor, String thesis) {
		super(no, name, year, dob, major, advisor, thesis);
	}

	@Override
	public void study() {
		System.out.println(super.getName() + " is master student and still studying");
	}

	@Override
	public void register() {
		System.out.println(super.getName() + " registered the university as a master student");
	}


}
