package seld_learning_29;

public class operation_on_stack {
	static final int MAX = 1000; 
	int top; 
	int a[] = new int[MAX];  
	boolean isEmpty() 
	{ 
    		return (top < 0); 
	} 
	operation_on_stack() 
	{ 
    		top = -1; 
	} 
	boolean push(int x) 
	{ 
    		if (top >= (MAX-1)) 
    		{ 
        			System.out.println("Stack Overflow"); 
        			return false; 
    		} 
    		else
    		{ 
        			a[++top] = x; 
        			System.out.println(x + " pushed into stack"); 
        			return true; 
    		} 
	} 
int pop() 
	{ 
    		if (top < 0) 
    		{ 
        			System.out.println("Stack Underflow"); 
        			return 0; 
    		} 
    		else
    		{ 
        			int x = a[top--]; 
        			return x; 
    		} 
	} 

	public static void main(String args[])
{
		operation_on_stack s = new operation_on_stack(); 
    		s.push(44); 
    		s.push(55); 
    		s.push(66); 
    		System.out.println(s.pop() + " Popped from stack"); 
	}


}
