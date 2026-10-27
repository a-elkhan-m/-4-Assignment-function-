import java.util.Scanner;

public class Task12 {

    public static int reverseNumber(int n) {
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        return reverse;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int output = reverseNumber(n);
        System.out.println(output);
    }
}
