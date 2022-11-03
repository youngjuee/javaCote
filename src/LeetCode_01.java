import java.util.HashSet;
import java.util.Set;

public class LeetCode_01 {
    
//    2022.11.01
//    219. Contains Duplicate II
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> containsSet = new HashSet();
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                containsSet.remove(nums[j]);
                j++;
            }

            if (containsSet.contains(nums[i])) {
                return true;
            }
            containsSet.add(nums[i]);


        }
        return false;
    }
}
