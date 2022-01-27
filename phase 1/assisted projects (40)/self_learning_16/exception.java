package self_learning_16;
import java.util.Scanner;
public class exception {
	 void div(int a, int b) throws ArithmeticException
		{
			if(b==0){
				throw new ArithmeticException();
			}
			else {
				int c=a/b;
				System.out.println(c);
			}
		}
		 public static void main (String[] args){

				Scanner sc= new Scanner(System.in);
				System.out.println("Enter the value of A :");
				int a=sc.nextInt();
				System.out.println("Enter the value of B :");
				int b=sc.nextInt();
				
			exception tc = new exception();
				
			try{
			tc.div(a, b);
			   }
			catch (Exception e)
			{
				System.out.println("Exception Occured : The value of B is O");
			}
			
			finally{
				System.out.println("Succesfully Oparated The Code");
			}
		}

}
