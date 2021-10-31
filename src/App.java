import CollectionClasses.ClassForHashMap;

public class App {
    public static void main(String[] args) {

       ClassForHashMap.getHashMap();
       ClassForHashMap.checkHashMap();
       ClassForHashMap.checkKeyValue();
       
    }

    // private class InfoArray {
        // Array je indeksinarno polje koje pohranjuje homogenu vrstu podataka te je fiksne veličine.
        // Array je objekt pa možemo koristi keyword new, tj trebamo ga stvoriti

        // Primejr Arraya  int [] array = new int[1000], char[] array = new char[100]

        // Klasa Object je superklasa od koje nasljeđuju sve klase te omogućuje upisivanje različitih objekta u polje odnosno array
        // Primejr
        // Object[] objects = new Object[10];
        // objcets[0] = new Object();
        // objcets[1] = new Object();
        // objcets[2] = new Object();

        // Nedostaci arraya
        // 1. Pohranjuju samo homogenu vrstu podataka
        // 2. Array je fiksne veličine
        // 3. ready made APIs se ne mogu koristi u arrayevima(poljima)

        // Collections su uvedeni kako bi se otklnili nedostaci polja koji su navedeni u predhodnome
    // }

    /* Dio iz Collection demo za glavnu metodu
        {
        CollectionDemo newCollectionObj = new CollectionDemo();
        Collection<String> collection = newCollectionObj.getObjectsFromCollection();
        System.out.println(collection);

        System.out.println("Upišite String koji želite provijeriti");
        Scanner scan = new Scanner(System.in);
        String provjera = scan.nextLine();

        newCollectionObj.provjeraUpisa(provjera, collection);

        System.out.println("Upišite String koji želite izbaciti iz collectiona");
        String izbaci = scan.nextLine();

        collection = newCollectionObj.izbaciObjektIzCollectiona(izbaci, collection);
        System.out.println(collection);

        collection.forEach((ispis) -> System.out.println(ispis));

        collection.clear();
        System.out.println(collection);
        }
    */

    /* Dio iz ArrayList za glavnu metodu
    {
        ListArrayDemo listObj = new ListArrayDemo();
        Scanner scan = new Scanner(System.in);

        System.out.println("Upišite kapacitet liste");
        int capacity = scan.nextInt();

        List<String> arrayList = listObj.createEmptyArrayListWithCapacity(capacity);

        // popunjavanje liste random sa random stringom

        String rndString ="QWERTZUIOPASDFGHJKLYXCVBNM";
        
        for (int i = 0; i< capacity; i++)
        {
            String newString = "";
            for (int j =0; j<=10; j++)
            {
                Random random = new Random();
                int slovo = random.nextInt(26);
                newString = newString+rndString.charAt(slovo);
            }
            arrayList.add(newString);
        }

        if (!listObj.isArrayEmpty(arrayList))
        {
            System.out.println(listObj.getSizeOfArray(arrayList));
            for (int i = 0; i < arrayList.size(); i++)
            {
                System.out.println(arrayList.get(i));
            }          
        }
        else
        {
            for(int i =0; i < capacity; i++)
            {
                arrayList.set(i, "Ovo je prazan string!");
            }
        }

        System.out.println("Upišite index pod koijm želite izbaciti element iz polja. Opcije su sljedeće 0 - " + (arrayList.size()-1));
        int index = scan.nextInt();
        arrayList.remove(index);

        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee(10,"Kristian", "Manolić", (short)26));
        employeesList.add(new Employee(8456,"Korana", "Mano", (short)84));
        employeesList.add(new Employee(231,"Mirka", "Mikić", (short)27));

        List<Employee> sortByAge = new ArrayList<>(employeesList);
        Collections.sort(sortByAge, (o1, o2) -> (int) (o2.getAge() - o1.getAge())); // sortiranje po godinama Silazno DESC
        System.out.println(sortByAge);

        List<Employee> sortByName = new ArrayList<>(employeesList);
        Collections.sort(sortByName, (o1, o2) -> (o1.getName().compareTo(o2.getName()))); // sortiranje po imenu uzlaszno ASC
        System.out.println(sortByName);
    }
    
    */

    /*
    // Dio iz glavne metode za LinkedList
    {
         LinkedListClass linkedListObj = new LinkedListClass();
        Scanner scan = new Scanner(System.in);

        LinkedList<Employee> employeesList = linkedListObj.getLinkedList();
        System.out.println(employeesList);
        
        System.out.println("Upišite na kojoj pozici želite upisati novog zaposlenika");
        int index = scan.nextInt();
        LinkedList<Employee> newEmployeList = linkedListObj.addEmployeeOnIndex(employeesList, index);
        System.out.println(newEmployeList);

        Employee employeeFirst = new Employee();
        employeeFirst.setId(23);
        employeeFirst.setName("Mirko");
        employeeFirst.setLastName("Kralj");
        employeeFirst.setAge((short)46);
        employeesList = linkedListObj.addFirst(employeesList, employeeFirst);
        System.out.println(employeesList);

        Employee employeeLast = new Employee();
        employeeLast.setId(78952);
        employeeLast.setName("Monika");
        employeeLast.setLastName("Orguljić");
        employeeLast.setAge((short)26);
        employeesList = linkedListObj.addLast(employeesList, employeeLast);

        for (Employee e: employeesList) {
            System.out.println(e);
        }

        // Brisanje prvog elementa iz liste
        employeesList.removeFirst();

        // brisanje zadnjeg elementa iz liste
        employeesList.removeLast();

        // Dohvaćanje indexa elementa
        Employee fEmployee = new Employee(10, "Kristian", "Manolić", (short) 26); 
        int ind = employeesList.indexOf(fEmployee); // ako objekti imaju iste vrijednosti nisu jednaki jer se ne nalaze na istom mjestu u memoriji 
        // sto znači da nemaju isti hashCode, objekti su jednaki samo ako pokazuju na isto mjesto u memoriji. To ne vrijedi za String i ostal wraper objekte.
        System.out.println(ind);
        // brisanje elementa iz liste
        Employee rEmployee = employeesList.get(0);
        employeesList.remove(rEmployee);
        for (Employee e: employeesList) {
            System.out.println(e);
        }
    }
    */

    /*
    //Dio iz glavne metode za hashSet
    {
        ClassForHashSet.ispisHashSet();
       ClassForHashSet.nullHashSet();
       ClassForHashSet.unorderedHashSet();
       ClassForHashSet.createHashSet();

       Set<Integer> set = new HashSet<>();
       set.add(1);
       set.add(2);
       set.add(3);
       set.add(4);
       set.add(5);
       set.add(6);

       // micanje elementa iz hash seta
       set.remove(2);
       System.out.println(set.toString());

       // Iteracija kroz hashSet pomoću for petlje
       for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();)
       {
           Integer i = iterator.next();
           System.out.println(i);
       }

       // forEach method sa lambda izrazima
       set.forEach(s -> System.out.println(s.toString()));

       // stream sa lambda i forEach metodom
       set.stream().filter(i -> !i.equals(3)).forEach(i -> System.out.println(i)); // ispisuje sve brojeve koji nisu jednaki 3!

       // micanje skupa elementa iz hashSeta
       Set<Integer> set2 = new HashSet<>();
       set2.add(3);
       set2.add(4);
       set2.add(5);
       set.removeAll(set2);
       System.out.println(set);
    }
    */
}
