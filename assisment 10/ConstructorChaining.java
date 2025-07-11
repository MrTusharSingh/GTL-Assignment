class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child constructor");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        new Child();
    }
}