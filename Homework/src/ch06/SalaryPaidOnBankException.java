package ch06;

public class SalaryPaidOnBankException extends RuntimeException {
	private double argument;
	
//	private static String message = "";
	
	public SalaryPaidOnBankException(String message, double argument) {
		super(message);
		this.argument = argument;
	}
	
	public SalaryPaidOnBankException(String message) {
		super(message);
	}

	public double getArgument() {
		return argument;
	}
}
