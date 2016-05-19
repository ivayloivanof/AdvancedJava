package stack.and.queue;

import java.util.Scanner;
import java.util.Stack;

import static java.lang.Integer.parseInt;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> numbers = new Stack();

        String input = scan.nextLine();
        String amount = scan.nextLine();
        String[] num = input.split(" ");
        String[] amountN = amount.split(" ");
        scan.close();

        int n = parseInt(num[0]);
        int s = parseInt(num[1]);
        int x = parseInt(num[2]);

        for (String a : amountN) {
            if (numbers.size() < n) {
                numbers.push(parseInt(a));
            }
        }

        for (int i = 1; i <= s; i++) {
            numbers.pop();
        }
        boolean exit = false;

        for (Integer number : numbers) {
            if (number == x) {
                exit = true;
            }
        }

        if (exit) {
            System.out.println(exit);
        } else if (numbers.size() > 0) {
            System.out.println(numbers.peek());
        } else {
            System.out.println(numbers.size());
        }
    }
}
