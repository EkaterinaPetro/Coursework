public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private static int nextId = 0;
    private int id;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        nextId++;
        this.id = nextId;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Ф.И.О. - " + fullName + ", ID - " + id + ", Отдел - " + department + ", Зарплата - " + salary;
    }

    public String toStringWithoutDepartment() {
        return "Ф.И.О. - " + fullName + ", ID - " + id + ", Зарплата - " + salary;
    }
}
