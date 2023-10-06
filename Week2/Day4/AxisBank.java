package week2.day4;

public class AxisBank extends BankInfo{

	public void deposit() {
		
		System.out.println("Deposit interest rate(Axis): 7.2%");
		super.deposit();
	}
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();
	}
}
