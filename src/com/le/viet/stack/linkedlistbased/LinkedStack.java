package com.le.viet.stack.linkedlistbased;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * LIFO | O(1)
 * A stack implementation backed by a doubly linked list. Only allow pop. push, and peek operations.
 * Created by VTL on 12/3/17.
 */
public class LinkedStack {
    private LinkedList<Employee> stack;

    public LinkedStack() {
        this.stack = new LinkedList<Employee>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Employee> iterator = stack.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
