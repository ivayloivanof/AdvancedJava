package stack.and.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class CalculateSequenceWithQueue {
    public static void main(String[] args) {
        Queue<Long> sequence = new ArrayDeque<>();
        Scanner scan = new Scanner(System.in);
        long number = scan.nextInt();
        sequence.add(number);

        for (int i = 0; i < 50; i++) {
            long headOfQueue = sequence.peek();
            sequence.add(headOfQueue + 1);
            sequence.add(headOfQueue * 2 + 1);
            sequence.add(headOfQueue + 2);

            System.out.print(sequence.remove() + " ");
        }
    }
}