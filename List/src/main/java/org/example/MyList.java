package org.example;

public interface MyList<E> {

    int size();
    void add(E e);
    void add(int index, E e);
    E get(int index);
    E remove(int index);
    E set(int index, E e);
    int indexOf(E e);
}
