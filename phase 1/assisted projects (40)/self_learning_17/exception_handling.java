package self_learning_17;
import javax.imageio.IIOException;
class que17CustomExcep extends Exception {
	
	public que17CustomExcep(String s){
		
		super(s);
			
	}
	
public class exception_handling {
	static void validate (int age) throws IIOException {
		if (age<18)
		{
			throw new IIOException ("Age is not valid"); 
		}
		else
		{
			System.out.println("welcome to vote");   
		}
	}
	public static void main (String [] args){
		try
		{
			validate(90);
		}
		catch (Exception e)
		{
			System.out.println("Exception occured : Age is not Valid");  
		}
		finally{
			System.out.println("Rest Of the code");  
		}
	}
}

}
