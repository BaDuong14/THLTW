import java.util.Scanner;

public class SODEP2 {
    public static Scanner ip = new Scanner(System.in);
    public static boolean SoDep(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return sum % 10 == 0;
    }
    public static void main(String[] args) {
        int T = ip.nextInt();
        while (T-- > 0) {
            StringBuilder s = new StringBuilder(ip.next());
            System.out.println(s.toString().matches("^8.*8$") && s.equals(s.reverse()) && SoDep(s.toString()) ? "YES" : "NO");
        }
    }
}
