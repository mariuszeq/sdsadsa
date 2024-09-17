import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę: ");
        int number = scanner.nextInt();
        scanner.close();
        
        System.out.println("Najbliższa liczba palindromiczna: " + findNearestPalindrome(number));
    }
    
    public static int findNearestPalindrome(int num) {
        int lower = num;
        int higher = num;
        
        while (true) {
            if (isPalindrome(lower)) return lower;
            if (isPalindrome(higher)) return higher;
            
            lower--;
            higher++;
        }
    }
    
    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
