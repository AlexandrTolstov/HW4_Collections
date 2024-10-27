import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();

        employeeDirectory.addEmployee(new Employee(63325421, "7845698456", "Павел", 12));
        employeeDirectory.addEmployee(new Employee(62451326, "7546651545", "Василий", 10));
        employeeDirectory.addEmployee(new Employee(46655235, "7365478932", "Вероника", 8));
        employeeDirectory.addEmployee(new Employee(47965445, "7699547233", "Игорь", 14));
        employeeDirectory.addEmployee(new Employee(63325421, "7365498871", "Александр", 8));
        employeeDirectory.addEmployee(new Employee(46655235, "7546212454", "Вероника", 10));

        System.out.println("\nСотрудники со стажем работы 8 лет:");
        System.out.println(employeeDirectory.lookEmployeeByExperience(8));

        System.out.println("\nНомера телефонов Вероник:");
        System.out.println(employeeDirectory.getPhoneNumberByName("Вероника"));

        System.out.println("\nСотрудники с табельным номером 63325421");
        System.out.println(employeeDirectory.lookEmployeeByPersonnelNumber(63325421));
    }
}