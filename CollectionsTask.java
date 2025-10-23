import java.util.*;

public class CollectionsTask {
    public static void main(String[] args) {
        Integer[] numbersArray = {5, 2, 8, 2, 1, 5, 9, 3, 7, 2};
        System.out.println("a) Исходный массив: " + Arrays.toString(numbersArray));
        
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(numbersArray));
        System.out.println("b) Список из массива: " + numbersList);
        
        Collections.sort(numbersList);
        System.out.println("c) Сортировка в натуральном порядке: " + numbersList);
        
        numbersList.sort(Collections.reverseOrder());
        System.out.println("d) Сортировка в обратном порядке: " + numbersList);
        
        Collections.shuffle(numbersList);
        System.out.println("e) Перемешанный список: " + numbersList);
        
        Collections.rotate(numbersList, 1);
        System.out.println("f) Циклический сдвиг на 1: " + numbersList);
        
        Set<Integer> uniqueSet = new LinkedHashSet<>(numbersList);
        List<Integer> uniqueList = new ArrayList<>(uniqueSet);
        System.out.println("g) Только уникальные элементы: " + uniqueList);
        
        List<Integer> duplicatesList = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        
        for (Integer num : numbersList) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        duplicatesList.addAll(duplicates);
        System.out.println("h) Только дублирующиеся элементы: " + duplicatesList);
        
        Integer[] newArray = numbersList.toArray(new Integer[0]);
        System.out.println("i) Массив из списка: " + Arrays.toString(newArray));
    }
}