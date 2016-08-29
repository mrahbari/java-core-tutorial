package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by mrahbari on 06/09/2015.
 */
public class TestExecutorRunnableClass {

    public synchronized static void main(String[] argv){

        // first way to use thread
        RunnableClass rb = new RunnableClass();
        ExecutorService executorService = Executors.newFixedThreadPool(100);  //newSingleThreadScheduledExecutor();//
        executorService.submit(rb);
        executorService.submit(rb);
        executorService.submit(rb);
        executorService.shutdown();

        for (int j=0; j<=100;j++){
            System.out.println("Test Runnable method no:" + j);
        }
    }
}
