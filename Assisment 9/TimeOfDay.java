public class TimeOfDay {
    public static void main(String[] args) {
        int ashraf = 15;
        if (ashraf >= 6 && ashraf < 12)
            System.out.println("Morning");
        else if (ashraf >= 12 && ashraf < 16)
            System.out.println("Afternoon");
        else if (ashraf >= 16 && ashraf < 20)
            System.out.println("Evening");
        else
            System.out.println("Night");
    }
}
