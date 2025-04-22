package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private int[] nums;
    private int target;

    public TwoSum(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    public int[] solve() {
        //Initialize the result array with error indices
        int[] result = new int[]{-1, -1};

        //HashMap to keep track of "complements" and their indices
        Map<Integer, Integer> complements = new HashMap<>();

        //Loop through the array and perform check
        for(int i = 0; i < this.nums.length; i++) {
            //Calculate the complement at the given index
            int complement = this.target - this.nums[i];
            //If the map contains the complement then return the indices
            if(complements.containsKey(complement)) {
                result[0] = complements.get(complement);
                result[1] = i;
                return result;
            }
            //Put the current number and it's index in map
            complements.put(nums[i], i);
        }

        return result;
    }

    @Override
    public String toString() {
        return "TwoSum{" +
                "nums=" + Arrays.toString(nums) +
                ", target=" + target +
                '}';
    }
}
