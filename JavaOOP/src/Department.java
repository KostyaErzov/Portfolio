// Поздравляю чувак ты открыл файл для повторениния Ты хоть что-то помнишь?
// интренет тебе в помощь и видео Эда.
import java.util.Arrays;
import java.util.Comparator;

public class Department {
    //обьявляем поля класса
    private String departmentName;
    private Employee[] employees;

    //Конструктор создает департамент по имени
    Department(String departmentName){
        this.departmentName = departmentName;
    }
    //Конструктор создает департамент с работниками но без имени
    Department(Employee[] employees){
        this.employees = employees;
    }

    //получить имя департамента
    public String getDepartmentName() {
        return this.departmentName;
    }

    //изменить имя департамента
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    //получить количество сотрудников
    public int getEmployeesCount(){
        return this.employees.length;
    }

    //получить зарплату всех сотрудников департамента
    public int getTotalEmployeesSalary(){
        int salary = 0;
        for (Employee emp : this.employees){
            salary += emp.getSalary();
        }
        return salary;
    }

    //получить экземпляр сотрудника(ссылку на объект) по фамиилии и имени
    public Employee getEmployeeByFullName(String lastName, String firstName){
        Employee findEmp = null;
        for (Employee emp : this.employees){
            if (emp.getLastName().equals(lastName) && emp.getFirstName().equals(firstName)){
                findEmp = emp;
            }
        }
        return findEmp;
    }

    // тут добавляем в массив +1 (прием на работу)
    //гугл в помощь
    public void addNewEmployee(Employee newEmployee) {
        Employee[] newEmploees = new Employee[this.employees.length + 1];
        System.arraycopy(this.employees, 0, newEmploees, 0, this.employees.length);
        newEmploees[this.employees.length] = newEmployee;
        this.employees = newEmploees;
    }

    // пробегаемся по массиву
    public void showDepartmentInfo(){
        for (Employee emp : this.employees){
            System.out.println(emp.getFirstName());
            System.out.println(emp.getLastName());
            System.out.println(emp.getPosition());
            System.out.println(emp.getSalary());
            System.out.print("\n\n");
          //  emp.getFirstName().compareTo(emp.getLastName());
        }
    }

    // метод, возвращающий массив работников отдела
    public Employee[] getEmployees(){
        return this.employees;
    }

    // метод, возвращающий массив работников отдела, отсортированный по фамилиям
    // (и если одинаковые фамилии – то по именам)
    public Employee[] getEmployeesSortByLastName(){
        Employee[] sortEmployees = this.getEmployees();
        Arrays.sort(sortEmployees, new Comparator<Employee>() {
            @Override
            public int compare(Employee em1, Employee em2) {
                if (em1.getFirstName().equals(em2.getFirstName())) {
                    return em1.getFirstName().compareTo(em2.getFirstName());
                }
                return em1.getLastName().compareTo(em2.getLastName());
            }
        });
        return sortEmployees;
    }

    //метод, возвращающий массив работников отдела,  с увольнением
    // Че забыл что такое "++" ищи Инкремент
    public void fireEmployee(String lastName, String firstName, String position) {
        for (int removedIdx = 0; removedIdx < this.employees.length; removedIdx++) {
            Employee employee = this.employees[removedIdx];
            if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)
                    && employee.getPosition().equals(position)) {

                Employee[] newEmployees = new Employee[this.employees.length - 1];
                System.arraycopy(this.employees, 0, newEmployees, 0, removedIdx);
                if (this.employees.length != removedIdx) {
                    System.arraycopy(this.employees, removedIdx + 1, newEmployees, removedIdx,
                            this.employees.length - removedIdx - 1);
                }
                this.employees = newEmployees;
            }
        }
    }
}
// все понял? Если да открывай ДЗ№ 12 и не подглядывая делай, заплужил читай снова. Удачи бро будущего))))
