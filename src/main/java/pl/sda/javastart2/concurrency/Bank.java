package pl.sda.javastart2.concurrency;

public class Bank {

    private static int balance = 1000;

    public static int operations;

    public synchronized static void withdrow(int howMuch){
        balance = balance - howMuch;
        System.out.println(Thread.currentThread().getName()+ "Stan konta po wypłacie: " + balance);
    }

    public synchronized static void giveBack(int howMuch){
        balance = balance + howMuch;
        System.out.println(Thread.currentThread().getName()+ "Stan konta po wpłacie: " + balance);
        operations++;
    }
}
