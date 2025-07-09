public class OverloadSum {

    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
       OverloadSum a = new OverloadSum();
        System.out.println("Sum (int): " + a.sum(3, 3));
        System.out.println("Sum (double): " + a.sum(3.4, 4.2));
    }
}
