public class RotateImage{
    public static void rotate(int[][] mat){
        //transpose
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat.length;j++){
                mat[i][j]^=mat[j][i];
                mat[j][i]^=mat[i][j];
                mat[i][j]^=mat[j][i];
            }
        }
        //reverse
        for(int i=0;i<mat.length;i++){
            int left=0,right=mat.length-1;
            while(left<right){
                mat[i][left]^=mat[i][right];
                mat[i][right]^=mat[i][left];
                mat[i][left]^=mat[i][right];
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args){
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        rotate(a);
        for(int i=0;i<a.length;i++){
            System.out.print("[");
            for(int j=0;j<a.length;j++){
                System.out.print(" " + a[i][j]+ " ");
            }
            System.out.println("]");
        }
    }
}