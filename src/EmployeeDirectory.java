import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    /**
     * Добавление сотрудника
     * @param employee сотрудник
     */
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    /**
     * Метод возвращение сотрудников по опыту
     * @param exp опыт
     * @return список сотрудников
     */
    public List<Employee> lookEmployeeByExperience(int exp){
        List<Employee> exEmployees = new ArrayList<>();
        for(Employee emp : employees){
            if(emp.getExperience() == exp){
                exEmployees.add(emp);
            }
        }
        return exEmployees;
    }

    /**
     * Метод возвращения списка телефонов по имени сотрудников
     * @param name имя
     * @return список телефонов
     */
    public List<String> getPhoneNumberByName(String name){
        List<String> phones = new ArrayList<>();
        for(Employee emp : employees){
            if(emp.getName().equals(name)){
                phones.add(emp.getPhoneNumber());
            }
        }
        return phones;
    }

    /**
     * Поиск сотрудников по табельному номеру
     * @param personalNumber Табельный номер
     * @return Сотрудник
     */
    public Employee lookEmployeeByPersonnelNumber(int personalNumber){
        for(Employee emp : employees){
            if(emp.getPersonnelNumber() == personalNumber){
                return emp;
            }
        }
        return null;
    }
}
