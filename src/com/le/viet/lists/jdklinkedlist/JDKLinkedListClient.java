package com.le.viet.lists.jdklinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by VTL on 12/3/17.
 */
public class JDKLinkedListClient {
    public static void main(String[] args) {
        Employee jame = new Employee("Jane", "Jones", 123);
        Employee john = new Employee("John", "Doe", 4567);
        Employee mary = new Employee("Mary", "Smith", 22);
        Employee mike = new Employee("Mike", "Wilson", 3245);

        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(jame);
        list.addFirst(john);
        list.addFirst(mary);
        list.addFirst(mike);
        printList(list);

        list.addLast(billEnd);
        printList(list);

        list.removeFirst();
        printList(list);

        list.removeLast();
        printList(list);
    }

    public static void printList(LinkedList<Employee> list) {
        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()){
            System.out.print(iter.next());
            System.out.print("<=> ");
        }
        System.out.println("null");
    }
}
