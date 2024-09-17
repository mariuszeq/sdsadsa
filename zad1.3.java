import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tablica = new int[100];
        
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(100) + 1;
        }

        List<Integer> parzyste = new ArrayList<>();
        List<Integer> nieparzyste = new ArrayList<>();
        
        for (int liczba : tablica) {
            if (liczba % 2 == 0) {
                parzyste.add(liczba);
            } else {
                nieparzyste.add(liczba);
            }
        }

        Set<Integer> unikalneLiczby = new HashSet<>();
        for (int liczba : tablica) {
            unikalneLiczby.add(liczba);
        }

        // Wyświetlanie wyników
        System.out.println("Liczby parzyste: " + parzyste);
        System.out.println("Liczby nieparzyste: " + nieparzyste);
        System.out.println("Ilość różnych liczb: " + unikalneLiczby.size());
    }
}
