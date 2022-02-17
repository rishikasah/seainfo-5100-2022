package homework2;

public class Rhombus extends  Shape{

    private double diagnol1;
    private double diagnol2;

    public Rhombus(double diagnol1, double diagnol2){
        super("Rhombus", "Green");
        this.diagnol1=diagnol1;
        this.diagnol2=diagnol2;
    }

    public Rhombus(double diagnol){
        super("Rhombus", "Green");
        this.diagnol1=diagnol;
        this.diagnol2=diagnol;
    }

    public double getDiagnol1() {
        return diagnol1;
    }

    public void setDiagnol1(double diagnol1) {
        this.diagnol1 = diagnol1;
    }

    public double getDiagnol2() {
        return diagnol2;
    }

    public void setDiagnol2(double diagnol2) {
        this.diagnol2 = diagnol2;
    }

    public double getArea(){

        double area = 0.5 * diagnol2 * diagnol1;
        setArea(area);
        return area;
    }

    public double getPerimeter(){
        double perimeter = 4 * Math.sqrt(Math.pow((diagnol1/2), 2) + Math.pow((diagnol2/2),2));
        setPerimeter(perimeter);
        return perimeter;
    }





}
