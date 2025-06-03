import java.util.Scanner;

public class SODEP3 {
    public static Scanner ip = new Scanner(System.in);
    public static boolean SoDep(String s) {
        int l = s.length();
        for (int i = 0; i < l / 2; i++) {
            if (s.charAt(i) != s.charAt(l - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int T = ip.nextInt();
        while (T-- > 0) {
            String s = ip.next();
            System.out.println(s.matches("[^014689]+") && SoDep(s) ? "YES" : "NO");
        }
    }
}
