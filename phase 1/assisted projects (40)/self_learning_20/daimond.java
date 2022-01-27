package self_learning_20;


	interface bike{
		
	    default void show(){
	    	System.out.println("Bullet");
		}
	}

	interface car{
		default void Show(){
			System.out.println("BMW");	
		}
	}


public class daimond implements bike,car  {
		
		public void Show(){
			bike.super.show();
			car.super.Show();
		}
	 public static void main (String [] args){
		 daimond tc =new daimond();
		 tc.Show();
	 }
	}

