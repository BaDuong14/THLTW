import java.util.Scanner;

public class UOCNTOMAX {
    public static Scanner ip = new Scanner(System.in);
    public static boolean NTO(long n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void testCase(){
        long n = ip.nextLong();
        long res = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(NTO(n/i)){
                    System.out.println(n/i);
                    return;
                }
                if(NTO(i)){
                    res = i;
                }
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int t = ip.nextInt();
        while(t-- > 0){
            testCase();
        }
    }
}
