package com.le.viet.stack.linkedlistbased;

/**
 * LIFO | O(1)
 * Created by VTL on 12/3/17.
 */
public class StackLinkedListBasedClient {
    public static void main(String[] args) {
        Employee jame = new Employee("Jane", "Jones", 123);
        Employee john = new Employee("John", "Doe", 4567);
        Employee mary = new Employee("Mary", "Smith", 22);
        Employee mike = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedStack stack  = new LinkedStack();
        stack.push(jame);
        stack.push(john);
        stack.push(mary);
        stack.push(mike);
        stack.push(billEnd);


//        stack.printStack();

//        System.out.println(stack.peek());
//        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());


    }
}
