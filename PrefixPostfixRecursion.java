import java.util.Arrays;

public class PrefixPostfixRecursion {
    public static void prefixS(int[] nums, int[] prefix, int i){
        if(i==0){
            prefix[0]=nums[0];
            return;
        }
        prefixS(nums, prefix, i-1);
        prefix[i]=prefix[i-1]+nums[i];
    }
    public static void postfixS(int[] nums, int[] postfix, int i){
        if(i==nums.length-1){
            postfix[i]=nums[i];
            return;
        }
        postfixS(nums,postfix,i+1);
        postfix[i]=postfix[i+1]+nums[i];
    }
    public static void main(String[] args) {
        int[] a={23,12,98,45,18,45,12,98};
        int[] pre=new int[a.length];
        int[] post=new int[a.length];
        prefixS(a,pre,a.length-1);
        postfixS(a,post,0);
        System.out.println(Arrays.toString(pre));
        System.out.println(Arrays.toString(post));
    }
}
