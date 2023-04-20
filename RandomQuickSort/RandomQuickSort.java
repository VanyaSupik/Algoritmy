package RandomQuickSort;

import java.util.Arrays;

public class RandomQuickSort {
    static int randomPartition(int[] array, int first, int last){
        int random =(int)(Math.random()*(last - first) + first);

        int temp = array[random];
        array[random] = array[last];
        array[last] = temp;

        int pivot = array[last];
        int i = (first - 1);

        for (int j = first; j < last; j++){
            if (array[j] <= pivot){
                i++;

                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        temp = array[last];
        array[last] = array[i + 1];
        array[i + 1] = temp;

        return i + 1;

    }

    static void quickRandomSort(int[] array, int first, int last) {
        if (first < last) {
            int pi = randomPartition(array, first, last);
            quickRandomSort(array, first, pi - 1);
            quickRandomSort(array, pi + 1, last);
        }
    }

    public static void main(String[] args) {
        int[] team = {2,7,4,9,10,8,11,20,17,1,99};
        quickRandomSort(team,0,team.length - 1);
        System.out.println("Стартовий склад на сьогоднішню гру: ");
        System.out.println(Arrays.toString(team));
    }
}
