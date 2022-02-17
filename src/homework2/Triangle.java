package homework2;

public class Triangle extends Shape {

    private double base;
    private double height;
    private double side;


    public Triangle(double base, double height){
        super("Right Angled Triangle", "Blue");
        this.base=base;
        this.height=height;
    }

    public Triangle(double side){
        super("Equilateral Triangle", "Blue");
        this.side=side;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){

        double area;
        if(getName().equals("Equilateral Triangle")){
            area = (Math.cbrt(3.0) * side * side ) / 4;
        } else
            area = 0.5 * base * height;

        setArea(area);
        return area;
    }

    public double getPerimeter(){
        double perimeter;
        if(getName().equals("Equilateral Triangle")){
            perimeter = 3 * side;
        } else
            perimeter = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)) + base + height;
        setPerimeter(perimeter);
        return perimeter;
    }


}
