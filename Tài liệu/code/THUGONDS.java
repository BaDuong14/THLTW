import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class THUGONDS {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<Integer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(ip.nextInt());
        }
        ip.close();
        while (true) {
            boolean stop = true;
            for (int i = 0; i < a.size() - 1; i++) {
                if ((a.get(i) + a.get(i + 1)) % 2 == 0) {
                    a.remove(i + 1);
                    a.remove(i);
                    i--;
                    stop = false;
                }
            }
            if (stop) {
                System.out.println(a.size());
                return;
            }
        }
    }
}
