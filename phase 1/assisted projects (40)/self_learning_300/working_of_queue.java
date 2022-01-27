package self_learning_300;
import java.util.*;
public class working_of_queue {
	public static void main(String[] args) 
	{
	        		Queue<String> locationsQueue = new LinkedList<>();
	                locationsQueue.add("M416");
	        		locationsQueue.add("akm");
	        		locationsQueue.add("M249");
	        		locationsQueue.add("Kar98");
	        		locationsQueue.add("AWM");
	System.out.println("Queue is : " + locationsQueue);
	        		System.out.println("Head of Queue : " + locationsQueue.peek());
	        		locationsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + locationsQueue);
	        		System.out.println("Size of Queue : " + locationsQueue.size());
	    	}


}
