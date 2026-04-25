import java.util.*;

public class ComplexSort {
    public static void sort(List<Integer> arr) {
        selectionSort(arr);
    }

    private static void selectionSort(List<Integer> arr) {
        selectionSort(arr, 0, arr.size() - 1);
    }

    private static void selectionSort(List<Integer> arr, int start, int end) {
        for (int i = start; i <= end;i++){
            int minInd = i;
            for (int j = i + 1; j <= end; j++) {
                if (arr.get(j) < arr.get(minInd)) {
                    minInd = j;
                }
            }

            swap(arr, i, minInd);
        }
    }

    private static void swap(List<Integer> arr, int first, int second) {
        Integer temp = arr.get(first);
        arr.set(first, arr.get(second));
        arr.set(second, temp);
    }
}