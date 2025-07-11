public class OverloadingDemo {
    public void display() {
        System.out.println("No parameters");
    }
    
    public void display(int num) {
        System.out.println("Integer: " + num);
    }
    
    public void display(String str) {
        System.out.println("String: " + str);
    }
    
    public void display(int num1, int num2) {
        System.out.println("Two integers: " + num1 + ", " + num2);
    }
    
    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();
        obj.display();
        obj.display(10);
        obj.display("Hello");
        obj.display(5, 10);
    }
}