package InsertionSort;

import java.util.Arrays;

public class Team {
    public static void main(String[] args) {
        int[] team = {2,7,4,9,10,8,11,20,17,1,99};
        int[] teamDemo = insertionSort(team);
        System.out.println("Стартовий склад на сьогоднішню гру: ");
        System.out.println(Arrays.toString(teamDemo));
    }
    public static int[] insertionSort(int[] team) {
        int i, j, newValue;
        for (i = 1; i < team.length; i++) {
            newValue = team[i];
            j = i;
            while (j > 0 && team[j - 1] > newValue) {
                team[j] = team[j - 1];
                j--;
            }
            team[j] = newValue;
        }
        return team;
    }
}
