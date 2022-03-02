package ss10_DSA_Danh_sach.Bai_tap.ArrayList.service;

import java.util.Arrays;

public class MyArrayList<E> implements MyArrayListService<E>{
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity " + capacity);
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapcity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IndexOutOfBoundsException("index " + index);
        } else if (elements.length == size) {
            this.ensureCapcity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    public void ensureCapcity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity" + minCapacity);
        }
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (elements[i].equals(element)) {
                index = i;
            }
        }
        return index;
    }

    public boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    public MyArrayList<E> clone() {
        MyArrayList<E> newMyArrayList = new MyArrayList<>();
        newMyArrayList.elements = Arrays.copyOf(this.elements, this.size);
        newMyArrayList.size = this.size;
        return newMyArrayList;
    }
    public E remove(int index){
        if (index<0 || index > size){
            throw new IllegalArgumentException("index" + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size -1; i++) {
            elements[index] = elements[index =1 ];
        }
        elements[size-1] = null;
        size--;
        return element;
    }
}
