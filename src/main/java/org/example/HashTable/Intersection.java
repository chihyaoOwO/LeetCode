package org.example.HashTable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
//  349. Intersection of Two Arrays
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                result.add(i);
            }
        }

        int[] resArr = new int[result.size()];
        int index = 0;
        for (int i : result) {
            resArr[index++] = i;
        }
        return resArr;
        //return result.stream().mapToInt(s -> s.intValue()).toArray();
    }
}
