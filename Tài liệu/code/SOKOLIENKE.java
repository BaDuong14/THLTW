import java.util.Scanner;

public class SOKOLIENKE {
    public static Scanner ip = new Scanner(System.in);
    public static boolean testCase(){
        char[] n = ip.nextLine().toCharArray();
        int sum = 0;
        for(char i:n) sum += (i-'0');
        if(sum % 10 != 0) return false;
        for(int i = 1; i < n.length; i++){
            if(Math.abs(n[i] - n[i-1]) != 2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0){
            System.out.println(testCase() ? "YES" : "NO");
        }
    }
}
