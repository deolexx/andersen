package com.deo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class AwesomeArrayListTest {
    AwesomeList<String> stringList;
    AwesomeList<Integer> integerList;
    AwesomeList<Integer> emptyList;

    @BeforeEach
    public void setup() {
        stringList = new AwesomeArrayList<>();
        stringList.add("Gimmly");
        stringList.add("Sam");
        stringList.add("Frodo");
        stringList.add("Aragorn");

        integerList = new AwesomeArrayList<>();
        integerList.add(9);
        integerList.add(4);
        integerList.add(1);
        integerList.add(99);

        emptyList = new AwesomeArrayList<>();


    }


    @Test
    void addStringToStringList() {
        stringList.add("Hello");
        assertTrue(stringList.get(4).equals("Hello"));
    }

    @Test
    void addIntegerToIntegerList() {
        emptyList.add(1);
        assertTrue(emptyList.get(0).equals(1));
    }

    @Test
    void addNullToEmptyList() {
        emptyList.add(null);
        emptyList.add(null);
        assertTrue(emptyList.size() == 2);
    }

    @Test
    void addNullToStringList() {
        stringList.add(null);
        assertTrue(stringList.size() == 5);
    }

    @Test
    void get() {
        assertEquals(99, integerList.get(3));
    }

    @Test
    void removeFromIntegerList() {
        integerList.remove(0);
        integerList.remove(3);
        assertTrue(integerList.size() == 2);
    }

    @Test
    void testSizeMethod() {
        assertTrue(stringList.size() == 4);
        assertTrue(emptyList.size() == 0);
    }

    @Test
    void isEmpty() {
        assertFalse(stringList.isEmpty());
        assertTrue(emptyList.isEmpty());
    }


    @Test
    void setCorrectIntegers() {
        integerList.set(0, 222);
        assertTrue(integerList.get(0) == 222);
    }


    @Test
    void sortIntegers() {
        integerList.sort();
        assertEquals(1, integerList.get(0));
        assertEquals(4, integerList.get(1));
        assertEquals(9, integerList.get(2));
        assertEquals(99, integerList.get(3));

    }

    @Test
    void sortStrings() {
        stringList.sort();
        assertEquals("Aragorn", stringList.get(0));
        assertEquals("Frodo", stringList.get(1));

    }

    @Test
    void internal() throws NoSuchFieldException, IllegalAccessException {
        Class<? extends AwesomeList> aClass = stringList.getClass();
        Field default_size = aClass.getDeclaredField("DEFAULT_SIZE");
        default_size.setAccessible(true);
        Object o = default_size.get(aClass);
        assertTrue((int) o == 10);
    }

    @Test
    void addRemoveTest() {
        for (int i = 0; i < 99999; i++) {
            emptyList.add(i);
        }
        assertTrue(emptyList.size() == 99999);
        for (int i = 99998; i >= 0; i--) {
            emptyList.remove(i);
        }
        assertTrue(emptyList.size() == 0);

    }

    @Test
    void getIndexOutOfBoundsException() {
    assertThrows(IndexOutOfBoundsException.class,()->{
        emptyList.get(12);
    });
    } @Test
    void setIndexOutOfBoundsException() {
    assertThrows(IndexOutOfBoundsException.class,()->{
        integerList.set(22,null);
    });
    }

    @Test
    void removeIndexOutOfBoundsException() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            emptyList.remove(12);
        });
    }

}