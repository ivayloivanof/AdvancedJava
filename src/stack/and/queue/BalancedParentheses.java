package stack.and.queue;

import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        boolean balanced = false;
        Scanner scan = new Scanner(System.in);
        char[] chars = scan.nextLine().toCharArray();
        int n = 0;
        if (chars.length <= 1 && chars.length >= 1000) {
            n = chars.length / 2;
        }

        for (int i = 0; i < (chars.length / 2); i++) {
            int last = 0;
            if (i == 0) {
                last = chars.length - 1;
            } else {
                last = chars.length - 1 - i;
            }

            if (((chars[last] - chars[i]) == 2) || ((chars[last] - chars[i]) == 1)) {
                balanced = true;
            } else {
                balanced = false;
                break;
            }
        }

        if (balanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}