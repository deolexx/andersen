package com.deo;


/**
 *
 * @param <T> type of the param, T should extend Comparable interface
 * @author Serhii Lukianeko
 */
public class QuickSort<T extends Comparable<? super T>>{

    /**
     * Sorts this list according to the natural order
     * @param list - input list with unsorted data
     * @param <T> generic type
     */
    public static <T extends Comparable<? super T >> void sort(AwesomeList<T> list){
        quickSort(list,0,list.size()-1);
    }

    /**
     * Use recursion to divide array into smaller parts
     * @param array - list to sort
     * @param from - beginning index for the sort algorithm
     * @param to - ending index for the sort algorithm
     * @param <T> - genetic parameter type
     */
    private  static <T extends Comparable<? super T >> void quickSort(AwesomeList<T> array, int from, int to) {
        //list from.................to
        if(from<to){
            //split list in half
            //from.............divideIndex..............to
            int divideIndex = partition(array,from,to);
            //recursively call the quickSort method on both sides
            //from..............divideIndex-1
            quickSort(array,from,divideIndex-1);
            //divideIndex-1................to
            quickSort(array,divideIndex,to);
        }

    }

    /**
     * Returns index of the element to split the list
     * @param array - list to split
     * @param from - beginning index
     * @param to - end index
     * @param <T> - generics param type
     * @return - returns int value of the index used to further recursive calls
     */
    private  static  <T extends Comparable<? super T >> int partition(AwesomeList<T> array, int from, int to) {
        //create two wariables
        int rigthIndex = to;
        int leftIndex = from;
        //chose element to
        T pivot = array.get(from+(to-from)/2);
        while (leftIndex<=rigthIndex){
            while (array.get(leftIndex).compareTo(pivot)<0){
                leftIndex++;
            }
            while (array.get(rigthIndex).compareTo(pivot)>0){
                rigthIndex--;
            }
            if(leftIndex<=rigthIndex){
                swap(array,rigthIndex,leftIndex);
                leftIndex++;
                rigthIndex--;
            }
        }
        return leftIndex;
    }

    /**
     * Swaps two elements
     * @param list - list to operate with
     * @param index1 - index of first elemetn
     * @param index2 - index of the second element
     * @param <T> - generic type
     */
    private static <T extends Comparable<? super T >> void swap(AwesomeList<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,temp);
    }
}

