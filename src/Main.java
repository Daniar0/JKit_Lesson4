import task1.Employee;
import task1.EmployeeDirectory;

import java.util.List;

/**Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
 Стаж
 Добавить метод, который ищет сотрудника по стажу (может быть список)
 Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавления нового сотрудника в справочник
*/


public class Main {
    public static void main(String[] args) {
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        Employee employee1=new Employee(1,"536588","Jhon", 4);
        Employee employee2=new Employee(2,"536324","Kevin", 10);

        employeeDirectory.addEmployee(employee1);
        employeeDirectory.addEmployee(employee2);
        System.out.println(employee1);
        System.out.println(employee2);

        List<Employee> employeeWithExperience10=employeeDirectory.searchByExperience(10);
        for(Employee employee:employeeWithExperience10){
            System.out.println("Табельный номер: " + employee.getEmpId());
            System.out.println("Имя: " + employee.getName());
        }
        List<String> phoneNumbers=employeeDirectory.getPhoneNumbersByName("Jhon");
        System.out.println("номер телефона сотрудника Jhon: " );
        for(String phoneNumber:phoneNumbers){
            System.out.println(phoneNumber);
        }
        //поиск сотрудника по табельному номеру
        Employee employee=employeeDirectory.searchByEmployeeId(2);
        if(employee!=null){
            System.out.println("сотрудник с табельным номером 2 найден:");
            System.out.println("табельный номер: " + employee.getEmpId());
            System.out.println("имя: " + employee.getName());
        }else {
            System.out.println("сотрудник с табельным номером 2 не найден");
        }



    }
}