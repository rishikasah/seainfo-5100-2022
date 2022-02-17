package homework2;

public class Circle extends Shape1 {

    private double radius;

    public Circle(){  super(); }

    public Circle(String name){
        super(name);
    }

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void  computeArea(){
        setArea( Math.PI * radius * radius);
    }

    public void computePerimeter(){
        setPerimeter(2 * Math.PI * radius);
    }

}
