package com.deo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuickSortTest {

    @Test
    void sortMethodTesting() {
        AwesomeList<String> list= new AwesomeArrayList<>();
        list.add("Zoidberg");
        list.add("Fry");
        list.add("Bender");
        QuickSort.sort(list);
        assertEquals("Bender",list.get(0));
    }
}