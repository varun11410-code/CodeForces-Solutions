import java.util.Scanner;

public class AntonAndDanik_734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            String outcomes = sc.next();
            
            int antonWins = 0;
            int danikWins = 0;
            
            for (int i = 0; i < n; i++) {
                if (outcomes.charAt(i) == 'A') {
                    antonWins++;
                } else if (outcomes.charAt(i) == 'D') {
                    danikWins++;
                }
            }
            
            if (antonWins > danikWins) {
                System.out.println("Anton");
            } else if (danikWins > antonWins) {
                System.out.println("Danik");
            } else {
                System.out.println("Friendship");
            }
        }
        sc.close();
    }
}