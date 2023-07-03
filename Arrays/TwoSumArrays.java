//https://leetcode.com/problems/two-sum/description/
package StriverSDESheet.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSumArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter target sum");
        int target = sc.nextInt();
        int result[];
        result = getPair(nums, target);
        System.out.println(Arrays.toString(result));
    }
    static int[] getPair(int nums[], int target){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        int result[] = new int[2];
        for(int i=0;i<n;i++){
            if(hm.containsKey(target - nums[i])){
                result[0] = hm.get(target - nums[i]);
                result[1] = i;
                break;
            }
            hm.put(nums[i], i);
        }
        return result;
    }
}
//TC -> O(N)
//SC -> O(N)
