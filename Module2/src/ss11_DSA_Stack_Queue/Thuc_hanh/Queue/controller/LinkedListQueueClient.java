package ss11_DSA_Stack_Queue.Thuc_hanh.Queue.controller;

import ss11_DSA_Stack_Queue.Thuc_hanh.Queue.service.MyLinkedListQueue;
import ss11_DSA_Stack_Queue.Thuc_hanh.Stack.service.MyGenericStack;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        System.out.println(queue.dequeue().key);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}

