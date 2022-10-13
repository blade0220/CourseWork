import java.util.Arrays;

public class Main {

    private static final Employee[] employees = new Employee [10];
    public static void main(String[] args) {

        employees[0] = new Employee("Иванова Анна Викторовна", 1,70_000);
        employees[1] = new Employee("Семёнов Алексей Анатольевич", 1,50_000);
        employees[2] = new Employee("Аксенов Семён Николаевич", 2, 90_000);
        employees[3] = new Employee("Алексеева Татьяна Михайловна", 2, 85_000);
        employees[4] = new Employee("Зорина Любовь Станиславовна", 3, 75_000);
        employees[5] = new Employee("Васильева Мария Васильевна", 3, 80_000);
        employees[6] = new Employee("Петров Игорь Алексеевич", 4, 95_000);
        employees[7] = new Employee("Любимов Василий Григорьевич", 4, 80_000);
        employees[8] = new Employee("Михайлова Анастасия Генадьевна", 5, 55_000);
        employees[9] = new Employee("Павлов Георгий Афанасьевич", 5, 65_000);

        for (int i = 0; i < employees.length; i++)
        System.out.println(employees[i].toString());

        System.out.println("Итого израсходовано на зарплату сотрудников " + calculateSumSalary());

        System.out.println("Максимальная зарплата " + getEmployeeWithMaxSalary());

        System.out.println("Минимальная зарплата " + getEmployeeWithMinSalary());
        System.out.println("Средняя зарплата равна: " + middleSumSalary());
        printEmployeesName();

    }

    public static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }



//    for (int i = 0; i < employees.length; i++){
//        if (employees[i] != null){
//            System.out.println(employees[i]);
//        }
//    }

    public static double middleSumSalary() {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < employees.length; i++){
            if (employees[i] != null) {
                count++;
                sum += employees[i].getSalary();
            }
        }
        sum = sum / count;
        return sum;
    }

    public static void printEmployeesName(){
       for (Employee employee:employees) {
           if (employee != null) {
               System.out.println(employee.getFullName());

           }
       }
    }

    public static Employee getEmployeeWithMaxSalary(){
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees){
            if (employee != null && employee.getSalary() > max){
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static Employee getEmployeeWithMinSalary(){
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees){
            if (employee != null && employee.getSalary() < min){
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }
}