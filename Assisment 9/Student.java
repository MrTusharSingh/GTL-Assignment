public class Student {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student aashiya = new Student();
        aashiya.name = "Aashiya";
        aashiya.rollNo = 23;
        aashiya.display();
    }
}
