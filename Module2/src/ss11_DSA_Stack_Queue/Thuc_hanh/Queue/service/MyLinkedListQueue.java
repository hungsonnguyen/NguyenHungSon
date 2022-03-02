package ss11_DSA_Stack_Queue.Thuc_hanh.Queue.service;

import java.util.LinkedList;

public class MyLinkedListQueue<T> {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int data) {
        Node temp = new Node(data);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node dequeue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}
