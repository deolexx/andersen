package com.deo;

/**
 * Resizable-array implementation
 *
 * @param <T> the type of elements in this list
 * @author Serhii Lukianeko
 */
public class AwesomeArrayList<T extends Comparable<? super T>> implements AwesomeList<T> {

    /**
     * Default initial capacity for inner array
     */
    private static final int DEFAULT_SIZE = 10;


    /**
     * Inner array into which elements of the AwesomeList are stored.
     */
    private Object[] dataArray;


    /**
     * The size of the AwesomeList
     */
    private int size = 0;


    /**
     * Create empty list with default capacity of 10
     */
    public AwesomeArrayList() {
        this.dataArray = new Object[DEFAULT_SIZE];
    }


    /**
     * Add new element to the list
     *
     * @param element
     */
    @Override
    public void add(T element) {
        if (size == dataArray.length - 1) {
            resize(dataArray.length * 2);
        }
        dataArray[size++] = element;

    }

    /**
     * Get the element from AwesomeList
     *
     * @param index - index of the element to return
     * @return - the element in the specified position in this list
     * @throws IndexOutOfBoundsException - if the specified index not in array
     */
    @Override
    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index out of bounds :" + index);
        return (T) dataArray[index];
    }

    /**
     * Remove the element by its index
     *
     * @param index - index of the element to remove
     * @throws IndexOutOfBoundsException - if the specified index not in array
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds :" + index);
        } else {
            for (int i = index; i < size; i++) {
                dataArray[i] = dataArray[i + 1];
            }

            dataArray[size--] = null;
        }

    }

    /**
     * Resize the inner dataArray to specified capacity
     *
     * @param newLength - size of the new array
     */
    private void resize(int newLength) {
        Object[] elementDataNew = new Object[newLength];
        System.arraycopy(dataArray, 0, elementDataNew, 0, size);
        dataArray = elementDataNew;

    }

    /**
     * Returns the size of the AwesomeList (number of elements it contains)
     *
     * @return - the number of elements in current list
     */
    public int size() {
        return size;
    }

    /**
     * Returns true if list is empty
     *
     * @return - true if list is empty, else return false
     */
    public boolean isEmpty() {
        return this.size == 0;
    }


    /**
     * Sorts the list by its natural order
     */
    public void sort() {
        QuickSort.sort(this);
    }

    /**
     * Update the element with new value
     *
     * @param index   - index of the element to update
     * @param element - new value of the element
     */
    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds :" + index);
        } else {
            dataArray[index] = element;
        }


    }


}
