package day23;

public class Pattern1 {

	
	public static void main(String[] args) {
		int a=9;
		int c=(a+(a-1))-2;
		int b=a;
		for(int i=1;i<=b;i++)
		{
			int j;
			
			for( j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			j=j-1;
			for(int k=1;k<=c;k++)
			{
				System.out.print(" ");
			}
			c=c-2;
			if(i==a)
			{
				j=j-1;
			}
			for(int l=j;l>=1;l--)
			{
				System.out.print(l);
			}
			
			System.out.println();
		}

	}

}
