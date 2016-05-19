package stack.and.queue;

import java.util.Scanner;
import java.util.Stack;

public class StackFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Long> fibonacci = new Stack<>();
        int n = scan.nextInt();
        long c = 1;
        fibonacci.push(c);
        fibonacci.push(c);
        for (int i = 1; i < n; i++) {
            long a = fibonacci.pop();
            long b = fibonacci.peek();
            fibonacci.push(a);
            fibonacci.push(a + b);
        }
        System.out.println(fibonacci.peek());
    }
}
