package ss10_DSA_Danh_sach.Thuc_hanh.BasicList;

public class MyListTest {
    public static void main(String[] args) {
        Mylist<Integer> listInterger = new Mylist<Integer>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(4);
        listInterger.add(5);
        System.out.println("element 4: "  + listInterger.get(3));
        System.out.println("element 2: "  + listInterger.get(1));
        System.out.println("element 1: "  + listInterger.get(0));

//        listInterger.get(6);
//        System.out.println("element 6: "  + listInterger.get(6));

//        listInterger.get(-1);
//        System.out.println("element -1: " + listInterger.get(-1));
    }
}
