package com.bl.demolinkedlist;

import java.util.*;
public class LinkedListExample {
    public static void main(String args[])
    {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Swapnil");
        linkedList.add("Surendra");
        linkedList.add(1, "is a friend of");

        linkedList.remove(2);
        linkedList.add(2, "Bhushan");

        linkedList.removeLast();

        linkedList.addLast("Jayesh");

        linkedList.add(3,", Punit");

        linkedList.add(4, "and sardar");

        // Using the Get method and the
        // for loop
        for (int i = 0; i < linkedList.size(); i++) {

            System.out.print(linkedList.get(i) + " ");
        }

        System.out.println();

        // Using the for each loop
        for (String str : linkedList)
            System.out.print(str + " ");
    }
}

