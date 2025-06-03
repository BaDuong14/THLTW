import java.util.Scanner;

public class CATDOI {
    public static Scanner ip = new Scanner(System.in);
    public static void testCase(){
        char[] a = ip.nextLine().toCharArray();
        String s = "";
        for(char i:a){
            if(i == '0' || i == '8' || i == '9'){
                s += "0";
            }
            else if(i == '1'){
                s += '1';
            }
            else{
                System.out.println("INVALID");
                return;
            }
        }
        long res = Long.valueOf(s);
        System.out.println(res <= 0 ? "INVALID" : res);
    }
    public static void main(String[] args) {
        int t = ip.nextInt();
        ip.nextLine();
        while(t-- > 0){
            testCase();;
        }
    }
}
