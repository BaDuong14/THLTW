import java.util.Scanner;

public class HINHCHUNHAT {
    public static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
        int r = ip.nextInt();
        int d = ip.nextInt();
        if (r <= 0 || d <= 0) {
            System.out.println(0);
        } else {
            System.out.println(2 * (r + d) + " " + r * d);
        }
    }
}
