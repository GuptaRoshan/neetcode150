package binarySearch;

public class SearchInRotatedArray_33 {

    public static int search(int[] nums, int target) {
        // Find the minimum element in the array
        int rot = smallestElementBinarySearch(nums);
        int low = 0;
        int high = nums.length - 1;

        // Separate the array by defining the new low and high, based on the target
        if (nums[rot] <= target && nums[high] >= target) {
            low = rot;
        } else {
            high = rot - 1;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;

            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    static public int smallestElementBinarySearch(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums, target));
    }
}
