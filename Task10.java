import java.util.Scanner;

public class Task10 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int result = gcd(num1, num2);
        System.out.println("GCD = " + result);
    }
}
