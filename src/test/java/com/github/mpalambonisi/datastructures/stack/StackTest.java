package com.github.mpalambonisi.datastructures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void pushTest() {
        Stack stack = new Stack(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        assertEquals(6, stack.getTop().value);
        assertEquals(6, stack.getHeight());
        assertArrayEquals(new int[] {6, 5, 4, 3, 2, 1}, stack.toArray());
    }

    @Test
    void popTest() {
        Stack stack = new Stack(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        // pop node
        assertEquals(6, stack.pop().value);
        assertEquals(5, stack.getTop().value);
        assertEquals(5, stack.pop().value);
        assertEquals(4, stack.getHeight());
        assertArrayEquals(new int[] {4, 3, 2, 1}, stack.toArray());
    }

    @Test
    void popEmptyArrayTest() {
        Stack stack = new Stack(1);

        // pop node
        assertEquals(1, stack.pop().value);
        assertNull(stack.pop());
        assertEquals(0, stack.getHeight());
        assertArrayEquals(new int[] {}, stack.toArray());
    }
}