package OOPS2Interface;

public class HSBCBank implements USBank, BrazilBank {   // We are achieving multiple inheritence
	
	// is-a Relationship
	// if a class is implenting any interface, its manadatory to define/override all the methods of interface(i.e. credit,debit,transfermoney)
	
	
	// credit,debit, transfermoney methods overriden from USBank
	public void credit() {
		System.out.println("hsbc --->>>credit");
	}
	
	public void debit() {
		
		System.out.println("hsbc --->>>debit");
	}
	
	public void transferMoney() {
		
		System.out.println("hsbc --->>>transfermoney");
		
		
	}
	// educationloan,carloan methods are own methods of HSBCBank
	public void educationloan() {
		
		System.out.println("hsbc --->>>eduloan");
		
		
	}
	
	public void carloan() {
		
		System.out.println("hsbc --->>>carloan");
		
		
	}
	
	// mutualfunds method is overriden from BrazilBank
	//BrazilBank
	public void mutualfunds() {
		
		System.out.println("hsbc --->>>Mutualfunds");
	}

}
