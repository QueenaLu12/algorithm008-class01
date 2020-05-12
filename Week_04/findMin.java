/* Qing Lu, CS 210, Spring 2020
   This program is about practicing how to use class, method to solve problems.*/
import java.util.*;
public class Assignment2 {
    public static void main(String[] args) {
        int[] nums ={2,3,4,5,1};
        int a = findMin(nums);
        System.out.print(a);
    }

    public static int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0;
        int right = nums.length - 1;

        if (nums[right] > nums[left]) {
            return nums[0];
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid+1]<nums[mid]) {
                return nums[mid+1];
            }
            else if (nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            if (nums[mid] > nums[left]) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return -1;
    }
}







