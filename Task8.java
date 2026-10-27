import java.util.Scanner;

public class Task8 {
    public static String decimalToBinary(int n) {
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Binary = " + decimalToBinary(13));
    }
}


