package ss11_DSA_Stack_Queue.Bai_tap.Queue;

public class MyQueueController {
    public static void main(String args[])
    {
        // Create a queue and initialize front and rear
        MyQueue  myQueue = new MyQueue();
        MyQueue myQueue1 = new MyQueue();
        myQueue1 .front = myQueue .rear =  null;

        // Inserting elements in Circular Queue
        myQueue.enQueue(14);
        myQueue.enQueue(22);
        myQueue.enQueue(6);

        // Display elements present in Circular Queue
        myQueue.displayQueue();

        // Deleting elements from Circular Queue
        System.out.printf("\nDeleted value = %d", myQueue.deQueue());
        System.out.printf("\nDeleted value = %d\n", myQueue.deQueue());

        // Remaining elements in Circular Queue
       myQueue.displayQueue();

       myQueue.enQueue( 9);
       myQueue.enQueue(20);
       myQueue.displayQueue();
    }
}
