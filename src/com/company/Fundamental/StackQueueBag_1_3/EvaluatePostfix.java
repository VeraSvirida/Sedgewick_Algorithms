package com.company.Fundamental.StackQueueBag_1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/*
Test data
1 2 3 + 4 5 * * +
101.0
 */
public class EvaluatePostfix{
    public static void main(String[] args){
        Stack<Double> vals = new Stack<Double>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();

            if (s.equals("(")) ;
            if (s.equals(")")) ;
            if (s.equals("+")) {
                double v = vals.pop();
                v = vals.pop() + v;
                vals.push(v);
            }
            else if (s.equals("*")) {
                double v = vals.pop();
                v = vals.pop() * v;
                vals.push(v);
            }
            else if (s.equals("-")) {
                double v = vals.pop();
                v = vals.pop() - v;
                vals.push(v);
            }
            else if (s.equals("/")) {
                double v = vals.pop();
                v = vals.pop() / v;
                vals.push(v);
            }
            else if (s.equals("sqrt")) {
                double v = vals.pop();
                v = v*v;
                vals.push(v);
            }
            else {
                vals.push(Double.parseDouble(s));
            }
        }

        StdOut.println(vals.pop());
    }
}
