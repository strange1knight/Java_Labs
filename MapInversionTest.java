import java.util.*;

class MapUtils {
    public static <K, V> Map<V, Collection<K>> invertMap(Map<K, V> originalMap) {
        Map<V, Collection<K>> invertedMap = new HashMap<>();
        
        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            
            if (!invertedMap.containsKey(value)) {
                invertedMap.put(value, new ArrayList<>());
            }
            
            invertedMap.get(value).add(key);
        }
        
        return invertedMap;
    }
}

public class MapInversionTest {
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("Alice", 25);
        originalMap.put("Bob", 30);
        originalMap.put("Charlie", 25);
        originalMap.put("David", 30);
        originalMap.put("Eve", 28);
        
        System.out.println("Исходная Map:");
        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        Map<Integer, Collection<String>> invertedMap = MapUtils.invertMap(originalMap);
        
        System.out.println("\nИнвертированная Map:");
        for (Map.Entry<Integer, Collection<String>> entry : invertedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}