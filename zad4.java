import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź słowo do zaszyfrowania: ");
        String word = scanner.nextLine();
        scanner.close();
        
        System.out.println("Zaszyfrowane słowo: " + caesarCipher(word, 3));
    }
    
    public static String caesarCipher(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char i : text.toCharArray()) {
            if (Character.isLetter(i)) {
                char base = Character.isUpperCase(i) ? 'A' : 'a';
                result.append((char) ((i - base + shift) % 26 + base));
            } else {
                result.append(i);
            }
        }
        return result.toString();
    }
}
