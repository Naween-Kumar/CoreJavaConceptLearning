package InterfaceConcept;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(WorldBank.min_bal); // Static in nature by class name
		
		// This is called compile time polymorphism
		AxisBank ab = new AxisBank();
		ab.credit();
		ab.debit();
		ab.transferMoney();
		ab.currencyConversion();
		ab.mutualFund();
		
		System.out.println("__________________________________");
		// This is called run time polymorphism
		
		WorldBank wb = new AxisBank();
		wb.currencyConversion();
		
		

	}

}
