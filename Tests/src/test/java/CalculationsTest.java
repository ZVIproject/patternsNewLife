import org.junit.Test;

import java.util.concurrent.*;

/**
 * Created by vladzarovnyi on 11/30/17.
 */
public class CalculationsTest {

    private int threadCount = 2;
    private CountDownLatch latchStart;

    @Test
    public void test() throws InterruptedException {

        latchStart = new CountDownLatch(1);

        BlockingQueue<Runnable> queue = new SynchronousQueue<>();

        ExecutorService executorService = new ThreadPoolExecutor(2, 2, 0L, TimeUnit.MICROSECONDS, queue);

        threadsExecuting(executorService);

    }

    private void threadsExecuting(ExecutorService executorService) throws InterruptedException {

        startThreadsExecuting(executorService);
        flushSecondPartOfThreads();
        executorService.shutdown();

        System.out.println(executorService.awaitTermination(20L, TimeUnit.MICROSECONDS));
    }

    private void flushSecondPartOfThreads() {

        System.out.println("Start");
        latchStart.countDown();
    }

    private void startThreadsExecuting(ExecutorService executorService) {
        for (int i = 0; i < threadCount; i++) {
            executorService.execute(Calculation.initializeThreadsProperties(latchStart)::doCalculations);
        }
    }
}

class Calculation {

    private CountDownLatch latchStart;

    private Calculation(CountDownLatch latchStart) {
        this.latchStart = latchStart;
    }

    public static Calculation initializeThreadsProperties(CountDownLatch latchStart) {
        return new Calculation(latchStart);
    }

    public void doCalculations() {

        try {
            System.out.println("--------");
            Thread.sleep(10);

//            latchStart.await();

            System.out.println("Continue");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}