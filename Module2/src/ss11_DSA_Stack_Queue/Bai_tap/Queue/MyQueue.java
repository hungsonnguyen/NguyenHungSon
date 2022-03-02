package ss11_DSA_Stack_Queue.Bai_tap.Queue;

import java.util.PriorityQueue;

public class MyQueue {
    public Node front;
    public Node rear;

    public MyQueue(Node front, Node rear) {
        this.front = front;
        this.rear = rear;
    }

    public MyQueue() {
    }

    public void enQueue(int value) {
        Node temp = new Node();
        temp.data = value;
        if (this.front == null)
            this.front = temp;
        else
            this.rear.next = temp;

        this.rear = temp;
        this.rear.next = this.front;
    }

    public int deQueue() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }

        // If this is the last node to be deleted
        int value; // Value to be dequeued
        if (this.front == this.rear) {
            value = this.front.data;
            this.front = null;
            this.rear = null;
        } else  // There are more than one nodes
        {
            Node temp = this.front;
            value = temp.data;
            this.front = this.front.next;
            this.rear.next = this.front;
        }

        return value;
    }


    // Function displaying the elements of Circular Queue
    public void displayQueue() {
        Node temp = this.front;
        System.out.println("Elements in Circular Queue are:");
        while (temp.next != this.front) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

//    public static void main(String args[])
//    {
//        // Create a queue and initialize front and rear
//        MyQueue  q = new MyQueue();
//        q .front = q .rear =  null;
//
//        // Inserting elements in Circular Queue
//        enQueue(q, 14);
//        enQueue(q, 22);
//        enQueue(q, 6);
//
//        // Display elements present in Circular Queue
//        displayQueue(q);
//
//        // Deleting elements from Circular Queue
//        System.out.printf("Deleted value = %d \n", deQueue(q));
//        System.out.printf("Deleted value = %d\n", deQueue(q));
//
//        // Remaining elements in Circular Queue
//        displayQueue(q);
//
//        enQueue(q, 9);
//        enQueue(q, 20);
//        displayQueue(q);
//
//    }
}


//    public static void main(String[] args) {
//        PriorityQueue queue = new PriorityQueue();
//        Node node = new Node(10);
//        Node node1 = new Node(20);
//        Node node2 = new Node(30);
//        Node node3 = new Node(40);
//        Node node4 = new Node(50);
//    }



