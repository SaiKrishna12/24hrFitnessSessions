package day22;

public class BOA implements Bank{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BOA b=new BOA();
		b.debit();
		b.credit();
		b.moneyTransfer();

	}

	@Override
	public void debit() {
		System.out.println("abc");
		
	}

	@Override
	public void credit() {
		System.out.println("xyz");
		
	}

	@Override
	public void moneyTransfer() {
		System.out.println("qerqer");
	}

}
