package com.company.Fundamental.StackQueueBag_1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_3_4 {
    public static boolean isBalance(String s) {
        Stack<Character> open = new Stack<Character>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{')
                open.push(c);
            else if ((c == ')' && (open.isEmpty() || open.pop() != '(')) ||
                    (c == ']' && (open.isEmpty() || open.pop() != '[')) ||
                    (c == '}' && (open.isEmpty() || open.pop() != '{')))
                return false;
        }
        return open.isEmpty();
    }

    public static void main(String[] args) {

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();

            StdOut.println(isBalance(s));
        }

    }
}