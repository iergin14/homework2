package StudentInterface;
import java.util.Date;

public class VocationalStudent implements Student{

	public VocationalStudent(int no, String name, int year, 
			Date dob, String major) {
		super();

	}
	
	@Override
	public void study() {
		System.out.println("she/he  is vocational student and she/he study");
	}

	@Override
	public void register() {
		System.out.println("she/he  is vocational student and he/she register the university");
	}

}
