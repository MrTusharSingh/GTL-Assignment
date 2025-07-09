public class OverloadSum {

    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadSum ashraf = new OverloadSum();
        System.out.println("Sum (int): " + ashraf.sum(5, 8));
        System.out.println("Sum (double): " + ashraf.sum(3.5, 6.2));
    }
}
