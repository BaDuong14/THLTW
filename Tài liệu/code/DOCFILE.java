import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class DOCFILE {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
