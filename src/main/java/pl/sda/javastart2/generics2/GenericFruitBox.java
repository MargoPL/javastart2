package pl.sda.javastart2.generics2;

public class GenericFruitBox<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public GenericFruitBox(T value) {

        this.value = value;
    }
}
