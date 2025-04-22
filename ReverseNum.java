import java.util.*;

public class ReverseNum {
    private static int reverse(int n) {
        int num = 0;
        while(n != 0) {
            int rem = n%10;
            num = num*10 + rem;

            n /= 10;
        }
        return num;
    }  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(reverse(num));
    }
}
