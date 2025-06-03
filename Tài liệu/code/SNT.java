import java.util.Scanner;

public class SNT {
    public static Scanner ip = new Scanner(System.in);
    public static boolean Prime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                    return false;
            }
        }
        return true;
    }
    public static void testCase(){
        int n = ip.nextInt();
        if(Prime(n)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        int t = ip.nextInt();
        while(t-->0){
            testCase();
        }
    }
}
