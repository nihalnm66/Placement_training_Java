import java.util.*;
public class Dutch{
    public static void DNF(int[] nums){
        int zero=0;
        int i=0;
        int last=nums.length-1;
        while(i<=last){
            if(nums[i]==2){
                int temp=nums[i];
                nums[i]=nums[last];
                nums[last]=temp;
                last--;
                i++;
            }
            else if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[zero];
                nums[zero]=temp;
                zero++;
                i++;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void DNF2(int[] nums){
        int zero=0;
        int i=0;
        int last=nums.length-1;
        while(i<=last){
            if(nums[i]==2){
                nums[i]^=nums[last];
                nums[last]^=nums[i];
                nums[i]^=nums[last];
                last--;
                i++;
            }
            else if(nums[i]==0){
                nums[i]^=nums[zero];
                nums[zero]^=nums[i];
                nums[i]^=nums[zero];
                zero++;
                i++;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0, 1, 2, 2, 1};
        DNF(nums); 
        DNF2(nums);
    }
}