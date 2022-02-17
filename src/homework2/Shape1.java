package homework2;

public class Shape1 {

    private String name;
    private double perimeter;
    private double area;

    public Shape1(){
    }

    public Shape1(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void display(){
        System.out.println( "The shape is  - "  + name + " . The perimeter is - " + perimeter + " . The Area is  - " + area);
    }
}
