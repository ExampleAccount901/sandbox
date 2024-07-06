public class Employee extends Person {
    protected String id;

    public Employee(String name, String id) {
        super(name);
        this.id = id;
    }

    public void doWork() {
        System.out.println(name + " is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
