public class MinimumRotatedSorted {
    public static int minSorted(int nums[]){
        int left=0,right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right]) left=mid+1;
            else right=mid;
        }
        return nums[left];
    }    
    public static void main(String[] args) {
        //int[] arr={3,4,5,1,2};
        int[] arr={11,12,13,14};
        System.out.println(minSorted(arr));
    }
}
