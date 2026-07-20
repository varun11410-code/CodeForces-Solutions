import java.util.Scanner;

public class NextRound_158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int[] scores = new int[n];
            
            for (int i = 0; i < n; i++) {
                scores[i] = sc.nextInt();
            }
            
            int cutoffScore = scores[k - 1];
            int advancers = 0;
            
            for (int i = 0; i < n; i++) {
                if (scores[i] >= cutoffScore && scores[i] > 0) {
                    advancers++;
                }
            }
            System.out.println(advancers);
        }
        
        sc.close();
    }
}