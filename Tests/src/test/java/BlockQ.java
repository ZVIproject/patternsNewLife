import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by vladzarovnyi on 12/4/17.
 */
public class BlockQ {

    private boolean stop = false;

    @Test
    public void threadsTest() throws InterruptedException {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);

        SynchronousQueue<Integer> synchronousQueue = new SynchronousQueue<>();
        int []i = {0};

        Thread tConsumer = new Thread(new Consumer(blockingQueue, synchronousQueue));


        Thread tProvider = new Thread(new Provider(blockingQueue));

        tProvider.setDaemon(true);

        tProvider.start();
        tConsumer.start();

        System.out.println(synchronousQueue.take());
    }

   private class Provider implements Runnable {

        private BlockingQueue blockingQueue = null;

        public Provider(BlockingQueue blockingQueue) {
            this.blockingQueue = blockingQueue;
        }

        @Override
        public void run() {
            try {
                for (int i = 2; i < 6; i++) {
                    Thread.sleep(500);
                    blockingQueue.put(i);
                }

                stop = true;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private class Consumer implements Runnable {

        private BlockingQueue<Integer> blockingQueue = null;

        private SynchronousQueue<Integer> synchronousQueue;

        public Consumer(BlockingQueue<Integer> blockingQueue, SynchronousQueue<Integer> synchronousQueue) {
            this.blockingQueue = blockingQueue;
            this.synchronousQueue = synchronousQueue;
        }

        @Override
        public void run() {
            try {
               workingWithQueue();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private void workingWithQueue() throws InterruptedException {
            Integer result = 0;
            while (!stop) {
                addAndShowQueueElement(result);
            }

            synchronousQueue.put(result);
        }

        private Integer addAndShowQueueElement(Integer result) throws InterruptedException {
            Integer x = blockingQueue.take();
            result += x;
            System.out.println(x);

            return result;
        }
    }
}
