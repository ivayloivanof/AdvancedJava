package stack.and.queue;

import java.util.Scanner;
import java.util.Stack;

import static java.lang.Integer.parseInt;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();
        String input = scan.nextLine();
        String[] num = input.split(" ");
        for (String s : num) {
            numbers.push(parseInt(s));
        }

        for (int i = 0; i < numbers.size();) {
            System.out.printf("%d ", numbers.pop());
        }
        scan.close();
    }
}
