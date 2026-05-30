import java.util.*;
public class MoveZero {
    
    public static void moveZeroes(int[] nums) {
        int valid=0,traversal=0,size=nums.length;
        while(traversal<size){
            if(nums[traversal]!=0){
                nums[valid]=nums[traversal];
                valid++;
            }
            traversal++;
        }
        Arrays.fill(nums,valid,size,0);
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] nums2 = {19,5,0,3,0,4,0,6,0,7};
        moveZeroes(nums);
        moveZeroes(nums2); 
 
    }
}