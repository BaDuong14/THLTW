import java.util.*;
public class SCP {
    public static Scanner ip = new Scanner(System.in);
    public static void testCase(){
        int N = ip.nextInt();
        int n = (int) Math.sqrt(N);
        if(N==n*n){
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
