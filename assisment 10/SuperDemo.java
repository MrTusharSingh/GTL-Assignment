class Parent {
    String message = "Parent message";
}

class Child extends Parent {
    String message = "Child message";
    
    void display() {
        System.out.println("Child: " + message);
        System.out.println("Parent: " + super.message);
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}