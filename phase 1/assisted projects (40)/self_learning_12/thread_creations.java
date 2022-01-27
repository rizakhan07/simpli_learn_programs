package self_learning_12;


class MultithreadingDemo extends Thread {
    public void run()
    {
        try {
            System.out.println(
                    "Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}


public class thread_creations {
	public static void main(String[] args)
    {
        int n = 8;
        for (int i = 0; i < n; i++) {
            MultithreadingDemo object
                    = new MultithreadingDemo();
            object.start();
        }
    }


}
