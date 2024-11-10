package task1;

import java.util.ArrayList;
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

public  class  EmployeeDirectory {
    private List<Employee> employees;


    public EmployeeDirectory() {
        employees = new ArrayList<>();
    }

    public List<Employee> searchByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<String> getPhoneNumbersByName(String name) {
        List<String> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                result.add(employee.getPhone());
            }
        }
        return result;
    }
    public Employee searchByEmployeeId(int empId) {
        for (Employee employee : employees) {
            if(employee.getEmpId()==empId){
                return employee;
            }
        }
        return null;
    }
    public void  addEmployee(Employee employee) {
        employees.add(employee);
    }
}


