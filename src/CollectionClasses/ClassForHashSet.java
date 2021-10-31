package CollectionClasses;

import java.util.*;

public class ClassForHashSet 
{
    // Hashset ne dozvoljava duplicirane vrijednosti 
    public static void ispisHashSet() {
        Set<String> set = new HashSet<>();
        set.add("Ovo je string");
        set.add("Ovo je string");
        set.add("Ovo je string");
        System.out.println(set.toString());
    }

    // HashSet dozvoljava null vrijdenosti ali samo jednu
    public static void nullHashSet() {
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add(null);
        System.out.println(set.toString());
    }

    // Hash set ne zadržava redosljed upisanih elemenata u listu
    public static void unorderedHashSet() {
        Set<String> set = new HashSet<>();
        set.add("Ovoje1"); 
        set.add("Ovoje2"); 
        set.add("Ovoje4"); 
        set.add("Ovoje3"); 
        set.add("Ovoje5");
        System.out.println(set.toString()); 
    }

    // Stvaranje HashSeta iz drugog collectiona
    public static void createHashSet() {
        Set<String> set = new HashSet<>();
        CollectionDemo c = new CollectionDemo();
        set.addAll(c.getObjectsFromCollection());
        System.out.println(set.toString());
        // ili
        Set<String> set2 = new HashSet<>(c.getObjectsFromCollection());
        System.out.println(set2);
    } 
}
