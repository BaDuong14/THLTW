import java.math.BigInteger;
import java.util.Scanner;

public class BSCNN {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger mul = a.multiply(b);
            BigInteger gcd = a.gcd(b);
            BigInteger lcm = mul.divide(gcd);
            System.out.println(lcm);
        }
    }
}
