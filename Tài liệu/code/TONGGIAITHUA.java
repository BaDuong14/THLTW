import java.util.Scanner;

public class TONGGIAITHUA {
    public static Scanner ip = new Scanner(System.in);
    public static void main(String[] args){
        int n = ip.nextInt();
        long tong = 0, tich = 1;
        for(int i = 1; i <= n; i++){
            tich *= i;
            tong += tich;
        }
        System.out.println(tong);
    }
}
