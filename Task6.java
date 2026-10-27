import java.util.Scanner;


public class Task6 {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimesInRange(int a, int b) {
        int p= 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                p++;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int result = countPrimesInRange(a,b);
        System.out.println("Prime Count = " + result);
    }
}
