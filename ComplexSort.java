import java.util.*;

public class ComplexSort {
    public static void sort(List<Integer> arr) {
        sort(arr, 0, arr.size() - 1);
    }

    private static void sort(List<Integer> arr, int start, int end) {
        System.out.println("Complex sort ....");
        if (end - start + 1 >= 10000) {
            System.out.println("Quick sort for (" + start + " : " + end + ")");
            quickSort(arr, start, end);
        } 
        else if (end - start + 1 >= 100) {
            System.out.println("Merge sort for (" + start + " : " + end + ")");
            mergeSort(arr, start, end);
        }
        else {
            System.out.println("Selection sort for (" + start + " : " + end + ")");
            selectionSort(arr, start, end);
        }
    }

    public static void selectionSort(List<Integer> arr) {
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

    public static void quickSort(List<Integer> arr) {
        System.out.println("Quick sort....");
        quickSort(arr, 0, arr.size() - 1);
    }

    private static void quickSort(List<Integer> arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int k = quickSelect(arr, start, end);
        sort(arr, start, k - 1);
        sort(arr, k + 1, end);
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

    public static void mergeSort(List<Integer> arr) {
        System.out.println("Merge sort...");
        mergeSort(arr, 0, arr.size() - 1);
    }

    private static void mergeSort(List<Integer> arr, int start, int end) {
        if (start >= end) {
            return ;
        }

        int mid = start + (end - start) / 2;
        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        mergeSortedArrays(arr, start, mid, end);
    }

    private static void mergeSortedArrays(List<Integer> arr, int start, int mid, int end) {
        List<Integer> newArr = new ArrayList<>(); 
        int i = start, j = mid + 1;
        while(i <= mid && j <= end) {
            if (arr.get(i) <= arr.get(j)) {
                newArr.add(arr.get(i));
                i++;
            } else {
                newArr.add(arr.get(j));
                j++;
            }
        }

        while(i <= mid) {
            newArr.add(arr.get(i));
            i++;
        }

        while(j <= end) {
            newArr.add(arr.get(j));
            j++;
        }

        int k = start;
        for (int x : newArr) {
            arr.set(k, x);
            k++;
        }
    }

    private static void swap(List<Integer> arr, int first, int second) {
        Integer temp = arr.get(first);
        arr.set(first, arr.get(second));
        arr.set(second, temp);
    }
}