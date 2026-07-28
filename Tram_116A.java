import java.util.Scanner;

public class Tram_116A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            int currentCapacity = 0;
            int maxCapacity = 0;
            
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt(); 
                int b = sc.nextInt(); 
                
                currentCapacity = currentCapacity - a + b;
                
                if (currentCapacity > maxCapacity) {
                    maxCapacity = currentCapacity;
                }
            }
            
            System.out.println(maxCapacity);
        }        
        sc.close();
    }
}