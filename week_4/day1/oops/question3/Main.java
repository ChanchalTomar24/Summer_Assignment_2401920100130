public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();
        System.out.println("Default Constructor:");
        p1.display();

        Point p2 = new Point(10, 20);
        System.out.println("Parameterized Constructor:");
        p2.display();

        p2.setX(30);
        p2.setY(40);
        System.out.println("After setX() and setY():");
        p2.display();

        p2.setXY(50, 60);
        System.out.println("After setXY():");
        p2.display();
    }
}