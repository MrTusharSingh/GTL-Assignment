public class LargestOfThree {
    public static void main(String[] args) {
        int aashiya = 22, ashraf = 33, arham = 17;
        if (aashiya >= ashraf && aashiya >= arham)
            System.out.println("Largest: " + aashiya);
        else if (ashraf >= aashiya && ashraf >= arham)
            System.out.println("Largest: " + ashraf);
        else
            System.out.println("Largest: " + arham);
    }
}
