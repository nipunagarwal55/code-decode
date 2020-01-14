import java.util.Scanner;
class Colsum
	{

		public static void main(String args[])
		{

		Scanner sc=new Scanner(System.in);
		int a[][]= new int[2][3];
		int r,c,s;
		System.out.print("Input six values");
			for(r=0;r<=1;r++)
			{
				for(c=0;c<=2;c++)
				{
					a[r][c]=sc.nextInt();
				}
			}
				
			
			for(r=0;r<=2;r++)
			{
			  s=0;
				for( c=0;c<=1;c++)
				{
					System.out.print(a[c][r]+" ");
					s=s+a[c][r];
				}
				System.out.println("sum of" + r+1 + "column is " + s);
			}
		}
	}
	