package com.deo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AwesomeListTest {


    AwesomeList<String> stringAwesomeList = new AwesomeList<>();
    AwesomeList<Integer> integerAwesomeList = new AwesomeList<>();


    @org.junit.jupiter.api.Test
    void addStringToStringList() {
        stringAwesomeList.add("Hello");
        assertTrue(stringAwesomeList.get(0).equals("Hello"));
    }

    @org.junit.jupiter.api.Test
    void addIntegerToIntegerList() {
        integerAwesomeList.add(1);
        assertTrue(integerAwesomeList.get(0).equals(1));
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
}