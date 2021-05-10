

class MultithreadingDemo extends Thread {
  int timesRun;
  int timesInsideConstructor = 0;
  MultithreadingDemo()
  {
    timesRun = 1;
    timesInsideConstructor ++;
    System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running, run: " + timesRun + " times timesInsideConstructor = " + timesInsideConstructor);
  }

    public void run()
    {
        try {
            // Displaying the thread that is running
            timesRun++;
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running, run: " + timesRun + " times");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

public class Main {
    public static void main(String[] args)
    {
        MultithreadingDemo object1
                = new MultithreadingDemo();
        object1.start();
        object1.run();

        // MultithreadingDemo object2
        //         = new MultithreadingDemo();
        // object2.start();
        // object2.run();

        
    }
}