import java.util.Scanner;

public class XAUDOIXUNG {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            String s = sc.next();
            int l = s.length(), cnt = 0;
            for (int i = 0; i < l / 2; i++) {
                if (s.charAt(i) != s.charAt(l - i - 1)) {
                    cnt++;
                }
            }
            if ((l % 2 == 0 && cnt == 1) || (l % 2 == 1 && cnt <= 1)) {
                System.out.println("YES");
            } 
            else {
                System.out.println("NO");
            }
        }
    }
}
