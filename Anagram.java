import java.util.*;
public class Anagram {
    public static Collection<List<String>> group(String[] words) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i]; // Grab the word at the current index
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }   
            map.get(key).add(word);
        }   
        return map.values();
    }
    public static void main(String[] args) {
        String[] inp = {"eat", "bat", "nat", "tan", "ate", "ant"};
        System.out.println(group(inp));
    }
}