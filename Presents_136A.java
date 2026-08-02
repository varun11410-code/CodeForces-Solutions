import java.util.Scanner;

public class Presents_136A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            int[] giver = new int[n + 1];
            
            for (int i = 1; i <= n; i++) {
                int receiver = sc.nextInt();
                giver[receiver] = i;
            }

            for (int i = 1; i <= n; i++) {
                System.out.print(giver[i] + (i == n ? "" : " "));
            }
            System.out.println();
        }
        
        sc.close();
    }
}