interface Remote<T> {
    void ternary(T data);
}

class GenStore<T extends Comparable<T>> implements Remote<T> {
    T[] pack;
    public void ternary(T data) {
        int start = 0;
        int end = pack.length - 1;
        while (start <= end) {
            int mid1 = start + (end - start) / 3;
            int mid2 = end - (end - start) / 3;
            if (pack[mid1].equals(data)) {
                System.out.println(mid1);
                return;
            }
            if (pack[mid2].equals(data)) {
                System.out.println(mid2);
                return;
            }
            if (data.compareTo(pack[mid1]) < 0) {
                end = mid1 - 1;
            } else if (data.compareTo(pack[mid2]) > 0) {
                start = mid2 + 1;
            } else {
                start = mid1 + 1;
                end = mid2 - 1;
            }
        }
        System.out.println(-1);
    }
}

public class CustomCollection {
    public static void main(String[] args) {
        GenStore<Double> rInt = new GenStore<>();
        rInt.pack = new Double[]{10.5, 20.5, 30.5, 40.5, 50.5, 160.1};
        rInt.ternary(160.1);
    }
}