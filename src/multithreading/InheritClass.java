package multithreading;

/**
 * Created by mrahbari on 06/09/2015.
 */
public class InheritClass extends Thread {

    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {

        for (int i=0; i<=100; i++)
            System.out.println("Inherit Thread no " + i);

        super.run();
    }
}
