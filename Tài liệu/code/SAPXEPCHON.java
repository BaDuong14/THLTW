import java.util.Scanner;

public class SAPXEPCHON {
    public static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
        int n = ip.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = ip.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int id = i; 
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[id]) {
                    id = j;
                }
            }
            int tmp = a[i];
            a[i] = a[id];
            a[id] = tmp;
            System.out.printf("Buoc %d: ", i + 1);
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
