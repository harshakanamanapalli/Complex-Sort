import java.util.*;

public class ComplexSortTester {
    public static void main (String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        arr.add(Arrays.asList(5,3,2,6,1,4,0));
        arr.add(Arrays.asList(7,5,3,2,8,6,1,9,4,0));
        arr.add(Arrays.asList(10,7,5,3,11,2,8,12,6,1,13,9,14,4,0));
        arr.add(generateIntegers(1243));
        arr.add(generateIntegers(124533));
        arr.add(generateIntegers(84));


        for (List<Integer> list : arr) {
            ComplexSort.sort(list);
            assertSortedArray(list);
            System.out.println("Sorted list successfully: " + list.size());
        }


    }

    private static void assertSortedArray(List<Integer> arr) {
        for(int i = 0; i < arr.size() - 1;i++) {
            assert arr.get(i) <= arr.get(i+1) : "Array isn't sorted : (" + i + " : " +  arr.get(i) + " : " + arr.get(i+1) + ")";
        }
    }

    private static List<Integer> generateIntegers(int size) {
        List<Integer> list = new ArrayList<>();

        Random rand = new Random();
        for (int i = 0;i < size; i++) {
            list.add(rand.nextInt(size + 1));
        }

        return list;
    }
}
