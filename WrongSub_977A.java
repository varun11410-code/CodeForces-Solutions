import java.util.Scanner;

public class WrongSub_977A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            for (int i = 0; i < k; i++) {
                if (n % 10 == 0) {
                    n /= 10; 
                } else {
                    n -= 1;  
                }
            }   
            System.out.println(n);
        }
        sc.close();
    }
}