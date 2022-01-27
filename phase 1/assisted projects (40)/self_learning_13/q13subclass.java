package self_learning_13;

public class q13subclass extends Thread {
public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		q13  a = new q13();
		q13B xc = new q13B();
		q13C c = new q13C();
		 a.start();
		 xc.sleep();
		 c.waiit();
		 
		 System.out.println("MultiThreading is over");

	}

}
