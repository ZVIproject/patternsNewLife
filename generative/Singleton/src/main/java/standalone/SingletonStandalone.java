package standalone;

import component.pattern.Singleton;

/**
 * Created by vladzarovnyi on 11/29/17.
 */
public class SingletonStandalone extends Thread {

    static volatile int i = 1;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new SingletonStandalone());
        Thread thread2 = new Thread(new SingletonStandalone());

        thread1.start();
        thread2.start();

        System.out.println("program is finished");
    }


    @Override
    public void run() {
     int q = ++i;
        Singleton singleton = Singleton.getInstance(""+q);
        System.out.println(singleton.getValue());
    }
}
