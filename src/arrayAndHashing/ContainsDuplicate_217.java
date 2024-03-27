package arrayAndHashing;

import java.util.HashSet;

public class ContainsDuplicate_217 {
    /**
     * Using set to store the elements of the array. If the set already contains the element, return true.
     *
     * @param nums an integer array
     * @return true if any value appears at least twice in the array, and return false if every element is distinct
     */
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : nums) {
            if (set.contains(val)) {
                return true;
            }
            set.add(val);
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums1));
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums2));
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums2));
    }
}
