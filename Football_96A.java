import java.util.Scanner;

public class Football_96A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNext()) {
            String players = sc.next();
            
            if (players.contains("0000000") || players.contains("1111111")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }        
        sc.close();
    }
}