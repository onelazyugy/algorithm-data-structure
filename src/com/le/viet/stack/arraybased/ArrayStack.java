package com.le.viet.stack.arraybased;

import java.util.EmptyStackException;

/**
 * Created by VTL on 12/3/17.
 */
public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        this.stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        //O(n) because resize array
        if(top == stack.length) {
            // need to resize the backing aray
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;

        }
        stack[top++] = employee;//O(1)
    }

    public Employee pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        Employee employee = stack[--top];//decrement top and use it
        stack[top] = null;
        return employee;
    }

    //see the item currently on the top of the stack
    public Employee peek(){
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public void printStack() {
        for(int i = top - 1; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }



    public boolean isEmpty() {
        return top == 0;
    }
}
