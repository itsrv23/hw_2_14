package ru.itsrv23.hw214;

import ru.itsrv23.hw214.mysimlearraylist.StringList;
import ru.itsrv23.hw214.mysimlearraylist.MyArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        StringList list = new MyArrayList();
        for (int i = 0; i < 6; i++) {
            list.add(String.valueOf(i));
        }
        list.print();
        System.out.println("list.getCapacity() = " + list.getCapacity());
        StringList list2 = new MyArrayList(1);
        for (int i = 0; i < 6; i++) {
            list2.add(String.valueOf(i));
        }
        System.out.println("list2.getCapacity() = " + list2.getCapacity());
        list2.print();
        System.out.println("list2.equals(list): " + list2.equals(list));
        list2.add(0, "-1");
        list2.remove("0");
        list2.remove(5);
        System.out.println("list2.contains(\"5\") = " + list2.contains("5"));
        System.out.println("list2.contains(\"4\") = " + list2.contains("4"));
        System.out.println("list2.lastIndexOf(\"5474\") = " + list2.lastIndexOf("5474"));
        list2.print();
        System.out.println("list2.equals(list): " + list2.equals(list));
        System.out.println("list2.isEmpty() = " + list2.isEmpty());
        list2.clear();
        System.out.println("list2.isEmpty() = " + list2.isEmpty());
        System.out.println("Arrays.toString(list.toArray()) = " + Arrays.toString(list.toArray()));
        System.out.println("list.getCapacity() = " + list.getCapacity());


    }

}
