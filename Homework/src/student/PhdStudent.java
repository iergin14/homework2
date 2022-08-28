package student;
import java.util.Date;

public class PhdStudent extends GraduatedStudent{

	private Boolean qualifyingExamTaken;

	public PhdStudent(int no, String name, int year, Date dob, String major, 
			String advisor, String thesis, Boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor, thesis);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	public boolean isQualifyingExamTaken() {
		return qualifyingExamTaken;
	}

	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	@Override
	public void study() {
		System.out.println(super.getName() + " is PHD student and still studying");
	}

	@Override
	public void register() {
		System.out.println(super.getName() + " registered the university as a PHD student");
	}

}
