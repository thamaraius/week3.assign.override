package org.override;

public class AxisBank {
	
	public void deposit(int depoAmount) {
		System.out.println("Depositted amount in Axis Bank is "+depoAmount);
		
	}
	
	public static void main(String[] args) {
		BankInfo obj1=new BankInfo();
		AxisBank obj2=new AxisBank();
		obj1.deposit(1000);
		obj1.fixed(23000);
		obj1.saving(500);
		System.out.println("*****Override***********");
		
	}

}
