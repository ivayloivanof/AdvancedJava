package stack.and.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class BasicQueueOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> numbers = new LinkedList<>();

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
                numbers.add(parseInt(a));
            }
        }

        for (int i = 1; i <= s; i++) {
            numbers.remove();
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
