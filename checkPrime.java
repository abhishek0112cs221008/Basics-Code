import java.util.Scanner;

public class checkPrime {
    private static boolean isPrime(int num) {
        if(num == 0) 
            return false;
        if(num == 1) 
            return false;

        for(int i=2; i*i < num; i++) {
            if(num%i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num;
        num = sc.nextInt();

        if(isPrime(num)) {
            System.out.println(num+" is Prime Number");
        }
        else {
            System.out.println(num+" is Not a Prime Number");
        }
    }
}