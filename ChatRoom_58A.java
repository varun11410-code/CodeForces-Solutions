import java.util.Scanner;

public class ChatRoom_58A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNext()) {
            String s = sc.next();
            String target = "hello";
            
            int targetIndex = 0;
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == target.charAt(targetIndex)) {
                    targetIndex++;
                }
                
                if (targetIndex == target.length()) {
                    break;
                }
            }
            
            if (targetIndex == target.length()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }        
        sc.close();
    }
}