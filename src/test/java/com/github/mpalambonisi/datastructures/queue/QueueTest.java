package com.github.mpalambonisi.datastructures.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void enqueueTest() {
        Queue que = new Queue(0);
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);

        assertEquals(5, que.getLength());
        assertEquals(0, que.getFirst().value);
        assertEquals(4, que.getLast().value);
        assertArrayEquals(new int[] {0, 1, 2, 3, 4}, que.toArray());
    }

    @Test
    void dequeueTest() {
        Queue que = new Queue(0);
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);

        assertEquals(5, que.getLength());
        assertEquals(0, que.getFirst().value);
        assertEquals(4, que.getLast().value);
        assertArrayEquals(new int[] {0, 1, 2, 3, 4}, que.toArray());

        // dequeue
        assertEquals(0, que.dequeue().value);
        assertEquals(1, que.dequeue().value);
        assertEquals(3, que.getLength());
        assertEquals(2, que.getFirst().value);
        assertEquals(4, que.getLast().value);
        assertArrayEquals(new int[] {2, 3, 4}, que.toArray());
    }

    @Test
    void dequeueOneElementInArrayTest() {
        Queue que = new Queue(0);
        assertEquals(1, que.getLength());
        assertEquals(0, que.getFirst().value);
        assertEquals(0, que.getLast().value);
        assertArrayEquals(new int[] {0}, que.toArray());

        // dequeue
        assertEquals(0, que.dequeue().value);
        assertNull(que.dequeue());
        assertArrayEquals(new int[] {}, que.toArray());
    }
}