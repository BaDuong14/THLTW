import java.io.*;
import java.util.*;
class WordSet {

    private Set<String> set;

    public WordSet(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        set = new TreeSet<>();
        while (sc.hasNext()) {
            set.add(sc.next().toLowerCase());
        }
        sc.close();
    }
    @Override
    public String toString() {
        String s = "";
        for (String i : set) {
            s += i + "\n";
        }
        return s;
    }
}
public class LIETKETUKHAC {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
