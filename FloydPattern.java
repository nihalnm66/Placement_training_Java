public class FloydPattern {

    public static void floyd(String n) {
        int size = n.length();
        for (int r = 0; r < size; r++) {
            for (int s = size - r - 1; s > 0; s--) {
                System.out.print(" ");
            }
            for (int c = 0; c <= r; c++) {
                System.out.print(n.charAt(c));
            }
            System.out.println();
        }
    }

    public static void sandClock(String name) {
        int n = name.length();
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(name.charAt(j % n));                
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(name.charAt(j % n));                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("\nFloyd Pattern\n");
        floyd("abcdef");
        
        System.out.println("\nsand Clock Pattern\n");
        sandClock("abcde");
    }
}