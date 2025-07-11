public class Box {
    int length, width, height;

    public Box() {
        length = width = height = 1;
    }

    public Box(int side) {
        length = width = height = side;
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void display() {
        System.out.println("Dimensions: " + length + "x" + width + "x" + height);
    }

    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(2, 3, 4);

        box1.display();
        box2.display();
        box3.display();
    }
}