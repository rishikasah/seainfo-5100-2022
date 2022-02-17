package homework2;

public class Rectangle extends Shape1 {

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(){ super(); }

    public Rectangle(String name){ super(name); }

    public Rectangle(double length, double width){
        super("Rectangle");
        this.length = length;
        this.width=width;
    }

    public void  computeArea(){
        setArea(length * width);
    }

    public void computePerimeter(){
        setPerimeter((2 * length) + (2 * width));
    }
}
