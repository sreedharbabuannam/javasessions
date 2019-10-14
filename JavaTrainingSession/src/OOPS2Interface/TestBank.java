package OOPS2Interface;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//USBank us= new USBank();  we can not create object for interface
		
		System.out.println(USBank.Min_bal);   // min_bal is decared under interface, so if we want to access this variable we have to access using interfacename.[because we can not create object for interface]
		
		//USBank.Min_bal=200; //min_bal is decared under interface, so which is static in nature(constant/final). we can not change value.
		
		
		// compile time poltmoprphism : credit,debit, transfermoney methods are defined/overrided in both interface(USBank) and class(HSBCBank).so as
		//per priority while compile time it will execute childclass methods.
		
		HSBCBank hs= new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationloan();
		hs.carloan();
		
		
	// Dynamic Ploymorphism
		
		USBank b= new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		//b.educationloan();
		//b.carloan();          // Educationloan and carloan methods can not access by parent interface reference variable.because which is HSBCBank own methods.
								//we can always access only overriden methods(like credit, debit, transfermoney)
	}

}
