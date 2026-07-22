import java.util.Scanner;

public class Word_59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNext()) {
            String word = sc.next();

            int upperCount = 0;
            int lowerCount = 0;
            
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (Character.isUpperCase(ch)) {
                    upperCount++;
                } else {
                    lowerCount++;
                }
            }
            
            if (upperCount > lowerCount) {
                System.out.println(word.toUpperCase());
            } else {
                System.out.println(word.toLowerCase());
            }
        }
        sc.close();
    }
}