package homework2;

public class Shape {

    private String name;
    private String color;
    private double area;
    private double perimeter;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, double area, double perimeter) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public String printShape(){

        StringBuilder sb =new StringBuilder();
        sb.append("The class name is  - ").append(name);
        sb.append(". The color is -").append(color);
        sb.append(". The perimeter is  - ").append(perimeter);
        sb.append(". The area is  -  ").append(area);

        return sb.toString();
    }
}
