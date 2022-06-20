import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter rows and Columns:");
		int rows=sc.nextInt();
		int col=sc.nextInt();
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==0 || i==rows-1 || j==0 || j==col-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
