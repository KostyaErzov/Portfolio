public class MyApp {
    public static void main(String[] agrs){
        Employee emp1= new Employee("Kolya","Igor");
        emp1.info();

        System.out.println("\n");
        Employee emp2= new Employee("Vanya","Petrov","manager",50000);
        emp2.info();
        String name= emp1.getFirstName();
        System.out.println("\n\n"+name);

        String name1= emp1.getLastName();
        System.out.println("\n\n"+name1);

        String name2= emp2.getPosition();
        System.out.println("\n\n"+name2);

         int salary= emp2.getSalary();
         System.out.println("\n\n"+salary);
// менял имя,фамилию и должность чувака и смотрел как оно измениться
        System.out.println("\n\n"+emp1.getFirstName());
        emp1.setFirstName("Bob");
        System.out.println("\n\n"+emp1.getFirstName());

        System.out.println("\n\n"+emp1.getLastName());
        emp1.setLastName("Petrovich");
        System.out.println("\n\n"+emp1.getLastName());

        System.out.println("\n\n"+emp2.getPosition());
        emp2.setPosition("barman");
        System.out.println("\n\n"+emp2.getPosition());

        System.out.println("\n\n"+emp2.getSalary());
        emp2.setSalary(35000);
        System.out.println("\n\n"+emp2.getSalary());
// создавал масив
        Employee[] emps = new Employee[] {emp1, emp2};
//создал департамент через конструкор который принимает масив работников
        Department department = new Department(emps);
        salary = department.getTotalEmployeesSalary();
//получил работника по ФИО если нашли то выводим
        var findEmp= department.getEmployeeByFullName("Petrov", "Vanya");

       if (findEmp != null) {
           findEmp.info();
       } else {
           System.out.println("\n couldn't find employee\n");
        }
        department.showDepartmentInfo();
        Employee emp3 = new Employee("Igor", "Igor");
        department.addNewEmployee(emp3);
        department.showDepartmentInfo();
       System.out.println(department.getEmployeesCount());
// возвращаем массив работников отдела, отсортированный по фамилиям
// (и если одинаковые фамилии – то по именам).
       var newEmployeesArray = department.getEmployeesSortByLastName();
        department.showDepartmentInfo();
// возвращающий массив работников отдела, отсортированный по фамилиям
// (и если одинаковые фамилии – то по именам).
        System.out.println("-----------------------------------------");
        department.fireEmployee("Igor", "Igor", "engineer");
        department.showDepartmentInfo();
    }
 }
