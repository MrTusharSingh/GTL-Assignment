public class LeapYearCheck {
    public static void main(String[] args) {
        int ashraf = 2024;
        if ((ashraf % 4 == 0 && ashraf % 100 != 0) || (ashraf % 400 == 0))
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}

