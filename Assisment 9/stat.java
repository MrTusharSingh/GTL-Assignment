public class stat {

    public static void sayHello() {
        System.out.println("Hello from a static method! hehe");
    }

    public void sayHi() {
        System.out.println("Hi from a non-static method!");
    }

    public static void main(String[] args) {

        stat.sayHello();


        stat greetObj = new stat();
        greetObj.sayHi();
    }
}
