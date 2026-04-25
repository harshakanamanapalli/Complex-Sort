import java.util.*;

public class ComplexSortTester {
    public static void main (String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        arr.add(Arrays.asList(5,3,2,6,1,4,0));
        arr.add(Arrays.asList(7,5,3,2,8,6,1,9,4,0));


        for (List<Integer> list : arr) {
            ComplexSort.sort(list);
            assertSortedArray(list);
            System.out.println("Sorted list successfully: " + list);
        }


    }

    private static void assertSortedArray(List<Integer> arr) {
        for(int i = 0; i < arr.size() - 1;i++) {
            assert(arr.get(i) < arr.get(i+1));
        }
    }
}
