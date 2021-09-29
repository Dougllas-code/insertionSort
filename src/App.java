import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        int[] v = geradorDeArray(20);
        insertionSort(v);
        System.out.println(Arrays.toString(v));
    }

    public static int[] geradorDeArray(int n) {
        int[] v = new int[n];
        Random gerador = new Random();
        for (int i = 0; i < n; i++) {
            v[i] = gerador.nextInt(100);
        }
        return v;
    }

    private static void insertionSort(int[] v) {
        int n = v.length; // = 6
        for (int i = 1; i < n; i++) {
            int x = v[i]; // x = 9
            int j = i - 1; // j = 0
            while (j >= 0 && v[j] > x) { // v[j] = 2
                v[j + 1] = v[j];
                j = j - 1;
            }
            v[j + 1] = x;
        }
    }
}
