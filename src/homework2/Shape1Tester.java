package homework2;

public class Shape1Tester {

    public static void main(String args[])
    {
        Shape1 s = new Shape1();
        Rectangle r = new Rectangle(2.0,4.0);
        Circle c = new Circle(4.0);
        r.computeArea();
        r.computePerimeter();
        c.computeArea();
        c.computePerimeter();
        r.display();
        c.display();
        s.display();
    }
}
