import java.util.Scanner;

public class CHIATAMGIAC {
    public static Scanner ip = new Scanner(System.in);
    public static void testCase() {
        int n = ip.nextInt();
        double h = ip.nextDouble();
        for (int i = 1; i < n; i++) 
            System.out.format("%.6f ", h*Math.sqrt((double)i/n));
        System.out.println();
    }
    public static void main(String[] args) {
        int t = ip.nextInt();
        while (t-- > 0){
            testCase();
        }
    }
}
