
public class Pattern13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char alphabet='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(alphabet);
				alphabet++;
			}
			
			System.out.println();
		}
	}

}
