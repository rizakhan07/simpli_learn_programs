package self_learning_13;

class q13 extends Thread{
	public void run(){
		int a=3;
		for (int k = 0; k< a; k++)
		{
		System.out.println("Thread : "+Thread.currentThread().getId()+" is running thread in A");
				
			}
		System.out.println("EXit From A");
		}
		
	}

class q13B extends Thread{
public void sleep(){
int g=3;
for (int k = 0; k < g; k++)
{
System.out.println("Thread : "+Thread.currentThread().getId()+" is running thread IN B");
		
	}
System.out.println("EXit From B");
}

}
class q13C extends Thread {

public void waiit(){
int v=3;
for (int j = 0; j < v; j++)
{
System.out.println("Thread : "+Thread.currentThread().getId()+" is running thread IN c");
	
}
System.out.println("EXit From C Thread");
}


}
