public class Employees {
    String name;
    double salary;

    public Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employees emp = new Employees("John Doe", 50000);
        emp.display();
    }
}