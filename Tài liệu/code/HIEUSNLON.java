import java.math.BigInteger;
import java.util.Scanner;

public class HIEUSNLON {
    public static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
        int t = ip.nextInt();
        while(t-- > 0){
            BigInteger a = ip.nextBigInteger();
            BigInteger b = ip.nextBigInteger();
            BigInteger c = a.subtract(b).abs();

            StringBuilder sb = new StringBuilder(c.toString());
            int maxLen = Math.max(a.toString().length(), b.toString().length());
            while (sb.length() < maxLen) {
                sb.insert(0, '0');
            }
            System.out.println(sb.toString());
        }
    }
}
