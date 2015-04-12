package day22;

public class HSBC implements Bank{

	
	public static void main(String[] args) {
		HSBC h=new HSBC();
		h.debit();
		h.credit();
		h.moneyTransfer();

	}

	
	public void debit() {
		System.out.println("Debit process in hsbc");
		
	}

	
	public void credit() {
		System.out.println("Credit");
		
	}

	
	public void moneyTransfer() {
		System.out.println("Money transfer policy in hsbc");
		
	}

}
