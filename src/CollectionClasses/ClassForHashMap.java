package CollectionClasses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class ClassForHashMap 
{
    // Stvaranje HashMap 
    public static void getHashMap(){

        Map<Integer, String> map = new HashMap<>();
        
        // dodavanje Key value maping
        map.put(1, "Ovo");
        map.put(12, "Možda");
        map.put(123, "Koliko");
        System.out.println(map.toString());

        // dodavanje null key
        map.put(null, "default");
        map.put(null, "String"); // u slučaju da damo istu vrijedno ključa (key) originali zapis se prepisuje sa novo vrijednošču
        System.out.println(map.toString()); 
    }

    // provjera da li je hashMap prazna
    public static void checkHashMap() {
        
        Map<Integer, String> map = new HashMap<>();
        Random rnd = new Random();
        int check = rnd.nextInt(2);
        if (check == 1)
        {
            map.put(1, "Ovo");
            map.put(12, "Možda");
            map.put(123, "Koliko");
        }
        
        System.out.println(map.isEmpty());
    }

    
    public static void checkKeyValue() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ovo");
        map.put(2, "Možda");
        map.put(9, "Koliko");
        Random rnd = new Random();
        int check = rnd.nextInt(10);        
        
        // Provjera da li hashMap sadržava key
        if (map.containsKey(check))
        {
            System.out.println("Elemnet pod ključem " + check+ " postoji");
        }
        else
        {
            System.out.println("Elemnet pod ključem " + check+ " ne postoji");
        }

        // provjera vrijednosti
        if (map.containsValue("Koliko"))
        {
            System.out.println("Elemnet sa vrijednošču Koliko psotoji");
        }
        else
        {
            System.out.println("Elemnet sa vrijednošču Koliko ne psotoji");
        }

        // dohvaćanje vrijednosti preko key
        String v1 = map.get(2);
        System.out.println(v1);

        // micanje key value iz mape
        map.remove(2);
        System.out.println(map.toString());

        // dohvaćanje ključeva iz hashMapa
        Set<Integer> key = map.keySet();
        System.out.println(key);

        // dohvaćanje vrijednosti iz hashMape
        Collection<String> values = map.values();
        System.out.println(values);

        // iteracija kroz hashMap
        for (Map.Entry<Integer,String> entry : map.entrySet())
        {
            System.out.println("Ključ: " +entry.getKey() + " Vrijednost: "+ entry.getValue());
        }

        // koristeći forEach metodu
        map.forEach((K,V) -> {System.out.println("Ključ: "+K +" Vrijendost: "+V);});

    }
}
