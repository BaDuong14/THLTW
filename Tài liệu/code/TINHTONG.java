import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TINHTONG {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                sum += Integer.parseInt(s);
            } catch (Exception e) {

            }
        }
        sc.close();
        System.out.println(sum);
    }
}
