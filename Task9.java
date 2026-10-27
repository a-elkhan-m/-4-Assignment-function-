public class Task9 {

    public static boolean Armstrong(int num) {
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (Armstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

