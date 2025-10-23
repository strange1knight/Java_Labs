import java.util.*;

class Human implements Comparable<Human> {
    private String fName;
    private String lName;
    private int age;
    
    public Human(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }
    
    @Override
    public int compareTo(Human o) {
        if (this.equals(o)) return 0;
        int rez = fName.compareToIgnoreCase(o.fName);
        if (rez != 0) return rez;
        rez = lName.compareToIgnoreCase(o.lName);
        if (rez != 0) return rez;
        else return age - o.age;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Human human = (Human) obj;
        return age == human.age && 
               Objects.equals(fName, human.fName) && 
               Objects.equals(lName, human.lName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(fName, lName, age);
    }
    
    @Override
    public String toString() {
        return fName + " " + lName + " (" + age + ")";
    }
    
    public String getFName() { return fName; }
    public String getLName() { return lName; }
    public int getAge() { return age; }
}

class HumanComparatorByLName implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        return h1.getLName().compareToIgnoreCase(h2.getLName());
    }
}

public class HumanTest {
    public static void main(String[] args) {
        Set<Human> humans = new HashSet<>();
        humans.add(new Human("John", "Smith", 25));
        humans.add(new Human("Alice", "Johnson", 30));
        humans.add(new Human("Bob", "Williams", 22));
        humans.add(new Human("John", "Smith", 25)); 
        humans.add(new Human("Charlie", "Brown", 28));
        
        System.out.println("a) HashSet:");
        for (Human h : humans) {
            System.out.println(h);
        }
        
        Set<Human> linkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("\nb) LinkedHashSet:");
        for (Human h : linkedHashSet) {
            System.out.println(h);
        }
        
        Set<Human> treeSet = new TreeSet<>(humans);
        System.out.println("\nc) TreeSet (естественная сортировка):");
        for (Human h : treeSet) {
            System.out.println(h);
        }
        
        Set<Human> treeSetByLName = new TreeSet<>(new HumanComparatorByLName());
        treeSetByLName.addAll(humans);
        System.out.println("\nd) TreeSet с компаратором по фамилии:");
        for (Human h : treeSetByLName) {
            System.out.println(h);
        }
        
        Set<Human> treeSetByAge = new TreeSet<>(new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return Integer.compare(h1.getAge(), h2.getAge());
            }
        });
        treeSetByAge.addAll(humans);
        System.out.println("\ne) TreeSet с компаратором по возрасту:");
        for (Human h : treeSetByAge) {
            System.out.println(h);
        }
    }
}