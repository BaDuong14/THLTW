import java.math.BigInteger;
import java.util.Scanner;

public class CHIA11 {
    public static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
        int t = ip.nextInt();
        while(t-- > 0){
            BigInteger bi = ip.nextBigInteger();
            System.out.println(bi.mod(new BigInteger("11")).toString().equals("0") ? "1" : "0");
        }
    }
}
