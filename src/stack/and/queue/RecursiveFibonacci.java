package stack.and.queue;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >= 1 || n <= 49) {
            long fibonacciNumbers = GetFibonacci(n);
            System.out.println(fibonacciNumbers);
        }
    }

    static long GetFibonacci(int number) {
        if (number == 0 || number == 1) {
            return  1;
        } else {
            return GetFibonacci(number - 1) + GetFibonacci(number - 2);
        }
    }
}