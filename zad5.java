import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwsze słowo: ");
        String word1 = scanner.nextLine();
        System.out.println("Wprowadź drugie słowo: ");
        String word2 = scanner.nextLine();
        scanner.close();
        
        if (areAnagrams(word1, word2)) {
            System.out.println("Słowa są anagramami.");
        } else {
            System.out.println("Słowa nie są anagramami.");
        }
    }
    
    public static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
