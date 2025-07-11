public class NonStaticDemo {
    public void display() {
        System.out.println("This is a non-static method");
    }
    
    public static void main(String[] args) {
        NonStaticDemo obj = new NonStaticDemo();
        obj.display();
    }
}