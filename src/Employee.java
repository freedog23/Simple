import java.util.Date;
import java.util.GregorianCalendar;

abstract class Person implements Cloneable{

    private String name;

    Person(String name) {this.name = name; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public abstract double getSalary();
}
class Employee extends Person implements Comparable<Employee> {

    private double salary;
    private Date hireDay;
    private int id;
    private static int nextId = 1;

    Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay = new GregorianCalendar(year, month - 1, day).getTime();
        id = nextId;
        nextId++;
    }

    public double getId() { return id; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    public Date getHireDay() { return hireDay; }
    public void raiseSalary(double byPercent) { salary *= 1 + byPercent / 100; }
    public void setHireDay(int year, int month, int day) {
        hireDay = new GregorianCalendar(year, month - 1, day).getTime();
    }
    
    public String toString() { return getName() + " "
            + getSalary() +  " " + getHireDay(); }
    
    @Override
    public Employee clone() throws CloneNotSupportedException{
        Employee e = (Employee)super.clone();
        e.hireDay = (Date)hireDay.clone();
        return e;
    }
    
    
    @Override
    public boolean equals(Object otherObject) {

        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;

        Employee other = (Employee)otherObject;

        return getName().equals(other.getName())
                && salary == other.salary
                && hireDay.equals(other.hireDay);
    }

    @Override
    public int hashCode() {
        return 11 * getName().hashCode()
                + 7 * new Double(salary).hashCode()
                + 13 * hireDay.hashCode();
    }

    public int compareTo(Employee other) {

        return(salary < other.salary ? -1 : (salary == other.salary ? 0 : 1));

        /*if (salary > other.salary) return 1;
        if (salary < other.salary) return -1;
        return 0;*/
    }
}