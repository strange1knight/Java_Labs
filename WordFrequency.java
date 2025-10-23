import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "Hello world hello Java World java Programming programming";
        
        String[] words = text.split("\\s+");
        
        Map<String, Integer> frequencyMap = new HashMap<>();
        
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        
        System.out.println("Частота слов (регистр важен):");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " раз(а)");
        }

        System.out.println("\nРазличные слова: " + frequencyMap.keySet());
    }
}