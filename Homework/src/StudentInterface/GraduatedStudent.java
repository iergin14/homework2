package StudentInterface;
import java.util.Date;

public class GraduatedStudent extends AbstractStudent{

	private String advisor;
	private String thesis;

	public GraduatedStudent(int no, String name, int year, 
			Date dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major);
		this.advisor = advisor;
		this.thesis = thesis;
	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public String getThesis() {
		return thesis;
	}

	public void setThesis(String thesis) {
		this.thesis = thesis;
	}
	
	@Override
	public void study() {
		System.out.println(super.getName() + " is graduated student and still studying");
	}

	@Override
	public void register() {
		System.out.println(getName() + " is graduated student and register the university");
	}
}
