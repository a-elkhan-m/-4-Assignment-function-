import java.util.Scanner;

public class Task7 {

    public static int factorial(int n) {
        int a =1;
        for (int i = 1; i <= n; i++) {
            a*=i;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = factorial(n);
        System.out.println(b);
    }
}
