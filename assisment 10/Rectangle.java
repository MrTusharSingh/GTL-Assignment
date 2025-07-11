public class Rectangle {
    int length, width;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void display() {
        System.out.println("Length: " + length + ", Width: " + width);
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5, 10);

        rect1.display();
        rect2.display();
    }
}