import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wygenerowane hasło: " + generateRandomPassword(20));
    }
    
    public static String generateRandomPassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+[]{}|;:,.<>?";
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);
        
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        
        return password.toString();
    }
}
