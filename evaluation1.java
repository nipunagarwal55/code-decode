import java.util.Scanner;
class evaluation
	{
		public static void main(String args[])
			{
				Scanner sc= new Scanner(System.in);
				
				int no,m1,m2,m3,tm,rollno;
				int percent;
				int result;
				
				System.out.print("Enter Total No. of Students:- ");
				no=sc.nextInt();
int arr[][]=new int[no][7];

				for(int i=0;i<no;i++)
					{
						System.out.println("Enetr Roll No. :- ");
						rollno=sc.nextInt();	
												
						System.out.println("Enter Marks In Subject 1 ,Subject 2, Subject 3 out of 100:-");
						m1=sc.nextInt();
						m2=sc.nextInt();
						m3=sc.nextInt();
					tm=m1+m2+m3;
					percent=(tm*100)/300;

					if (percent < 40)
						{result = 4;}
				else if(percent >=40&& percent<=59 )
					{result=3; }
				else if (percent >=60 && percent<=79)
					{result=2;}
				else 
					{result=1;}
				
						arr[i][0]=rollno;
						arr[i][1]=m1;
						arr[i][2]=m2;
						arr[i][3]=m3;	
						arr[i][4]=tm;
						arr[i][5]=percent;
						arr[i][6]=result;
				}
			
						
	System.out.println("Roll No	Mark1	Mark2	Mark3	Total	Percent	Result" );			
for(int x=0;x<no;x++)
	{
		for(int z=0;z<7;z++)
			{ 
				System.out.print(arr[x][z]+"\t");
}
System.out.println();
}
			
}
}

				