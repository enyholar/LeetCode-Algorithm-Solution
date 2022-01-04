import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
   public  int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int flag = 0;

            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]){
                    flag = 1;
                 
                }

            }
            if (flag == 0){
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
    
}