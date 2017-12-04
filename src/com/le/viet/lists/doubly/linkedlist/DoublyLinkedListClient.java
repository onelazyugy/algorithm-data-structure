package com.le.viet.lists.doubly.linkedlist;

/**
 * Each node has a reference to the previous and next node. with this, you can add item to either
 * the head or to the tail node and still have O(1) which is constant
 * Created by VTL on 12/3/17.
 */
public class DoublyLinkedListClient {
    public static void main(String[] args) {
        doublyLinkedList();
    }

    public static void doublyLinkedList() {
        Employee jame = new Employee("Jane", "Jones", 123);
        Employee john = new Employee("John", "Doe", 4567);
        Employee mary = new Employee("Mary", "Smith", 22);
        Employee mike = new Employee("Mike", "Wilson", 3245);


        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(jame);
        list.addToFront(john);
        list.addToFront(mary);
        list.addToFront(mike);

        list.printList();
        System.out.println(list.getSize());

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);

        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());
    }
}
