import java.util.*;

public class ComplexSort {
    public static void sort(List<Integer> arr) {
        if (arr.size() == 7) {
            selectionSort(arr);
        }
        else {
            quickSort(arr);
        }
    }

    private static void selectionSort(List<Integer> arr) {
        System.out.println("Selection sort....");
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

    private static void quickSort(List<Integer> arr) {
        System.out.println("Quick sort....");
        quickSort(arr, 0, arr.size() - 1);
    }

    private static void quickSort(List<Integer> arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int k = quickSelect(arr, start, end);
        quickSort(arr, start, k - 1);
        quickSort(arr, k + 1, end);
    }

    private static int quickSelect(List<Integer> arr, int start, int end) {
        int index = start;
        int current = arr.get(end);
        for (int i = start; i < end; i++) {
            if (arr.get(i) < current) {
                swap(arr, i, index);
                index++;
            }
        }

        swap(arr, index, end);
        return index;
    }

    private static void swap(List<Integer> arr, int first, int second) {
        Integer temp = arr.get(first);
        arr.set(first, arr.get(second));
        arr.set(second, temp);
    }
}