package stack.and.queue;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();
        Stack<Integer> maxNumbers = new Stack<>();
        maxNumbers.push(Integer.MIN_VALUE);

        int numberOfRows = scan.nextInt();
        for (int i = 1; i <= numberOfRows; i++) {
            int query = scan.nextInt();

            if (query == 1) {   //push
                int number = scan.nextInt();
                numbers.push(number);
                if (number > maxNumbers.peek()) {
                    maxNumbers.push(number);
                }
            } else if (query == 2) {      //delete
                if (numbers.peek() == maxNumbers.peek()) {
                    maxNumbers.pop();
                }
                numbers.pop();
            } else if (query == 3) {      //print
                System.out.println(maxNumbers.peek());
            }
        }
    }
}