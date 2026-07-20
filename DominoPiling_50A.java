import java.util.Scanner;

public class DominoPiling_50A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int maxDominoes = (m * n) / 2;
            System.out.println(maxDominoes);
        }
        sc.close();
    }
}