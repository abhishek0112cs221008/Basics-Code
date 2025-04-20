import java.util.Scanner;

public class GCD {
    // Function to calculate GCD of two numbers
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a == b) {
            return a;
        }
        int gcd = 1;
        for(int i=1;i <= a && i<= b; ++i) {
            if(a%i == 0 && b%i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int gcd2(int a, int b) {
        while(a != b) {
            if(a > b) {
                a -= b;
            }else {
                b -= a;
            }
        }
        return a;
    }

    public static int hcf(int a, int b) {
        // gcd and hcf are same 
        if(b != 0) {
            return hcf(b, a%b);
        }
        else {
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = hcf(a, b);
        
        System.out.println("GCD of " + a + " and " + b + " is: " + result);

        scanner.close();
    }
}
