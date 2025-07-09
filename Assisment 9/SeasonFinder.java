public class SeasonFinder {
    public static void main(String[] args) {
        int arham = 12;
        if (arham == 12 || arham == 1 || arham == 2)
            System.out.println("Winter");
        else if (arham >= 3 && arham <= 5)
            System.out.println("Spring");
        else if (arham >= 6 && arham <= 8)
            System.out.println("Summer");
        else if (arham >= 9 && arham <= 11)
            System.out.println("Autumn");
        else
            System.out.println("Invalid month");
    }
}
