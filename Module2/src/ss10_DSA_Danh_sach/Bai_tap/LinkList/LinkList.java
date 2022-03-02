package ss10_DSA_Danh_sach.Bai_tap.LinkList;

public class LinkList<E> {
    private class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
        public  Object getData(){
            return this.data;
        }
    }
    // Phần tử đầu tiên trong dannh sách
    private Node head;
    // Số phần tử trong dang sách
    private int numNodes = 0;

    public LinkList() {
    }
    public void addFirst(E element){
        //khai báo 1 biến trỏ đến giá trị của head
        Node temp = head;
        //biến head nhận giá trị của 1 node mới
        head = new Node(element);
        // head.next trỏ đến temp
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element){
        //khai báo biến temp trỏ đến head
        Node temp = head;
        //sẽ cho con trỏ chạy đến phần tử cuối cùng của dang sách
        while (temp.next != null){
            temp = temp.next;
        }

    }
}
