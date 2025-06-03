import java.util.Scanner;
public class XAUCONMAX {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.next(), x = "";
        char k = 'a';
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) >= k) {
                k = s.charAt(i);
                x = k + x;
            }
        }
        System.out.println(x);
    }
}
