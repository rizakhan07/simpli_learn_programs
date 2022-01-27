package self_learning_15;
import java.io.File;
import java.io.IOException;
public class try_catch {

	public static void main (String [] args){
		
		try {
			File file1 =new File("C:\\Users\\Muhammad Riza\\eclipse-workspace\\assesment questions\\src\\self_learning_12");
			
			if (file1.createNewFile()){
				System.out.println("File Successfully Created");
			}else {if (file1.exists()){
				System.out.println("File Already Exists");
			}
			else {
				System.out.println("File Dosenot Exists");
			}
			}
		    }
			catch (IOException e){
		          e.getStackTrace();
				
			}
		}		
	
		
	

}
