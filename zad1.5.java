import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int limit = 1000;
        List<Integer> primes = sieveOfEratosthenes(limit);
        
        int x = 10; // Przykładowa wartość x
        int y = 100; // Przykładowa wartość y
        
        System.out.println("Liczby pierwsze z zakresu od " + x + " do " + y + ":");
        for (int prime : primes) {
            if (prime >= x && prime <= y) {
                System.out.println(prime);
            }
        }
    }
    
    public static List<Integer> sieveOfEratosthenes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }
        
        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}
