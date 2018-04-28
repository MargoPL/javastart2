package pl.sda.javastart2.collection;


import pl.sda.javastart2.enums.Person;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayListExample {
    public static void main(String[] args) {
//        basicListOperations();
//        doesContainAll();
//        sortList();
//        basicExampleOfStream();
//        additionalsExampleOfStream();
//        legacyUseOfIterator();

    }

    private static void legacyUseOfIterator() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");

        System.out.println(arrayList);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        for (String s : arrayList) {
            System.out.println(s);
        }

        arrayList.stream().forEach(e-> System.out.println(e));
    }

    private static void basicListOperations() {
        //        ArrayList<String> firstList = new ArrayList<>();
        List<String> firstList = new ArrayList<>();
        System.out.println("Is list empty? " + firstList.isEmpty());
        System.out.println("List size " + firstList.size());
        firstList.add("JAVA");
        firstList.add("C++");
        firstList.add("PERL");
        firstList.add("PYTHON");

        System.out.println(firstList);

        System.out.println("Element at index 3: " + firstList.get(3));
        System.out.println("Does contain PERL? " + firstList.contains("PERL"));
        firstList.add(1, "JAVASCRIPT");
        System.out.println("After JAVASCRIPT added: " + firstList);
        System.out.println("List size " + firstList.size());

        firstList.remove("JAVA");
        System.out.println("After \"JAVA\" remove " + firstList);

        for (String value : firstList) {
            System.out.println(value);
        }
        firstList.stream().forEach(el -> System.out.println(el));

        System.out.println();

        for (String value : firstList) {
            boolean lastItem = (firstList.indexOf(value) + 1) == firstList.size();
            System.out.print(value + (lastItem ? "\n" : ", "));
        }
        System.out.println(firstList.stream().collect(Collectors.joining(", ")));
    }

    private static void doesContainAll() {
        List<String> firstList = new ArrayList<>();
        firstList.add("1");
        firstList.add("2");
        firstList.add("3");

        List<String> secondList = new ArrayList<>();
        secondList.add("1");
        secondList.add("2");

        System.out.println(firstList.containsAll(secondList));

        secondList.add("3");

        System.out.println(firstList.containsAll(secondList));

        secondList.add("4");

        System.out.println(firstList.containsAll(secondList));
        System.out.println(secondList.containsAll(firstList));

        System.out.println("Pierwsza lista: " + firstList);
        System.out.println("Druga lista: " + secondList);

        Collections.swap(firstList, 1, 2);

        System.out.println("Pierwsza lista: " + firstList);
        System.out.println("Druga lista: " + secondList);

    }

    private static void sortList() {
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(4L);
        list.add(3L);

        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }

    private static void basicExampleOfStream() {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(123, "Ania"));
        people.add(new Person(122, "Tomek"));
        people.add(new Person(15, "Ada"));
        people.add(new Person(12, "Ola"));

        Collections.sort(people);

        System.out.println(people);

        System.out.println(
                people.stream()
                        .sorted((a, b) -> a.getPesel().compareTo(b.getPesel()))
                        .map(e -> e.getName())
                        .collect(Collectors.joining(", ")));

        Predicate<Person> adam = person -> !person.getName().equals("Adam");
        List<Integer> pesels =
                people.stream()
                        .filter(adam)
                        .sorted((a, b) -> a.getName().compareTo(b.getName()))
                        .map(e -> e.getPesel())
                        .collect(Collectors.toList());
        System.out.println(pesels);

    }

    private static void additionalsExampleOfStream() {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(123, "Ania"));
        people.add(new Person(122, "Tomek"));
        people.add(new Person(15, "Ada"));
        people.add(new Person(12, "Ola"));

        Collections.sort(people);

        System.out.println(people);

        System.out.println(
                people.stream()
                        .sorted((a, b) -> a.getPesel().compareTo(b.getPesel()))
                        .map(e -> e.getName())
                        .collect(Collectors.joining(", ")));

        Predicate<Person> adam = person -> !person.getName().equals("Adam");
        Predicate<Person> monika = e -> e.getName().equals("Monika");
        List<Integer> pesels =
                people.stream()
                        .filter(monika)
                        .filter(adam)
                        .sorted((a, b) -> a.getName().compareTo(b.getName()))
                        .map(e -> e.getPesel())
                        .collect(Collectors.toList());
        System.out.println(pesels);
    }
}
