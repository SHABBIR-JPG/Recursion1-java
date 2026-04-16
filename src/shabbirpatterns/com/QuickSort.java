package shabbirpatterns.com;

import java.util.Arrays;

public class QuickSort {
    static void main(String[] args) {
        int[] arr={5,2,8,1,9};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] nums ,int low, int hi){
        if (low>=hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = s+(e-s)/2;
        int pivot=nums[m];

        while (s<=e){
            while (nums[s] < pivot){
                s++;
            }
            while (nums[e] >  pivot){
                e--;
            }
            if (s<=e){
                //swap the condition
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
        //now my pivot is correct index, please sort two halves now
        sort(nums,low,e);
        sort(nums,s,hi);
    }
}
