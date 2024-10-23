package com.github.mpalambonisi.datastructures.stack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StackArrayListTest {

    @Test
    void pushTest() {
        StackArrayList<Integer> stack = new StackArrayList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        ArrayList<Integer> expectedResults = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(6, stack.size());
        assertEquals(expectedResults, stack.getStackList());
    }

    @Test
    void popTest() {
        StackArrayList<Integer> stack = new StackArrayList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        // pop node
        assertEquals(6, stack.pop());
        assertEquals(5, stack.pop());
        assertEquals(4, stack.size());
        ArrayList<Integer> expectedResults = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertEquals(expectedResults, stack.getStackList());
    }

    @Test
    void popEmptyArrayTest() {
        StackArrayList<Integer> stack = new StackArrayList<>();
        stack.push(1);

        // pop node
        assertEquals(1, stack.pop());
        assertNull(stack.pop());
        assertEquals(0, stack.size());
        ArrayList<Integer> expectedResults = new ArrayList<>();
        assertEquals(expectedResults, stack.getStackList());
    }

    @Test
    void reverseString() {
        String myString = "hello";
        String reversedString = StackArrayList.reverseString(myString);

        assertEquals("olleh", reversedString);
    }

    @Test
    void isBalancedParenthesisTest01(){
        String str = "()";
        assertTrue(StackArrayList.isBalancedParentheses(str));
    }
    @Test
    void isBalancedParenthesisTest02(){
        String str = "()()";
        assertTrue(StackArrayList.isBalancedParentheses(str));
    }
    @Test
    void isBalancedParenthesisTest03(){
        String str = "(())";
        assertTrue(StackArrayList.isBalancedParentheses(str));
    }
    @Test
    void isBalancedParenthesisTest04(){
        String str = "()()()";
        assertTrue(StackArrayList.isBalancedParentheses(str));
    }
    @Test
    void isBalancedParenthesisTest05(){
        String str = "(()())";
        assertTrue(StackArrayList.isBalancedParentheses(str));
    }
    @Test
    void isBalancedParenthesisTest06(){
        String str = ")()(";
        assertFalse(StackArrayList.isBalancedParentheses(str));
    }
    @Test
    void isBalancedParenthesisTest07(){
        String str = ")(";
        assertFalse(StackArrayList.isBalancedParentheses(str));
    }
    @Test
    void isBalancedParenthesisTest08(){
        String str = "(()";
        assertFalse(StackArrayList.isBalancedParentheses(str));
    }
    @Test
    void isBalancedParenthesisTest09(){
        String str = "))";
        assertFalse(StackArrayList.isBalancedParentheses(str));
    }
    @Test
    void isBalancedParenthesisTest10(){
        String str = "))";
        assertFalse(StackArrayList.isBalancedParentheses(str));
    }
    @Test
    void isBalancedParenthesisTest11(){
        String str = ")";
        assertFalse(StackArrayList.isBalancedParentheses(str));
    }
}