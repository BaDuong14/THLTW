import java.util.Scanner;

public class SODEP1 {
    public static Scanner ip = new Scanner(System.in);
    public static boolean SoDep(String s){
        int l = s.length();
        for(int i = 0; i < l/2; i++){
            if(s.charAt(i) != s.charAt(l-i-1) || (s.charAt(i) - '0') % 2 == 1){
                return false;
            }
        }
        return true;
    }
    public static void testCase(){
        String s = ip.next();
        if(SoDep(s)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        int t = ip.nextInt();
        while(t-- > 0){
            testCase();
        }
    }
}
