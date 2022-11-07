import java.util.Objects;

public class Employee {
    private String fullName;
    private String department;
    private double salary;
    private static int counter = 0;
    private final int id;
    public Employee(String fullName, String department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }
    public int getId(){
        return id;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public static int getCounter(){
        return counter;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getSalary() {
        return salary;
    }
    public String getDepartment() {
        return department;
    }
    public String getFullName() {
        return fullName;
    }
    public String getInfo() {
        return fullName + ", " + department + ", " + salary;

    }
    @Override
    public boolean equals(Object o){
        if(o == null || this.getClass() != o.getClass())
            return false;
        if (this == o)
            return true;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && department == employee.department && Objects.equals(fullName, employee.fullName);
    }
    @Override
    public String toString(){
        return fullName + ", " + department + ", " + salary + " id сотрудника" + id;
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(fullName,department,salary,id);
    }
}


