package homework1;

/*
 *  Question 10 - Homework 1
 *  Implement a class Box class Box {
 *  double width;
 * double height;
 * double depth;
 * }
 * Initialize the value through constructor. Write a function to calculate the box volume.
 */
public class Box {

    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double volume(){
        return width * height * depth;
    }
}
