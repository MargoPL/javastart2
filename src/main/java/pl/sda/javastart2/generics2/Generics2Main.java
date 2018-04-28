package pl.sda.javastart2.generics2;

import pl.sda.javastart2.generics1.Apple;
import pl.sda.javastart2.generics1.Orange;

public class Generics2Main {

    public static void main(String[] args) {
        GenericFruitBox<Orange> orangeGenericFruitBox =
                new GenericFruitBox<>(new Orange());

        GenericFruitBox<Apple> appleGenericFruitBox =
                new GenericFruitBox<>(new Apple());
    }
}
