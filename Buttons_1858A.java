import java.util.Scanner;

public class Buttons_1858A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0 && sc.hasNextInt()) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = sc.nextLong();
                
                // Add 1 to Anna's effective turns if shared buttons (c) are odd
                long annaEffective = a + (c % 2);
                
                if (annaEffective > b) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            }
        }
        
        sc.close();
    }
}