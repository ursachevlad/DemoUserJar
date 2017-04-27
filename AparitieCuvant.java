import java.util.*;

public class AparitieCuvant {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("aici si acolo si dincolo si chiar si aici e acolo");

        ArrayList<String[]> list2 = new ArrayList<>();
        for (String s : list) {
            list2.add(s.split(" "));
        }
        ;
        for (String[] s : list2) {
            Map<String, Integer> wordCounts = new HashMap<String, Integer>();

            for (String word : s) {
                Integer count = wordCounts.get(word);
                if (count == null) {
                    count = 0;
                }
                wordCounts.put(word, count + 1);
            }
            for (String key : wordCounts.keySet()) {
                System.out.println(key + ": " + wordCounts.get(key).toString());
            }

        }
    }
}
