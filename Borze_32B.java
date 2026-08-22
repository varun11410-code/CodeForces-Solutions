import java.util.Scanner;

public class Borze_32B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNext()) {
            String s = sc.next();
            StringBuilder result = new StringBuilder();
            
            int i = 0;
            while (i < s.length()) {
                if (s.charAt(i) == '.') {
                    result.append('0');
                    i++;
                } else if (s.charAt(i) == '-') {
                    if (s.charAt(i + 1) == '.') {
                        result.append('1');
                    } else if (s.charAt(i + 1) == '-') {
                        result.append('2');
                    }
                    i += 2;
                }
            } 
            System.out.println(result.toString());
        }        
        sc.close();
    }
}