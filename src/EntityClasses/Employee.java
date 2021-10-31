package EntityClasses;

public class Employee 
{
    private int id;
    private String name;
    private String lastName;
    private short age;
    
    public Employee() {
        
    }

    public Employee(int id, String name, String lastName, short age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee [age=" + age + ", id=" + id + ", lastName=" + lastName + ", name=" + name + "]";
    }

    
}
