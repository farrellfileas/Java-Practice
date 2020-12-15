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
        /*
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int index = Integer.MAX_VALUE;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (smallest >= arr[i]) {
                index = i;
            }
            smallest = Math.min(arr[i], smallest);
        }
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                secondSmallest = Math.min(arr[i], secondSmallest);
            }
        }
        result.add(smallest);
        result.add(secondSmallest);
        */
        List<Integer> result = new ArrayList<>();
        buildHeap(arr);
        for (int i = 0; i < k; i++) {
            result.add(popTop(arr, i));
        }
        return result;
    }

//============================ Min Heap =============================

    private static void swap(int a, int b, int[] arr) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    private static void percolateDown(int[] arr, int index) {
        while(2 * index + 1 < arr.length) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int min = Math.min(arr[index], arr[leftChild]);
            if(rightChild < arr.length) {
                min = Math.min(min, arr[rightChild]);
            }

            if (min == arr[index]) {
                break;
            }
            else if (min == arr[leftChild]) {
                swap(leftChild, index, arr);
                index = leftChild;
            }
            else {
                swap(rightChild, index, arr);
                index = rightChild;
            }
        }
    }

    private static void buildHeap(int[] arr) {
        for (int i = arr.length - 1; i >=0 ; i--) {
            percolateDown(arr, i);
        }
    }

    private static int popTop(int[] arr, int i) {
        int result = arr[0];
        arr[0] = arr[arr.length - 1 - i];
        percolateDown(arr, 0);
        return result;
    }
}

/*
        1
      /    \
    2       4
   / 
  3 

  N 1 2 4 3
*/


