public class ClimbingStairs{
    public static int climbing(int stairs){
        if(stairs<=1) return 1;
        else if(stairs==2) return 2;
        else return climbing(stairs-1)+climbing(-2);
    }
    public static void main(String[] args){
        System.out.println(climbing(5));
        System.out.println(climbing(4));
        System.out.println(climbing(2));

    }
}