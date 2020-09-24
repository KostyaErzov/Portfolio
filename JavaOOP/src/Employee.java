public class Employee {
    private String position;
    private int salary;
    private String firstName;
    private String lastName;

    Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = "engineer";
        this.salary = 30000;
    }

    Employee(String firstName, String lastName, String position, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    void info() {
        System.out.printf("Name: %s\nLastName: %s\nPosition: %s\nSalary: %d", firstName, lastName, position, salary);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPosition() {
        return this.position;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setFirstName(String name) {
       this.firstName = name;
    }

    public void setLastName(String name) {
       this.lastName = name;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
}