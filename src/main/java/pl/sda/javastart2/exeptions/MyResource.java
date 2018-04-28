package pl.sda.javastart2.exeptions;

public class MyResource implements  AutoCloseable{

    public void doSomeWork(String work){
        System.out.println("Doing" + work);
        throw new RuntimeException("Exeption during work");
    }

    public void close(){
        System.out.println("Closing resource");
        throw new RuntimeException("Exeption during closing");
    }
}
