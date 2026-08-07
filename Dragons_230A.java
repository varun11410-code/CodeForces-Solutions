import java.util.Arrays;
import java.util.Scanner;
public class Dragons_230A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int s = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] dragons = new int[n][2];
        for (int i = 0; i < n; i++) {
            dragons[i][0] = sc.nextInt(); // x_i (strength)
            dragons[i][1] = sc.nextInt(); // y_i (bonus)
        }
        
        // Sort ascending by dragon strength (x_i)
        Arrays.sort(dragons, (a, b) -> Integer.compare(a[0], b[0]));
        
        boolean win = true;
        for (int i = 0; i < n; i++) {
            if (s > dragons[i][0]) { // Strictly greater than dragon strength
                s += dragons[i][1];
            } else {
                win = false;
                break;
            }
        }
        
        if (win) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}