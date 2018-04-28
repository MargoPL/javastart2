package pl.sda.javastart2.exeptions;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class TryWithResourcesExample {
    private static final Logger LOGGER =
            Logger.getLogger(TryWithResourcesExample.class.getSimpleName());

    static {
        try {
            LOGGER.addHandler((new FileHandler("D:\\logs.txt")));
        } catch (IOException e) {
            System.out.println("Przykro mi");
        }
    }

    public static void main(String[] args) {
        tryWithresourcesOldWay();
        tryWithresourcesNewWay();
    }

    private static void tryWithresourcesNewWay() {
        try (MyResource myResource = new MyResource()) {
            myResource.doSomeWork("Odczyt danych po nowemu");
        } catch (Exception e) {
            LOGGER.severe("Odczyt danych po nowemu");
        }
    }

    private static void tryWithresourcesOldWay() {
        MyResource myResource = new MyResource();
        try {
            myResource.doSomeWork("Praca");
        } catch (Exception e) {
            System.out.println("Expeption podzas wykonywania zadania");
        } finally {
            try {
                myResource.close();
            } catch (Exception e) {
                System.out.println("Exeption podczas zamykania połaczenia");
            }
        }


    }
}
