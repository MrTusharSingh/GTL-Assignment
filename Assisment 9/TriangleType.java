public class TriangleType {
    public static void main(String[] args) {
        int aashiya = 10, ashraf = 10, arham = 5;
        if (aashiya == ashraf && ashraf == arham)
            System.out.println("Equilateral");
        else if (aashiya == ashraf || ashraf == arham || aashiya == arham)
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");
    }
}
