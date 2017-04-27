import java.util.HashMap;
import java.util.Map;

public class CateCuvinteSuntV2 {
    public static void main(String[] args) {
        String str = "aici si acolo si dincolo si chiar si aici e acolo";
        String[] splitStr = str.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : splitStr) {
            if (wordCount.containsKey(word)) {
                // Map contine deja word key. Il incrementam doar cu 1
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // Map nu are map-ul pentru word. Adaugam cu count = 1
                wordCount.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("Cuvantul : " + "\"" + entry.getKey() + "\"" + " apare de: " + entry.getValue());
        }
    }
}
