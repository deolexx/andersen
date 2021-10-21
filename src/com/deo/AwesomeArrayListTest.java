package com.deo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AwesomeArrayListTest {


    AwesomeArrayList<String> stringAwesomeArrayList = new AwesomeArrayList<>();
    AwesomeArrayList<Integer> integerAwesomeArrayList = new AwesomeArrayList<>();


    @org.junit.jupiter.api.Test
    void addStringToStringList() {
        stringAwesomeArrayList.add("Hello");
        assertTrue(stringAwesomeArrayList.get(0).equals("Hello"));
    }

    @org.junit.jupiter.api.Test
    void addIntegerToIntegerList() {
        integerAwesomeArrayList.add(1);
        assertTrue(integerAwesomeArrayList.get(0).equals(1));
    }


    @org.junit.jupiter.api.Test
    void get() {

    }

    @org.junit.jupiter.api.Test
    void remove() {
    }

    @org.junit.jupiter.api.Test
    void size() {
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
    }


    @Test
    void setCorrectIntegers(){
        AwesomeArrayList<Integer> integerAwesomeArrayList = new AwesomeArrayList<>();
        integerAwesomeArrayList.add(4);
        integerAwesomeArrayList.add(1);
        integerAwesomeArrayList.add(14);
        integerAwesomeArrayList.add(18);
        integerAwesomeArrayList.set(0,124);
        integerAwesomeArrayList.set(3,0);
        assertEquals(124,integerAwesomeArrayList.get(0));
        assertEquals(0,integerAwesomeArrayList.get(3));
    }



    @Test
    void sortWithIntegers() {
        AwesomeArrayList<Integer> integerAwesomeArrayList = new AwesomeArrayList<>();
        integerAwesomeArrayList.add(4);
        integerAwesomeArrayList.add(1);
        integerAwesomeArrayList.add(14);
        integerAwesomeArrayList.add(18);
        integerAwesomeArrayList.sort();
        assertEquals(1,integerAwesomeArrayList.get(0));

    }
}