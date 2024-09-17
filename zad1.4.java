import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tablica = new int[100];
        
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(100) + 1;
        }

        Arrays.sort(tablica);
        
        double mediana = findMedian(tablica);
        double srednia = findAverage(tablica);
        int dominanta = findMode(tablica);

        // Wyświetlanie wyników
        System.out.println("Tablica: " + Arrays.toString(tablica));
        System.out.println("Mediana: " + mediana);
        System.out.println("Średnia: " + srednia);
        System.out.println("Dominanta: " + dominanta);
    }

    public static double findMedian(int[] tablica) {
        int n = tablica.length;
        if (n % 2 == 0) {
            return (tablica[n / 2 - 1] + tablica[n / 2]) / 2.0;
        } else {
            return tablica[n / 2];
        }
    }

    public static double findAverage(int[] tablica) {
        int sum = 0;
        for (int num : tablica) {
            sum += num;
        }
        return sum / (double) tablica.length;
    }

    public static int findMode(int[] tablica) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : tablica) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mode = tablica[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mode = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mode;
    }
}
