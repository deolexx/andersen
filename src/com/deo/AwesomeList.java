package com.deo;

/**
 * Resizable-array implementation
 * @param <T> the type of elements in this list
 * @author Serhii Lukianeko
 */
public class AwesomeList <T>{
    /**
     * Default initial capacity
     */
    private static final int DEFAULT_CAPACITY = 10;
    /**
     * Empty array instance used for empty instances
     */
    private static final Object[]  EMPTY_ELEMENTDATA = {};
    /**
     * Shared empty array used for default sized empty instances
     */
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    /**
     * Buffer array into which elements of the AwesomeList are stored.
     */
    transient Object [] elementData;

    /**
     * The size of the AwesomeList (number of elements it contains)
     */
    private int size;

    public AwesomeList(int initialCapacity){
        if(initialCapacity>0){
            this.elementData = new Object[initialCapacity];
        }else if(initialCapacity==0){
            this.elementData = EMPTY_ELEMENTDATA;
        }else {
            throw new IllegalArgumentException("Illegal capacity value: " + initialCapacity);
        }

    }


}
