package KunalKushwahaDSA.Arrays;


import java.util.Arrays;
import java.util.stream.IntStream;

public class Practice {
    public static void main(String[] args) {
        int[] arr = { 6 ,7, 8, 9, 10, 1, 2, 3, 4, 5, 4};
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,1));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                end = mid-1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
