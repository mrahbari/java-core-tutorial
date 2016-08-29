package multithreading;

/**
 * Created by mrahbari on 06/09/2015.
 */
public class TestInterfaceRunnableClass {
    public static void main(String[] argv){

        // first way to use thread
        RunnableClass rb = new RunnableClass();
        Thread thread = new Thread(rb);
        thread.start();

        for (int j=0; j<=100;j++){
            System.out.println("Test Runnable method no:" + j);
        }

        // second way to run thread

    }
}
