package day18;

public class BMW  extends Car{

	String model;
	public void accl()
	{
		System.out.println("This is for car accl");
	}
	public static void main(String[] args) {
		BMW b=new BMW();
		b.model="BMW";
		b.accl();
		b.price=1111;
		b.start();
		
		

	}

}
