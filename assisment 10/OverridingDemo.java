class Parent {
    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    @Override
    void display() {
        super.display();
        System.out.println("Child display");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}