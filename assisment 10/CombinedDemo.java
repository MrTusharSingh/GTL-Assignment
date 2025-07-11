abstract class AbstractClass {
    abstract void abstractMethod();
}

interface MyInterface {
    void interfaceMethod();
}

class ConcreteClass extends AbstractClass implements MyInterface {
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implementation");
    }
    
    @Override
    public void interfaceMethod() {
        System.out.println("Interface method implementation");
    }
}

public class CombinedDemo {
    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass();
        obj.abstractMethod();
        obj.interfaceMethod();
    }
}