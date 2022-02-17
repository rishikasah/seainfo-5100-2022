package homework2;

public class Shapetester {

    public static void main(String args[])
    {
        Shape s = new Shape("Shape", "Black");
        Triangle  t1 = new Triangle(10);
        Triangle t2 = new Triangle(3, 4);

        System.out.println("---------TRIANGLE---------");
        t1.getArea();
        t1.getPerimeter();
        System.out.println(t1.printShape());

        System.out.println("------------------");

        t2.getArea();
        t2.getPerimeter();
        System.out.println(t2.printShape());

        System.out.println("--------RHOMBUS----------");

        Rhombus r1 = new Rhombus(8);
        Rhombus r2 = new Rhombus(16,25);

        r1.getArea();
        r1.getPerimeter();
        System.out.println(r1.printShape());

        System.out.println("------------------");

        r2.getArea();
        r2.getPerimeter();
        System.out.println(r2.printShape());

        System.out.println("--------SHAPE----------");
        s.getArea();
        s.getPerimeter();
        System.out.println(s.printShape());
    }
}
