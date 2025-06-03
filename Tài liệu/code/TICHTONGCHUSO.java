import java.math.BigInteger;
import java.util.Scanner;

public class TICHTONGCHUSO {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String ar = sc.nextLine().trim();
            BigInteger a = BigInteger.ONE;
            long sumOdd = 0;
            for(int i = 0; i < ar.length(); i++){
                int digit = ar.charAt(i) - '0';
                if(i % 2 == 0){
                    if(digit != 0){
                        a = a.multiply(BigInteger.valueOf(ar.charAt(i) - '0'));
                    }
                }
                else{
                    sumOdd += digit;
                }
            }
            System.out.println(a + " " + sumOdd);
        }
    }
}
