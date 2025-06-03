import java.math.BigInteger;
import java.util.Scanner;

public class HIEUSNLON2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        System.out.println(A.subtract(B).toString());
    }
}
