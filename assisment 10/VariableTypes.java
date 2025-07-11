public class VariableTypes {
    int instanceVar = 10;

    static int staticVar = 20;

    public void printVariables() {

        int localVar = 30;

        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
        System.out.println("Local variable: " + localVar);
    }

    public static void main(String[] args) {
        VariableTypes obj = new VariableTypes();
        obj.printVariables();
    }
}