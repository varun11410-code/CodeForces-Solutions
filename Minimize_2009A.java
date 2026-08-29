import java.util.Scanner;

public class Minimize_2009A  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            while (t-- > 0 && scanner.hasNextInt()) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                
                System.out.println(b - a);
            }
        }
        
        scanner.close();
    }
}
