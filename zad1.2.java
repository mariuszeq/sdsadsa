import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] fib = new int[40];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        // Wyświetlanie ciągu Fibonacciego
        System.out.println("Ciąg Fibonacciego:");
        for (int num : fib) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę: ");
        int liczba = scanner.nextInt();
        scanner.close();
        
        int index = findClosestFibonacci(fib, liczba);
        System.out.println("Najbliższa liczba Fibonacciego: " + fib[index]);
    }

    public static int findClosestFibonacci(int[] fib, int target) {
        int left = 0;
        int right = fib.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (fib[mid] == target) {
                return mid;
            } else if (fib[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (right < 0) return 0;
        if (left >= fib.length) return fib.length - 1;
        
        return (Math.abs(fib[left] - target) < Math.abs(fib[right] - target)) ? left : right;
    }
}
