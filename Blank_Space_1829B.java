import java.util.Scanner;

public class Blank_Space_1829B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                int current = 0;
                int maxLen = 0;
                
                for (int i = 0; i < n; i++) {
                    int val = sc.nextInt();
                    if (val == 0) {
                        current++;
                        maxLen = Math.max(maxLen, current);
                    } else {
                        current = 0; 
                    }
                }
                
                System.out.println(maxLen);
            }
        }
        
        sc.close();
    }
}