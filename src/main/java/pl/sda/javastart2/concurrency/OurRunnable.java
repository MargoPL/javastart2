package pl.sda.javastart2.concurrency;

import java.util.concurrent.TimeUnit;

public class OurRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Specjalna nowa klasa");

        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName() + " Skończyłem długą czynnosć");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
