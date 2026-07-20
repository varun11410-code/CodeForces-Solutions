import java.util.Scanner;

public class WayTooLongWords_71A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            // Loop n times to process each word
            for (int i = 0; i < n; i++) {
                String word = scanner.next();
                int len = word.length();
                
                // Check if the word is strictly longer than 10 characters
                if (len > 10) {
                    char first = word.charAt(0);
                    char last = word.charAt(len - 1);
                    int middleCount = len - 2;
                    
                    System.out.println("" + first + middleCount + last);
                } else {
                    // Word is short enough, print it as is
                    System.out.println(word);
                }
            }
        }
        
        scanner.close();
    }
}