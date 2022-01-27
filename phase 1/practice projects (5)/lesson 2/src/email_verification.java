import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email_verification {
	 static String [] dataBase= {"riza@gmail.com","akshay@wwc.com","aakash@outlook.net"};


		public static void main(String[] args) {
	        System.out.println("**** Welecome to the application ****");
	        Scanner inp= new Scanner(System.in);
	        String userID;
			while (true){
		     System.out.println(" Please Enter your User ID ");
		     userID = inp.next();
		     while(VerfiyFormate(userID))
		     {
			     System.out.println("---- Please Enter your User ID with valid formate ex: eamaple@domain.xcom --- ");
			     userID = inp.next();
		     }
		     
		     VerfiyID(userID);
		     
		     
		     
		     System.out.println("");

			}
			
		}
		
		private static void VerfiyID(String ID)
		{
			boolean accessFlag= false;
		     for(String id : dataBase)
		     {
		    	 if(ID.equalsIgnoreCase(id))
		    	 {
		    		 accessFlag=true;
			    	 System.out.println("access granted ");
		    		 break;
		    	 }   	 
		    	 
		     }
		     
		     if(accessFlag==false)
		     {
		    	 System.out.println("access denied ");
		    	 
		     }
				
			
		}
		
		private static boolean VerfiyFormate(String ID)
		{
			String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

			Pattern pattern = Pattern.compile(regex);
		    Matcher matcher = pattern.matcher(ID);

			if(!matcher.matches())
			{
				return true;
				
			}else 
			{
				return false;
				
			}
			
		}


}
