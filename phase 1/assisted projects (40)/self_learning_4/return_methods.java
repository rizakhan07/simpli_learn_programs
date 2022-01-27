package self_learning_4;

public class return_methods {
	 public static void main(String[] args) {
	        a();
	        System.out.println(b());
	        System.out.println(c());
	        System.out.println(e());
	        System.out.println(f());
	    }

	    static void a(){
	        System.out.println("Returns Nothing");
	    }

	    static int b(){
	        return 2+3;
	    }

	    static String c(){
	        return "String";
	    }

	    static float e(){
	        return 3+7;
	    }

	    static double f(){
	        return 5.7+6.8;
	    }
	}


