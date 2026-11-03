/**
 *  Java program to create, update, display, and clear Stack instance.
 */

package com.mycollections;

import java.util.Stack;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Stack<Integer> myStack = new Stack<>();

        // Add.
        myStack.push(6);
        myStack.push(9);
        myStack.push(8);
        myStack.push(7);
        myStack.push(5);

        // Display.
        System.out.println(myStack); // Output: [6, 9, 8, 7, 5]

        // Update.
        myStack.remove(2);

        // Display.
        System.out.println(myStack); // Output: [6, 9, 7, 5]

        // Clear.
        myStack.clear();

    }
}