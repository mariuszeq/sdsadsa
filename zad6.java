import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę: ");
        int number = scanner.nextInt();
        scanner.close();
        
        System.out.println("Suma silni cyfr: " + factorialDigitSum(number));
    }
    
    public static int factorialDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum;
    }
    
    public static int factorial(int n) {
        if (n == 0) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
