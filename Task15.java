import java.util.Scanner;

public class Task15 {
    public static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;
        while (n > 0) {
            int b = n % 10;
            reverse = (reverse * 10) + b;
            n /= 10;
        }
        return original == reverse;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

