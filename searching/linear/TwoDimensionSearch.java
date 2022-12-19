package searching.linear;

import java.util.Arrays;

public class TwoDimensionSearch {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int count = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 5) {
                    count++;
                    int ans[] = {i,j};
                    System.out.println(Arrays.toString(ans));
                }
            }
        }
        System.out.println(count);
    }
}
