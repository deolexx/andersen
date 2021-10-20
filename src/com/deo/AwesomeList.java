package com.deo;

/**
 * Resizable-array implementation
 *
 * @param <T> the type of elements in this list
 * @author Serhii Lukianeko
 */
public class AwesomeList<T> {

    /**
     * Default initial capacity
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Empty array instance used for empty instances
     */
    private static final Object[] EMPTY_ELEMENTDATA = {};

    /**
     * Shared empty array used for default sized empty instances
     */
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    /**
     * Buffer array into which elements of the AwesomeList are stored.
     */
    transient Object[] elementData;

    /**
     * The size of the AwesomeList (number of elements it contains)
     */
    private int size;

    /**
     * Create empty list with default capacity of 10
     */
    public AwesomeList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    /**
     * Create empty list with specified capacity
     *
     * @param initialCapacity initial capacity of the list
     * @throws IllegalArgumentException if the specified capacity is negative
     */
    public AwesomeList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal capacity value: " + initialCapacity);
        }
    }

    /**
     * Add new element to the list
     * @param element
     */
    public void add(T element) {
        grow();
        elementData[size] = element;
        size++;

    }

    /**
     * Get the element from AwesomeList
     * @param index
     * @return
     */
    public T get(int index) {
        return null;
    }

    /**
     * Remove the element by its index
     * @param index
     */
    public void remove(int index) {
    }

    /**
     * Increase size of an array
     */
    public void grow() {
        if (size == elementData.length) {
            Object[] elementDataNew = new Object[size * 3 / (2 + 1)];
            System.arraycopy(elementData, 0, elementDataNew, 0, size);
            elementData = elementDataNew;

        }
    }

}
