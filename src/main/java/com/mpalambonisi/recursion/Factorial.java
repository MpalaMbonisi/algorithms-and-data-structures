package com.mpalambonisi.recursion;

/*
 * The call stack is also used in recursive methods.
 * A recursive method calls itself until a base condition is met,
 * and each recursive call adds a new frame to the call stack.
 * Once the base condition is reached, the method starts returning the results,
 * and the frames are popped off the stack in reverse order.
 *
 * In this code:
 * 1. The main method starts execution and calls the factorial method with a value of 5.
 * 2. The factorial method checks if the value is 1. If not, it recursively calls itself with (value - 1).
 * 3. Each recursive call pushes a new frame onto the call stack until the base case (value == 1) is met.
 * 4. Once the base case is reached, the method returns 1, and the stack starts to unwind:
 *    - The frame for factorial(1) is removed, and the result is passed to factorial(2).
 *    - factorial(2) returns 2 * 1, and the frame is removed.
 *    - This continues until factorial(5) returns 5 * 24 = 120.
 * 5. The main method receives the result (120) and prints "5! = 120".
 * 6. The process is repeated for factorial(10), calculating 10! in a similar recursive manner.
 */


public class Factorial {
    private static int factorial(int value){
        if (value == 1) return 1;
        return value * factorial(value - 1);
    }
    public static void main(String[] args) {
        int fac = factorial(5);
        System.out.println("5! = " + fac);
        fac = factorial(10);
        System.out.println("10! = " + fac);
    }
}
