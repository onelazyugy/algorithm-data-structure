package com.le.viet.stack.arraybased;

/**
 * Created by VTL on 12/3/17.
 */
public class StackArrayBasedClient {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

//        stack.printStack();

        System.out.println(stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());
    }
}
