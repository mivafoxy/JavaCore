package thirdLesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[10];
        ints[0] = 1;
        int test = ints[0];

        // Collections
        ArrayList<String> listOfStrings = new ArrayList<>();
        ArrayList<Integer> listOfInts = new ArrayList<>(); // size = 0; capacity = 10;
        listOfInts.add(1); // size = 1; capacity = 10;
        listOfInts.add(2); // size = 2; capacity = 10;
        listOfInts.add(3); // size = 3; capacity = 10;

        try {
            listOfInts.remove(2);
            listOfInts.remove(2);
        } catch (IndexOutOfBoundsException ex) {
           // System.out.println("Поймали исключение");
        }


        ArrayList<Integer> secondListOfInts = new ArrayList<>(15);


        for (Integer secondListInt : secondListOfInts) {
           // System.out.println(secondListInt);
        }

        for (int i = 0; i < listOfInts.size(); i++) {
           // System.out.println(listOfInts.get(i));
        }

        // foreach
        for (Integer integer : listOfInts) {
            //System.out.println(integer);
        }

        listOfInts.remove(1);
// foreach
        for (Integer integer : listOfInts) {
           // System.out.println(integer);
        }
        // int -> Integer
        // byte -> Byte
        // short -> Short
        // char -> Character
        Integer a = 0;
        Integer b = 0;
        b = a;
        a = 1;
        // System.out.println(b);

        String s = "342342";
        String s1 = "sasd";
        s1 = s;
        s = "asdasd";
        // System.out.println(s1);

        Integer[] integers = new Integer[listOfInts.size()];
        listOfInts.toArray(integers);
        //doSomethingWith(integers);

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "qwerty");
        hm.put(1, "asdfgh");

        System.out.println(hm.get(1));
        hm.remove(1);

        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public static void doSomethingWith(Integer[] integers) {
        System.out.println("do smth with");
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    /*
    1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    Посчитать, сколько раз встречается каждое слово.

2. Написать простой класс «Телефонный Справочник»,
 который хранит в себе список фамилий и телефонных номеров.
 В этот телефонный справочник с помощью метода add() можно добавлять записи,
 а с помощью метода get() искать номер телефона по фамилии.
 Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
  тогда при запросе такой фамилии должны выводиться все телефоны.
     */
}
