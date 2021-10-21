package com.deo;

public interface AwesomeList<T> {
    void add(T element);


    T get(int index);

    void remove(int index);

    int size();

    void set(int index, T element);

    boolean isEmpty();

    void sort();

}
