import java.util.Scanner;

public class Amusing_Joke_141A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNext()) {
            String guest = scanner.next();
            String host = scanner.next();
            String pile = scanner.next();
            
            // If total character lengths don't match, it can't be an exact match
            if (guest.length() + host.length() != pile.length()) {
                System.out.println("NO");
                scanner.close();
                return;
            }
            
            int[] counts = new int[26];
            
            // Add counts for guest name
            for (int i = 0; i < guest.length(); i++) {
                counts[guest.charAt(i) - 'A']++;
            }
            
            // Add counts for host name
            for (int i = 0; i < host.length(); i++) {
                counts[host.charAt(i) - 'A']++;
            }
            
            // Subtract counts for pile
            for (int i = 0; i < pile.length(); i++) {
                counts[pile.charAt(i) - 'A']--;
            }
            
            // Verify every character balance is exactly 0
            boolean valid = true;
            for (int count : counts) {
                if (count != 0) {
                    valid = false;
                    break;
                }
            }
            
            if (valid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}