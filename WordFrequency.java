import java.util.*;

//import java.util.Map.Entry;
public class WordFrequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();
        String str = "every day has some good and bad";
        String word[] = str.split(" ");

        for (String w : word) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }
        for (Map.Entry<String, Integer> ele : map.entrySet()) {
            System.out.println(ele.getKey() + ":" + ele.getValue());
        }
    }
}