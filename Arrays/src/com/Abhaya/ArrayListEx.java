package com.Abhaya;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
//        list.add(12);
//        list.add(23);
//        list.add(45);
//        list.add(78);
//        list.add(15);
//        list.add(29);
//        list.add(65);
//        list.add(89);
//        list.add(54);
//        list.add(36);
//        list.add(69);
//        list.add(99);

        System.out.println(list);
//        list.set(4,1000);
//        System.out.println(list);
//        System.out.println(list.contains(1000));
//        list.remove(10);
//        System.out.println(list);

        for (int i  = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //for getting an item at index i :
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + "  ");  // we cannot do something like list[0], we have to use list.get(index);
        }
        System.out.print(list);

    }
}
