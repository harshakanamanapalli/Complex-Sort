import java.util.*;

public class ComplexSortTester {
    public static void main (String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(5,3,2,6,1,4,0));

        ComplexSort.sort(arr);

        for (int i = 0;i < arr.size() - 1;i++) {
            assert(arr.get(i) < arr.get(i+1));
        }

        System.out.println("Sorted arr successfully");
    }
}
