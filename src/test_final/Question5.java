/*
Question 5: Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.

   Input: nums = [3,2,1,5,6,4], k = 2
   Output: 5

   Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
   Output: 4
 */
package test_final;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Question5 {

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> myHeap=new PriorityQueue(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return b-a;
            }
        });
        for(int n:nums) myHeap.offer(n);
        for(int j=0;j<k-1;j++) myHeap.poll();
        return myHeap.poll();
    }

}
