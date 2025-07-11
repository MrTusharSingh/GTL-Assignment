public class SquareCalculator {
    public static int square(int num) {
        return num * num;
    }
    
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Square of " + number + " is: " + square(number));
    }
}