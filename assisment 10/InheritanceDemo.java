class Parent {
    void displayParent() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("Child class method");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayParent();
        child.displayChild();
    }
}