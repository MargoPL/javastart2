package pl.sda.javastart2.collection;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListVsSet {
    public static void main(String[] args) {
        removeAllCompare();
    }

    private static void removeAllCompare() {
//        setRemoveList();
//        listRemoveSet();
        checkIfCollectionsContains();
    }

    private static void checkIfCollectionsContains() {
        Set<Book> bookSet = new HashSet<>();
        ArrayList<Book> bookList = new ArrayList<>();
        int howManyBooks = 10_500_000;
        for (int i = 0; i < howManyBooks; i++) {
            bookSet.add(new Book(i));
        }
        for (int i = 0; i < howManyBooks; i++) {
            bookList.add(new Book(i));
        }
        long start = System.currentTimeMillis();
        bookList.contains(new Book(howManyBooks));
        long finish = System.currentTimeMillis();
        long start1 = System.currentTimeMillis();
        bookSet.contains(new Book(howManyBooks));
        long finish1 = System.currentTimeMillis();
        System.out.println("List: " + (finish - start) + "ms " + "Set: " + (finish1 - start1) + "ms");
    }

    private static void listRemoveSet() {
        Set<Book> bookSet = new HashSet<>();
        ArrayList<Book> bookList = new ArrayList<>();
        int howManyBooks = 500_000;
        for (int i = 0; i < howManyBooks; i++) {
            bookSet.add(new Book(i));
        }
        for (int i = 0; i < howManyBooks + 1; i++) {
            bookList.add(new Book(i));
        }
        long start = System.currentTimeMillis();
        bookList.removeAll(bookSet);
        long finish = System.currentTimeMillis();
        System.out.println("bookList.removeAll(bookSet): " + (finish - start) + "ms");
    }

    private static void setRemoveList() {
        Set<Book> bookSet = new HashSet<>();
        ArrayList<Book> bookList = new ArrayList<>();
        int howManyBooks = 500_000;
        for (int i = 0; i < howManyBooks; i++) {
            bookSet.add(new Book(i));
        }
        for (int i = 0; i < howManyBooks + 1; i++) {
            bookList.add(new Book(i));
        }
        long start = System.currentTimeMillis();
        bookSet.removeAll(bookList);
        long finish = System.currentTimeMillis();
        System.out.println("bookSet.removeAll(bookList): " + (finish - start) + "ms");
    }
}
