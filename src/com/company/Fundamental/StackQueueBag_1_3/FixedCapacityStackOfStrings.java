package com.company.Fundamental.StackQueueBag_1_3;
public class FixedCapacityStackOfStrings<Item> {
    private Item[] a; // элементы стека
    private int N; // размер

    public FixedCapacityStackOfStrings(int cap) {
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        a[N++] = item;
    }

    public Item pop() {
        return a[--N];
    }

    // 1.3.1 Добавьте в класс FixedCapacityStackOf St rings метод isFullQ
    public boolean isFull() {
        return N == a.length;
    }
}