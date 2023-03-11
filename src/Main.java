public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Власова Милана Фёдоровна", 3, 326000);
        employeeBook.addEmployee("Егорова Маргарита Николаевна", 4, 272000);
        employeeBook.addEmployee("Лебедев Владислав Сергеевич", 5, 139000);
        employeeBook.addEmployee("Малышева Алиса Львовна", 3, 184000);
        employeeBook.addEmployee("Мальцев Максим Константинович", 1, 55000);
        employeeBook.addEmployee("Миронова Милана Григорьевна", 4, 266000);
        employeeBook.addEmployee("Рудаков Илья Тимофеевич", 2, 73000);

        employeeBook.printEmployees();
        System.out.println("--------------------");
        employeeBook.printAmountOfSalaryPerMonth();
        System.out.println("--------------------");
        employeeBook.printMinSalaryEmployee();
        System.out.println("--------------------");
        employeeBook.printMaxSalaryEmployee();
        System.out.println("--------------------");
        employeeBook.printAverageSalary();
        System.out.println("--------------------");
        employeeBook.printFullNames();
        System.out.println("--------------------");
        employeeBook.indexAllSalarys(3);
        System.out.println("--------------------");
        employeeBook.printMinSalaryEmployeeByDepartment(3);
        System.out.println("--------------------");
        employeeBook.printMaxSalaryEmployeeByDepartment(4);
        System.out.println("--------------------");
        employeeBook.printAmountOfSalaryPerMonthByDepartment(4);
        System.out.println("--------------------");
        employeeBook.printAverageSalaryByDepartment(3);
        System.out.println("--------------------");
        employeeBook.printEmployeesByDepartment(1);
        System.out.println("--------------------");
        employeeBook.indexAllSalarysByDepartment(1, 2);
        System.out.println("--------------------");
        employeeBook.findEmployeesMinLimitSalary(100000);
        System.out.println("--------------------");
        employeeBook.findEmployeesMaxLimitSalary(250000);
        System.out.println("--------------------");
        employeeBook.deleteEmployee("Егорова Маргарита Николаевна", -1);
        System.out.println("--------------------");
        employeeBook.addEmployee("Сорокин Владислав Вадимович", 1, 99800);
        employeeBook.changeSalary("Мальцев Максим Константинович", 60000);
        System.out.println("--------------------");
        employeeBook.changeDepartment("Лебедев Владислав Сергеевич", 4);
        System.out.println("--------------------");
        employeeBook.printFullNameByDepartment();
        System.out.println("--------------------");
        employeeBook.printEmployees(); //список сотрудников после всех изменений
    }
}