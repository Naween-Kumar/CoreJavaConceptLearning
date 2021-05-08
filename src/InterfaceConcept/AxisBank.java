package InterfaceConcept;

public class AxisBank implements WorldBank, BankOfIndia { // We are achieving multiple inheritance, Is a relationship

	
	// first method we Override from WorldBank
	public void currencyConversion() {
		System.out.println("Axisbank---->Method Override from WorldBank");
		
	}

	
	// these three method we Override from BankOfIndia 
	public void credit() {
		System.out.println("Axisbank---->Method Override from BOI");		
	}

	
	public void debit() {
		System.out.println("Axisbank---->Method Override from BOI");		
	}

	
	public void transferMoney() {
		System.out.println("Axisbank---->Method Override from BOI");		
	}
	
	// Separate method of Axis bank
	public void mutualFund() {
		
		System.out.println("Axisbank---------->Own method");
	}

}
