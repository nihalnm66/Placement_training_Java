public class SubArraySum{
    public static int subSum(int[] nums){
        if(nums.length==1) return nums[0];
        else if(nums.length<1) return -1;
        else{
            int cSum=nums[0];
            int m=nums[0];
            for(int i=1;i<nums.length;i++){
                cSum=Math.max(nums[i],cSum+nums[i]);
                m=Math.max(m,cSum);
            }
            return m;
        }  
    }
    public static void main(String[] args){
        int[] a={5,4,-1,4};
        System.out.println("max sum : "+subSum(a));
    }
}