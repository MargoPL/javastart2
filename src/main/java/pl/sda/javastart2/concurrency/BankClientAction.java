package pl.sda.javastart2.concurrency;

import java.util.Random;

public class BankClientAction implements Runnable{
    @Override
    public void run() {
        Random random = new Random();
        int sum = random.nextInt(20);
        Bank.withdrow(sum);

        int threadSleepTime = random.nextInt(200);

        try {
            Thread.sleep(threadSleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Bank.giveBack(sum);
    }
}
