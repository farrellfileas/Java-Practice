import java.util.*;

public class Day8 {
    public static void main(String[] agrs) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        System.out.println(findSmallest(arr,4)); // Expected 1 

        arr = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        System.out.println(findSmallest(arr,3)); // Expected 1

        buildHeap(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static List<Integer> findSmallest(int[] arr , int k) {
        return new ArrayList<>();
    }
}


