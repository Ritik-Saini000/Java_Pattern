
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=(2*i-1);j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
