import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if(s1.length() != s2.length()) {
            System.out.println("False");
            return; // Exit early if lengths are different
        }

        // Convert both strings to character arrays
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare both arrays element by element
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]){
                System.out.println("False");
                return; // Exit if they are not equal
            }
        }

        // If the loop completes without returning, the strings are anagrams
        System.out.println("True");
    }
}
