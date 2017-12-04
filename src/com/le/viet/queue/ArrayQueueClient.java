package com.le.viet.queue;

/**
 * Created by VTL on 12/3/17.
 */
public class ArrayQueueClient {
    public static void main(String[] args) {
        Employee jame = new Employee("Jane", "Jones", 123);
        Employee john = new Employee("John", "Doe", 4567);
        Employee mary = new Employee("Mary", "Smith", 22);
        Employee mike = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(jame);
        queue.add(john);
        queue.add(mary);
        queue.add(mike);
        queue.add(billEnd);

//        queue.printQueue();

        queue.remove();
        queue.remove();
//        queue.printQueue();

        System.out.println(queue.peek());
        queue.printQueue();
    }
}
