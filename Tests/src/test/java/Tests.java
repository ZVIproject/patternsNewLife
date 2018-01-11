/**
 * Created by vladzarovnyi on 11/30/17.
 */
import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Tests {
    final int N = 5;

    @Test
    public void tw() throws InterruptedException {

        ExecutorService exec = Executors.newFixedThreadPool(N * 10);

        final CountDownLatch latchStart = new CountDownLatch(1);

        final CountDownLatch latchStop = new CountDownLatch(N);

        for (int i = 0; i < N; ++i) {
            MyAction mya = new MyAction(i,
                    latchStart,
                    latchStop
            );
            exec.execute(mya::doAction);

        }
        Thread.sleep(1000L);
        System.out.println("START");
        latchStart.countDown();
        System.out.println("AWAIT");

        while (!latchStop.await(10L, TimeUnit.MILLISECONDS)) {
            System.out.println("...");
        }
        System.out.println("DONE");

    }

    static class MyAction {
        private final int i;
        private final CountDownLatch latchStart;
        private final CountDownLatch latchStop;

        public MyAction(int i, CountDownLatch latchStart, CountDownLatch latchStop) {
            this.i = i;
            this.latchStart = latchStart;
            this.latchStop = latchStop;
        }

        public void doAction() {
            try {
                System.out.printf("ACTION %s A%n", i);

                latchStart.await();
                Thread.sleep(10L);
                System.out.printf("ACTION %s Z%n", i);
                Thread.sleep(10L);
                latchStop.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}