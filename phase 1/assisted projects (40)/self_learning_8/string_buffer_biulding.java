package self_learning_8;

public class string_buffer_biulding {
	public static void main(String[] args) {
    	
        System.out.println("Creating StringBuffer");
		String a = "Pooja";
		StringBuffer buf = new StringBuffer(a);
		buf.append("_Jr");
		String result = buf.toString();
		System.out.println("String to Str.Buffer: "+result);

      
        //StringBuilder
        System.out.println("Creating StringBuilder");
        StringBuilder sb1=new StringBuilder("Happy");
        sb1.append("Learning");
        System.out.println(sb1);

        System.out.println(sb1.delete(0, 1));

        System.out.println(sb1.insert(1, "Welcome"));

        System.out.println(sb1.reverse());
        
          
        //conversion    
        System.out.println("\n");
        System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
        
        String str = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);                      
    }
}


