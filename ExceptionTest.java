import java.util.Scanner;
class ExceptionTest{
public static void main(String []args){
	System.out.println("Enter dividend and divisor");
	Scanner sc =new Scanner(System.in);
	int dividend=sc.nextInt();
	int divisor= sc.nextInt();
try{
	
if(divisor == 0){

	MyException me = new MyException("There is a Divide by zero error");
	throw me;
	} 
else{
int quotient = dividend/divisor;
	int remainder = dividend % divisor;
}
}

catch(MyException ae){
ae.printStackTrace();
			}
					}
				}

class MyException extends Exception{
MyException(String str){
super(str);
}}

