package KunalKushwahaDSA.Arrays;

import java.util.Arrays;

class RSA {
    private static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        int index = Arrays.binarySearch(nums, 0, pivot, target);
        if (index < 0) {
            index = Arrays.binarySearch(nums, pivot, nums.length, target);
        }

        return index >= 0 ? index : -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }
}
