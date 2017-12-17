package Assignments.As2;


import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        MaxHeap test = new MaxHeap();

        test.insert(1);
        test.insert(15);
        test.insert(53);
        test.insert(13);
        test.insert(87);
        test.insert(4);
        test.insert(65);
        test.insert(98);
        test.insert(83);

        test.poll();

        System.out.println(test.items);
    }
}
