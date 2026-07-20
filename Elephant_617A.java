import java.util.Scanner;

public class Elephant_617A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            
            int steps = (x + 4) / 5;            
            System.out.println(steps);
        }        
        sc.close();
    }
}