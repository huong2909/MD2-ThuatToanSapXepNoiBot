package com.company;

import static com.company.BubbleSort.bubbleSort;
import static com.company.BubbleSort.list;

public class Main {

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }



}
