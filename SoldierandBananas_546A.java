import java.util.Scanner;

public class SoldierandBananas_546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int k = sc.nextInt(); 
            int n = sc.nextInt(); 
            int w = sc.nextInt(); 
            
            long totalCost = (long) k * w * (w + 1) / 2;
            
            long borrow = totalCost - n;
            
            if (borrow > 0) {
                System.out.println(borrow);
            } else {
                System.out.println(0);
            }
        }
        
        sc.close();
    }
}