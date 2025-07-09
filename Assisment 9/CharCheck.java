public class CharCheck {
    public static void main(String[] args) {
        char arham = 'g';
        if ((arham >= 'a' && arham <= 'z') || (arham >= 'A' && arham <= 'Z')) {
            if ("aeiouAEIOU".indexOf(arham) != -1)
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        } else
            System.out.println("Not a letter");
    }
}
