import java.util.*;

public class XULYVANBAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "";
        while (sc.hasNext()) {
            String s = sc.next();
            res += s.replaceAll("[!\\.\\?]$", "\n") + " ";
        }
        sc.close();
        String[] s = res.split("\n\\s?");
        for (String i : s) 
            System.out.println(i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase());
    }
}
