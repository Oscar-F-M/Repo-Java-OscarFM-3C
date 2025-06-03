package Model;

public class RectangleTriangle extends FigureAbs {

    private double ladoa;
    private double ladob;
    private double base;
    private double hypotenuse;

    public RectangleTriangle(double aside, double bside, double base, double hypotenuse){
        this.ladoa = aside;
        this.ladob = bside;
        this.base = base;
        this.hypotenuse = hypotenuse;
    }

    public double getAside() {
        return ladoa;
    }

    public void setAside(double aside) {
        this.ladoa = aside;
    }

    public double getBside() {
        return ladob;
    }

    public void setBside(double bside) {
        this.ladob = bside;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    
    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea(){
        return (ladoa * ladob) / 2;
    }
    @Override
    public double getPerimeter(){
        return ladoa + ladob + hypotenuse;
    }

    public double getHypotenuse(){
        return (ladoa * ladoa) + (ladob * ladob);
    }

   

}