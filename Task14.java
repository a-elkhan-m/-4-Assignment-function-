import java.util.Scanner;

public class Task14 {
    public static int transformDigits(int n) {
        int a = 0;
        int b = 1;
        while(n>0){
            int d = n%10;
            if(d%2==0){
                d+=1;
            } else{
                d-=1;
            }
            a+= d*b;
            b*=10;
            n/=10;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(transformDigits(n));
    }
}
