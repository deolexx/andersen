package com.deo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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