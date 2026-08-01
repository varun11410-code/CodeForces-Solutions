import java.util.Scanner;

public class Drinks_200B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }
            
            double average = sum / n;
            
            System.out.println(average);
        }
        
        sc.close();
    }
}