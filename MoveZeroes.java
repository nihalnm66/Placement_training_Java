public class MoveZeroes {
    public static void MoveZero(int[] nums) {
        int last = nums.length - 1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) count++;
        }
        for (int first = 0; first < nums.length - count; ) {
            if (nums[first] == 0) {
                int temp = nums[first];
                nums[first] = nums[last];
                nums[last] = temp;
                last--;
            } else {
                first++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] nums = {19,5,0,3,0,4,0,6,0,7};
        MoveZero(nums);
    }
}