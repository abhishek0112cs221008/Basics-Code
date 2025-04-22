import java.util.*;

public class Fibnochi {
    // Method to find the nth term in the Fibonacci series
    private static int findNthTerm(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, nextNum = 0;

        // Loop to calculate the nth term
        for (int i = 2; i <= n; i++) {
            nextNum = a + b; // Calculate the next term
            a = b;           // Update a to the previous term
            b = nextNum;     // Update b to the current term
        }

        // Return the nth term
        return nextNum;
    }

    private static void findSeries(ArrayList<Integer> fib, int n) {
        int a = 0;
        int b = 1;
        fib.add(a);
        fib.add(b);

        for(int i=2; i<n; i++) {
            int nextNum = a+b;
            a = b;
            b = nextNum;

            fib.add(nextNum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> fib = new ArrayList<>();

        findSeries(fib, n);
        
        for(int i = 0; i<fib.size(); i++) {
            System.out.print(fib.get(i) + "  ");
        }
    }
}
