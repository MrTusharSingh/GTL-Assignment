public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator aashiya = new Calculator();
        System.out.println("Add: " + aashiya.add(10, 5));
        System.out.println("Subtract: " + aashiya.subtract(10, 5));
        System.out.println("Multiply: " + aashiya.multiply(10, 5));
        System.out.println("Divide: " + aashiya.divide(10.0, 5.0));
    }
}

