package CollectionClasses;


import java.util.LinkedList;


import EntityClasses.Employee;

public class LinkedListClass 
{
    // stavaranje linked liste 
    public LinkedList<Employee> getLinkedList(){
        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.add(new Employee(10,"Kristian", "Manolić", (short)26));
        linkedList.add(new Employee(8456,"Korana", "Mano", (short)84));
        linkedList.add(new Employee(231,"Mirka", "Mikić", (short)27));
        return linkedList; 
    }

    // dodavanje elementa (node) na specifićnu poziciju
    public LinkedList<Employee> addEmployeeOnIndex(LinkedList<Employee> list, int index) {

        list.add(index, new Employee(54,"Ivan","Ivić",(short) 77));
        return list;
    }

    // dodavanje ementa na prvu poziciju
    public LinkedList<Employee> addFirst(LinkedList<Employee> list, Employee employee) {

        list.addFirst(employee);
        return list;
    }

    public LinkedList<Employee> addLast(LinkedList<Employee> list, Employee employee) {
        list.addLast(employee);
        return list;
    }
}

