public class MIT {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        MIT A = new MIT();
        A.name = "Vaishnavi";
        A.rollNo = 23;
        A.display();
    }
}
