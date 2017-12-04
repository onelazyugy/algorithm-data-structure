package com.le.viet.queue;

import java.util.NoSuchElementException;

/**
 * Queue backed by an array. FIFO, always add item to the back of the queue
 * Created by VTL on 12/3/17.
 */
public class ArrayQueue {
    private Employee[] queue;
    private int front;
    //point to the next available position in the queue
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if(back == queue.length) {
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = employee;
        back++;
    }

    //always remove an item from front of queue
    public Employee remove() {
        if(siae() == 0) {
            throw new NoSuchElementException();
        }
        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if(siae() == 0) {
            front = 0;
            back = 0;
        }
        return employee;
    }

    public Employee peek() {
        if(siae() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];

    }

    public int siae() {
        return back - front;
    }

    public void printQueue() {
        for(int i = front; i < back; i++){
            System.out.println(queue[i]);
        }
    }

}
