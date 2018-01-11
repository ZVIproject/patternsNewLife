import org.junit.Test;

import java.util.concurrent.SynchronousQueue;

/**
 * Created by vladzarovnyi on 12/5/17.
 */
public class SynchQ {

    private boolean stop = false;

    @Test
    public void threadsTest() throws InterruptedException {
        SynchronousQueue synchronousQueue = new SynchronousQueue();

        new Thread(new Faster(synchronousQueue)).start();
        new Thread(new Slower(synchronousQueue)).start();


        Thread.sleep(10000);
    }

    private class Faster implements Runnable {

        private SynchronousQueue synchronousQueue = null;

        public Faster(SynchronousQueue synchronousQueue) {
            this.synchronousQueue = synchronousQueue;
        }

        @Override
        public void run() {
            try {

                for (int i = 0; i < 3; i++) {
                    Thread.sleep(3000);
                    synchronousQueue.put(i);

                }

                stop = true;

                System.out.println("++++++");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private class Slower implements Runnable {

        private SynchronousQueue synchronousQueue = null;

        public Slower(SynchronousQueue synchronousQueue) {
            this.synchronousQueue = synchronousQueue;
        }

        @Override
        public void run() {
            try {
                //System.out.println("checking");
                while (!stop) {
                    System.out.println("checking");
                    System.out.println(synchronousQueue.take());
                    System.out.println("------");
                }
                System.out.println("finish");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
