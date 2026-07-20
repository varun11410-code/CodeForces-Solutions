import java.util.Scanner;

public class BeautifulMatrix_263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int targetRow = 0;
        int targetCol = 0;
        
        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= 5; c++) {
                if (sc.hasNextInt()) {
                    int val = sc.nextInt();
                    if (val == 1) {
                        targetRow = r;
                        targetCol = c;
                    }
                }
            }
        }
        int moves = Math.abs(targetRow - 3) + Math.abs(targetCol - 3);
        System.out.println(moves);
        
        sc.close();
    }
}