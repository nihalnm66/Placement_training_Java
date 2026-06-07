import java.util.HashMap;

public class NonRepeatSubStr {

    public static int subStr(String og) {
        int start = 0, maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < og.length(); end++) {
            char ch = og.charAt(end);

            if (map.containsKey(ch)) {
                start = Math.max(start, map.get(ch) + 1);
            }

            map.put(ch, end);
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String phrase = "pwwkew";
        System.out.println(subStr(phrase));
    }
}