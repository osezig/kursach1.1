public class Main {
    private static Employee[] employees = new Employee[10];
    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    public static Employee getMinSalary() {
        Employee result = employees[0];
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static Employee getMaxSalary() {
        Employee result = employees[0];
        double maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary() {
        return calculateTotalSalary() / Employee.getCounter();
    }

    public static void main(String[] args) {
        employees = new Employee[10];
        {
            employees[0] = new Employee("Биба Олег", " 1 отдел", 12000);
            employees[1] = new Employee("Боба Рахиб", "2 отдел", 13000);
            employees[2] = new Employee("Дартаньян Максим", "3 отдел", 14000);
            employees[3] = new Employee("Заноза МИхаил", "4 отдел", 15000);
            employees[4] = new Employee("Гдетыбыл Виктор", "5 отдел", 16000);
            employees[5] = new Employee("Почемутакдолго Афанасий", "1 отдел", 17000);
            employees[6] = new Employee("Сосиска Сергей", "2 отдел", 18000);
            employees[7] = new Employee("Маринад Василий", "3 отдел", 19000);
            employees[8] = new Employee("Тугой Дмитрий", "4 отдел", 20000);
            employees[9] = new Employee("Бесноватая Ольга", "5 отдел", 21000);
        }
        printEmployees();
        System.out.println("Средняя зарплата = " + calculateAverageSalary());
        System.out.println("Максимальная зарплата = " + getMaxSalary());
        System.out.println("Минимальная зарплата = " + getMinSalary());
        System.out.println("Сумма затрат на зарплаты = " + calculateTotalSalary());
    }
}

