import java.util.*;
public class MissingNumber{
    public static int MissingNo(int[] nums){
        Arrays.sort(nums);
        int i=0;
        int r=1;
        while(i<=nums.length-1){
            if(nums[r]-nums[i]==1){
                i++;
                r++;
            }
            else{
                return nums[i]+1;
            }
        }
        return 0;
    }
    // public static void MissingNumber(int[] nums){
    //     List<Integer> nums=Arrays.asList(nums);
    //     int min=Collections.min(nums);
    //     While(true){
    //         int current = min+1;
    //         if(nums.contain(current)) 
    //             mini = current;
    //         else{
    //             System.out.println("missing number "+current);
    //             return;
    //         }
    //     }
    // }
    public static void main(String[] args) {
        int[] nums = {8,10,3,1,4,2,5};
        int missing=MissingNo(nums); 
        System.out.println(missing);
        // MissingNumber(nums);
    }
}