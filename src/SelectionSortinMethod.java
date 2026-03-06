import java.util.Arrays;
public class SelectionSortinMethod {
    public static void main(String[] args) {
        int[] arr = {42, 23, 59, 33, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] <  arr[minIndex]) {
                        minIndex = j;
                }
            }
            int minibox = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = minibox;
        }
    }
}


