package day26;

public class SampleMethodOverloading {

	public static int sum(int x,int y)
	{
		return x+y;
	}
	public static double sum(double x,double y)
	{
		return x+y;
	}
	public static String sum(String x,String y)
	{
		return x+y;
	}
	public static void main(String[] args) {
		System.out.println(sum(10,20));
		System.out.println(sum(10.50,35.78));
		System.out.println(sum("Hello ","Friends"));
		

	}

}
