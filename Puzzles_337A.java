import java.util.Arrays;
import java.util.Scanner;

public class Puzzles_337A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt(); // Number of students (puzzles to pick)
            int m = sc.nextInt(); 
            
            int[] puzzles = new int[m];
            for (int i = 0; i < m; i++) {
                puzzles[i] = sc.nextInt();
            }
            
            Arrays.sort(puzzles);
            
            int minDiff = Integer.MAX_VALUE;
            
            for (int i = 0; i <= m - n; i++) {
                int currentDiff = puzzles[i + n - 1] - puzzles[i];
                minDiff = Math.min(minDiff, currentDiff);
            }
            
            System.out.println(minDiff);
        }
        
        sc.close();
    }
}