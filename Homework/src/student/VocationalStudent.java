package student;
import java.util.Date;

public class VocationalStudent extends Student{

	public VocationalStudent(int no, String name, int year, 
			Date dob, String major) {
		super(no, name, year, dob, major);

	}
	
	@Override
	public void study() {
		System.out.println(super.getName() + " is vocational student and she/he study");
	}

	@Override
	public void register() {
		System.out.println(getName() + " is vocational student and he/she register the university");
	}

}
