import java.util.Arrays;
import java.util.Hashtable;

public class SlidingWindowMinimum {

    public static String[] window(String[] cur, String[] req) {
        Hashtable<String, Integer> reqTab = new Hashtable<>();
        Hashtable<String, Integer> winTab = new Hashtable<>();

        for (String s : req) {
            reqTab.put(s, reqTab.getOrDefault(s, 0) + 1);
        }

        int start = 0;
        int minStart = 0;
        int minLen = Integer.MAX_VALUE;
        int formed = 0;

        for (int end = 0; end < cur.length; end++) {
            String current = cur[end];
            winTab.put(current, winTab.getOrDefault(current, 0) + 1);

            if (reqTab.containsKey(current)
                    && winTab.get(current).intValue() == reqTab.get(current).intValue()) {
                formed++;
            }

            while (formed == reqTab.size()) {
                if (end - start + 1 < minLen) {
                    minLen = end - start + 1;
                    minStart = start;
                }

                String left = cur[start];
                winTab.put(left, winTab.get(left) - 1);

                if (reqTab.containsKey(left)
                        && winTab.get(left) < reqTab.get(left)) {
                    formed--;
                }

                start++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return new String[]{};
        }

        return Arrays.copyOfRange(cur, minStart, minStart + minLen);
    }

    public static void main(String[] args) {
        String[] cur = {"b", "s", "a", "c", "f"};
        String[] req = {"s", "c"};

        String[] result = window(cur, req);
        System.out.println(Arrays.toString(result));
    }
}