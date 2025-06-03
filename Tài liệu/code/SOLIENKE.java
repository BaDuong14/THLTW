import java.util.Scanner;

public class SOLIENKE {
    public static Scanner ip = new Scanner(System.in);
    public static void testCase(){
        char[] n = ip.nextLine().toCharArray();
        for(int i = 1; i < n.length; i++){
            if(Math.abs(n[i] - n[i-1]) != 1){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0){
            testCase();
        }
    }
}
