public class Employee {
    private int salary;
    private int department;
    private final String fullName;
    private final int id;
    private static int counter = 0;

    public Employee (String fullName, int department, int salary){
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getDepartment(){
        return department;
    }

    public void setDepartment(int department){
        this.department = department;
    }



    public String getFullName(){
        return this.fullName;
    }


    @Override
    public String toString() {
        return "Сотрудника {" +
                "Зарплата = " + salary +
                ", Отдел №" + department +
                ", ФИО: " + fullName +
                ", id=" + id +
                '}';
    }



}

