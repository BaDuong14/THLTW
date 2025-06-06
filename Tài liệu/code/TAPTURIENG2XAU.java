import java.util.HashSet;
import java.util.Scanner;

public class TAPTURIENG2XAU {
    public static Scanner ip = new Scanner(System.in);
    public static void testCase() {
        String[] a = ip.nextLine().split("\\s+");
        String b = ip.nextLine();
        HashSet<String> c = new HashSet<>();
        for (String i : a) {
            if (!b.contains(i)) {
                c.add(i);
            }
        }
        for (String i : c) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int T = Integer.parseInt(ip.nextLine());
        while (T-- > 0) {
            testCase();
        }
    }
}
