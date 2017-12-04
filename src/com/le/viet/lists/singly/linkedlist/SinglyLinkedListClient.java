package com.le.viet.lists.singly.linkedlist;

/**
 * LinkedList is not backed by an array. Each item in the list is aware of another item in the list which is why it is called linked list
 * n number of item can be added to the linked list. There is no set lenght for it
 * SINGLY LINKED LIST
 * Always insert new item in front of list, therefore O(1) which is constant
 * Delete item by move head to next item, therefore O(1) which is constant
 * Created by VTL on 12/3/17.
 */
public class SinglyLinkedListClient {
    public static void main(String[] args) {
        singlyLinkedList();
    }

    public static void singlyLinkedList() {
       Employee jame = new Employee("Jane", "Jones", 123);
       Employee john = new Employee("John", "Doe", 4567);
       Employee mary = new Employee("Mary", "Smith", 22);
       Employee mike = new Employee("Mike", "Wilson", 3245);
       EmployeeSinglyLinkedList list = new EmployeeSinglyLinkedList();

       System.out.println(list.isEmpty());

       list.addToFront(jame);
       list.addToFront(john);
       list.addToFront(mary);
       list.addToFront(mike);

       list.printList();
       System.out.println(list.getSize());

       list.removeFromFront();

       list.printList();
       System.out.println(list.getSize());
    }
}
