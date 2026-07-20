import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths_339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNext()) {
            String s = sc.next();
            
            String[] numbers = s.split("\\+");
            
            Arrays.sort(numbers);
            
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < numbers.length; i++) {
                result.append(numbers[i]);
                
                if (i < numbers.length - 1) {
                    result.append("+");
                }
            }
            System.out.println(result.toString());
        }
        
        sc.close();
    }
}