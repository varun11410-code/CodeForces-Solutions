import java.util.Scanner;

public class Soft_Drinking_151A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();  // friends
            int k = sc.nextInt();  // bottles
            int l = sc.nextInt();  // ml per bottle
            int c = sc.nextInt();  // limes
            int d = sc.nextInt();  // slices per lime
            int p = sc.nextInt();  // grams of salt
            int nl = sc.nextInt(); // ml needed per toast
            int np = sc.nextInt(); // salt needed per toast
            
            int drinkToasts = (k * l) / nl;
            int limeToasts = c * d;
            int saltToasts = p / np;
            
            // Bottleneck (minimum toasts possible overall)
            int totalToasts = Math.min(drinkToasts, Math.min(limeToasts, saltToasts));
            
            // Divided equally among friends
            System.out.println(totalToasts / n);
        }
        
        sc.close();
    }
}