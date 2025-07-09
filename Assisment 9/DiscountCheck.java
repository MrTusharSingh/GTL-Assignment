public class DiscountCheck {
    public static void main(String[] args) {
        int ashraf = 650;
        if (ashraf >= 1000)
            System.out.println("20% discount");
        else if (ashraf >= 500)
            System.out.println("10% discount");
        else if (ashraf >= 200)
            System.out.println("5% discount");
        else
            System.out.println("No discount");
    }
}
