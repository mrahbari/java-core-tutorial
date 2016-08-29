package multithreading;

/**
 * Created by mrahbari on 06/09/2015.
 */
public class RunnableClass implements Runnable{


    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

        System.out.println("Entered:" + Thread.currentThread().getId());

        for (int i=0; i<=100; i++)
            System.out.println("Interface Way: Runnable method no " + i);

        System.out.println("Exited:" + Thread.currentThread().getId());
    }
}
