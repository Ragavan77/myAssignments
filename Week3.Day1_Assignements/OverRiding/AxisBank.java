package week3.day1;


public class AxisBank extends BankInfo {
	//override method
	public void deposit() {
		
    System.out.println("Minimum deposit should be 10000INR");
	}

public static void main(String[] args) {
	AxisBank depositRate=new AxisBank();
	depositRate.deposit();
	
}
}


