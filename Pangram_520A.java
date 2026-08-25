import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram_520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            String s = sc.next();
            
            if (n < 26) {
                System.out.println("NO");
            } else {
                Set<Character> uniqueLetters = new HashSet<>();
                String lower = s.toLowerCase();
                
                for (int i = 0; i < n; i++) {
                    uniqueLetters.add(lower.charAt(i));
                }
                
                if (uniqueLetters.size() == 26) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        
        sc.close();
    }
}