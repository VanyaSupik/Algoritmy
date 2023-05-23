import java.util.Arrays;
import java.util.Random;

public class Stat {
    public static int nthElement(int[] arr, int first, int last, int n) {
        boolean i;
        for(;i = true;){
            int k = randomizedPartition(arr, first, last);
            if (n < k)
                last = k;
            else if (n > k)
                first = k + 1;
            else
                return k;
        }
        return first;
    }

    static Random rnd = new Random();

    static int randomizedPartition(int[] arr, int first, int last) {
        swap(arr, first + rnd.nextInt(last - first), last - 1);
        int separator = arr[last - 1];
        int i = first - 1;
        for (int j = first; j < last; j++)
            if (arr[j] <= separator)
                swap(arr, ++i, j);
        return i;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(6);
        }
        System.out.println(Arrays.toString(arr));
        int k = rnd.nextInt(5);
        nthElement(arr, 0, arr.length, k);

        System.out.println("Порядкова статистика масиву з iндексом " + k + " містить значення: " + arr[k]);

    }
}
