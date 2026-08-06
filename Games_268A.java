import java.util.Scanner;

public class Games_268A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            int[] home = new int[n];
            int[] guest = new int[n];
            
            for (int i = 0; i < n; i++) {
                home[i] = sc.nextInt();
                guest[i] = sc.nextInt();
            }
            
            int matches = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j && home[i] == guest[j]) {
                        matches++;
                    }
                }
            }
            
            System.out.println(matches);
        }
        
        sc.close();
    }
}