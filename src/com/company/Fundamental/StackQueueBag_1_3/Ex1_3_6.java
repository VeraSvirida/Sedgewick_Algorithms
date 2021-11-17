package com.company.Fundamental.StackQueueBag_1_3;

import edu.princeton.cs.algs4.StdOut;

public class Ex1_3_6{
//Код меняет порядок элементов в очереди q
    public static void main(String[] args){
        Queue<String> q = new Queue<String>();
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue("3");
        q.enqueue("4");
        Stack<String> stack = new Stack<String>();
        while(!q.isEmpty()){
            stack.push(q.dequeue());
        }
        while(!stack.isEmpty()){
            q.enqueue(stack.pop());
        }
        for(String s:q){
            StdOut.println(s);
        }
    }
}