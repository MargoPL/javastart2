package pl.sda.javastart2.homework1;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Generics1 {
    public static void main(String[] args) {

        ArrayList<Object> objects = Lists.newArrayList();
        List<String> listString = new ArrayList<>();
        List<Integer> listInteger = new ArrayList<>();
        listString.add("AC");
        listInteger.add(2);
//        sumGenericsNumbers(listString);
        sumGenericsNumbers(listInteger);
        sumGenericsNumbersWithStream(listInteger);


    }
    // Napisz generyczną metodę która przyjmuje Listę elementów
// będących numerami i zwraca ich sumę
    private static<T extends Number> Double sumGenericsNumbersWithStream(List<T> list) {
        return list.stream().mapToDouble(e->e.doubleValue()).sum();
    }

    private static <T extends Number> Long sumGenericsNumbers(List<T> list) {
        Long result =0L;
        for (T t : list) {
            result+= t.longValue();
        }
        return result;
    }
//    Napisz generyczną metodę która przyjmuje Listę jakichkolwiek
// elementów i wypisuje wszystkie elementy tej listy

}
