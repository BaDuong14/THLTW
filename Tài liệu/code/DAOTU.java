import java.util.Scanner;

public class DAOTU {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String[] s = sc.nextLine().split("\\s+");
            for (int i = 0; i < s.length; i++) {
                s[i] = new StringBuilder(s[i]).reverse().toString();
            }
            for (String i : s)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
