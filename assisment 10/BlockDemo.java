public class BlockDemo {

    static {
        System.out.println("Static block executed");
    }

    {
        System.out.println("Instance block executed");
    }

    public BlockDemo() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        new BlockDemo();
        System.out.println("Main method ended");
    }
}