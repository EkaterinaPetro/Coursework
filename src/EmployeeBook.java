import java.util.Objects;

public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public void printAmountOfSalaryPerMonth() {
        double amountOfSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                amountOfSalary = amountOfSalary + employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + amountOfSalary + " руб.");
    }

    public void printMinSalaryEmployee() {
        double minSalary = -1;
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < minSalary || minSalary == -1) {
                    minSalary = employee.getSalary();
                    minSalaryEmployee = employee;
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee);
    }

    public void printMaxSalaryEmployee() {
        double maxSalary = 0;
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    maxSalaryEmployee = employee;
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee);
    }

    public void printAverageSalary() {
        double amountOfSalary = 0;
        int employeesCount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                amountOfSalary = amountOfSalary + employee.getSalary();
                employeesCount++;
            }
        }
        amountOfSalary = amountOfSalary / employeesCount;
        System.out.println("Среднее значение зарплат: " + amountOfSalary);
    }

    public void printFullNames() {
        String[] fullNames = new String[employees.length];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                fullNames[i] = employees[i].getFullName();
                System.out.println(fullNames[i]);
            }
        }
    }

    public void indexAllSalarys(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() / 100 * percent + employee.getSalary());
            }
        }
        System.out.println("Зарплата всех сотрудников проиндексирована на " + percent + "%");
    }

    public void printMinSalaryEmployeeByDepartment(int department) {
        double minSalary = -1;
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                if (employee.getSalary() < minSalary || minSalary == -1) {
                    minSalary = employee.getSalary();
                    minSalaryEmployee = employee;
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + department + ": " + minSalaryEmployee);
    }

    public void printMaxSalaryEmployeeByDepartment(int department) {
        double maxSalary = 0;
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    maxSalaryEmployee = employee;
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой в отделе " + department + ": " + maxSalaryEmployee);
    }

    public void printAmountOfSalaryPerMonthByDepartment(int department) {
        double amountOfSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                amountOfSalary = amountOfSalary + employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц по " + department + " отделу: " + amountOfSalary + " руб.");
    }

    public void printAverageSalaryByDepartment(int department) {
        double amountOfSalary = 0;
        int employeesDepartment = 0;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                amountOfSalary = amountOfSalary + employee.getSalary();
                employeesDepartment++;
            }
        }
         double averageSalary = amountOfSalary / employeesDepartment;
        System.out.println("Среднее значение зарплат по " + department + " отделу: " + averageSalary + " руб.");
    }


    public void indexAllSalarysByDepartment(int department, double percent) {
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                employee.setSalary(employee.getSalary() / 100 * percent + employee.getSalary());
            }
        }
        System.out.println("В отделе " + department + " проиндексировали зарплату на " + percent + "%");
    }

    public void printEmployeesByDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                System.out.println(employee.toStringWithoutDepartment());
            }
        }
    }

    public void findEmployeesMinLimitSalary(double limit) {
        for (Employee employee : employees) {
            if (employee != null && limit > employee.getSalary()) {
                System.out.println(employee.toStringWithoutDepartment());
            }
        }
    }

    public void findEmployeesMaxLimitSalary(double limit) {
        for (Employee employee : employees) {
            if (employee != null && limit <= employee.getSalary()) {
                System.out.println(employee.toStringWithoutDepartment());
            }
        }
    }

    public void addEmployee(String fullName, int department, double salary) {
        Employee employee = new Employee(fullName, department, salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }

    public void deleteEmployee(String fullName, int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null
                    && (Objects.equals(fullName, employees[i].getFullName())
                    || id == employees[i].getId())) {
                employees[i] = null;
                break;
            }
        }
        System.out.println("Сотрудник удален");
    }

    public void changeSalary(String fullName, double newSalary) {
        for (Employee employee : employees) {
            if (employee != null && Objects.equals(fullName, employee.getFullName())) {
                employee.setSalary(newSalary);
                break;
            }
        }
        System.out.println("Зарплата сотрудника изменена");
    }

    public void changeDepartment(String fullName, int newDepartment) {
        for (Employee employee : employees) {
            if (employee != null && Objects.equals(fullName, employee.getFullName())) {
                employee.setDepartment(newDepartment);
                break;
            }
        }
        System.out.println("Отдел сотрудника изменен");
    }

    public void printFullNameByDepartment() {
        for (int department = 1; department < 6; department++) {
            System.out.println("Отдел " + department);
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getDepartment() == department) {
                    System.out.println(employees[i].getFullName());
                }
            }
        }
    }
}
