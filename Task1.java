import java.util.Scanner;

public class Task1 {
    public static int printStrip(int n, char c){
        for(int i=1;i<=n;i++){
            System.out.print(c);
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        printStrip(n,'*');

    }
}
