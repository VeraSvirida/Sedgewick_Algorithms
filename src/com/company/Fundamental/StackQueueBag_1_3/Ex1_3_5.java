package com.company.Fundamental.StackQueueBag_1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_3_5 {
    public static void main(String[] args){
        while(!StdIn.isEmpty()) {
            String s = StdIn.readString();
            Integer N = Integer.parseInt(s);
            Stack<Integer> stack = new Stack<Integer>();
            while (N > 0) {
                stack.push(N%2);
                N=N/2;
            }
            for (int d:stack) StdOut.print(d);
            StdOut.println();
        }
    }
}
