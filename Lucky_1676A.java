import java.util.Scanner;

public class Lucky_1676A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                String s = sc.next();
                
                // Sum of first 3 digits
                int firstSum = (s.charAt(0) - '0') + (s.charAt(1) - '0') + (s.charAt(2) - '0');
                
                // Sum of last 3 digits
                int lastSum = (s.charAt(3) - '0') + (s.charAt(4) - '0') + (s.charAt(5) - '0');
                
                if (firstSum == lastSum) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }        
        sc.close();
    }
}