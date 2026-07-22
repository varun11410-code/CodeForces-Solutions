import java.util.Scanner;

public class StringTask_118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNext()) {
            String s = sc.next().toLowerCase(); 
            StringBuilder result = new StringBuilder();
            
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                
                if (ch == 'a' || ch == 'o' || ch == 'y' || ch == 'e' || ch == 'u' || ch == 'i') {
                    continue; 
                }
                
                result.append('.').append(ch);
            }  
            System.out.println(result.toString());
        }
        
        sc.close();
    }
}