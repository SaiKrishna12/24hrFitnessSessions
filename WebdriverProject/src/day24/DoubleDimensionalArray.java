package day24;

public class DoubleDimensionalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object[][] str=new Object[2][3];
		str[0][0]="Selenium";
		str[0][1]="UFT";
		str[0][2]="LR";
		
		str[1][0]=10;
		str[1][1]=true;
		str[1][2]=15.34;
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++)
			{
				System.out.print(str[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
