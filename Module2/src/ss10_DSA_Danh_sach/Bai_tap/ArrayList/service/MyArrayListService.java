package ss10_DSA_Danh_sach.Bai_tap.ArrayList.service;

public interface MyArrayListService<E> {
    int size();
    void clear();
    boolean add(E element);
    void add(E element, int index);
    void ensureCapcity(int minCapacity);
    E get(int index);
    int indexOf(E element);
    boolean contains(E element);
    MyArrayList<E> clone();
    E remove(int index);
}
