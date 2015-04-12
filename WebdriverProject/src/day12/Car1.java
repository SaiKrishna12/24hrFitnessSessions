package day12;

public class Car1 {

	int price;
	String model;
	public void functions(int price,String model)
	{
		this.price=price;
		this.model=model;
	}
	public static void main(String[] args) {
		Car1 c=new Car1();
		c.functions(1111,"Audi");
		System.out.println(c.price+"--"+c.model);
	}

}
