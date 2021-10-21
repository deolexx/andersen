package com.deo;

import java.util.Arrays;

/**
 *
 *
 *
 *
 *
 *
 *
 */
public class QuickSort <T extends Comparable<? super T>>{

    public void quickSort(T []dataArray, int from, int to) {
    if(from<to){
        int divideIndex = partition(dataArray,from,to);


        quickSort(dataArray,from,divideIndex-1);

        quickSort(dataArray,divideIndex,to);
    }

    }

    private int partition(T[] dataArray, int from, int to) {
     int rigthIndex = to;
     int leftIndex = from;

     T pivot = dataArray[from+(to-from)/2];
     while (leftIndex<=rigthIndex){
         while (dataArray[leftIndex].compareTo(pivot)<0){
             leftIndex++;
         }
         while (dataArray[rigthIndex].compareTo(pivot)>0){
             rigthIndex--;
         }
         if(leftIndex<=rigthIndex){
             swap(dataArray,rigthIndex,leftIndex);
             leftIndex++;
             rigthIndex--;
         }
     }
    return leftIndex;
    }

    private void swap(T[] dataArray, int index1, int index2) {
        T temp = dataArray[index1];
        dataArray[index1]=dataArray[index2];
        dataArray[index2]=temp;
    }
}
