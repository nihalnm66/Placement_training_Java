public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int fast=1,slow=0;
        if (nums.length == 0) return 0;
        while(fast<nums.length){
            if(nums[slow]==nums[fast]){
                fast++;
            }
            else{
                slow++;
                nums[slow]=nums[fast];
                fast++;
            }
        }
        return slow+1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2};
        int k1 = removeDuplicates(arr1);
        System.out.print("Test 1 - Length: " + k1 + ", Array: ");
        for (int i = 0; i < k1; i++) System.out.print(arr1[i] + " ");
        System.out.println();
    }
}