import java.util.Scanner;

public class Hulk_705A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        if (s.hasNextInt()) {
            int n = s.nextInt();
            StringBuilder result = new StringBuilder();
            
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    result.append("I hate");
                } else {
                    result.append("I love");
                }
                
                if (i == n) {
                    result.append(" it");
                } else {
                    result.append(" that ");
                }
            }
            
            System.out.println(result.toString());
        }
        
        s.close();
    }
}