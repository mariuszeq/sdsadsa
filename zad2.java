import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź słowo: ");
        String word = scanner.nextLine();
        scanner.close();
        
        String reversedWord = new StringBuilder(word).reverse().toString();
        if (word.equals(reversedWord)) {
            System.out.println("Słowo jest palindromem.");
        } else {
            System.out.println("Słowo nie jest palindromem.");
        }
    }
}
