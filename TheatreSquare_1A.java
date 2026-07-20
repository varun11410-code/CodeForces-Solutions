import java.util.Scanner;

public class TheatreSquare_1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextLong()) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long a = sc.nextLong();
            
            long stonesLength = n / a;
            if (n % a != 0) {
                stonesLength++; 
            }
            long stonesWidth = m / a;
            if (m % a != 0) {
                stonesWidth++; 
            }
            long totalStones = stonesLength * stonesWidth;
            System.out.println(totalStones);
        }        
        sc.close();
    }
}