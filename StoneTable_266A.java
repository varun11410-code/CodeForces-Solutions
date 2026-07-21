import java.util.Scanner;

public class StoneTable_266A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int removeCount = 0;
            
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    removeCount++;
                }
            }            
            System.out.println(removeCount);
        }        
        sc.close();
    }
}