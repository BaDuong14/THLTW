import java.util.Scanner;

public class PTBACNHAT {
    public static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
        float a = ip.nextFloat();
        float b = ip.nextFloat();
        if(a == 0f){
            if(b == 0f){
                System.out.println("VSN");
            } else{
                System.out.println("VN");
            }
        }
        else{
            System.out.println(String.format("%.2f", -b/a));
        }
    }
}
