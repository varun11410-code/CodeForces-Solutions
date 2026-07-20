import java.util.Scanner;

public class WordCapitalization_281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNext()) {
            String word = sc.next();
            String capitalized = Character.toUpperCase(word.charAt(0)) + word.substring(1);            
            System.out.println(capitalized);
        }
        sc.close();
    }
}