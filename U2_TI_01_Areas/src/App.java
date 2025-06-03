import Model.Circle;
import Model.EquilateralTriangle;
import Model.FigureAbs;
import Model.RectangleTriangle;
import Model.Square;
import Model.Triangle;

public class App {
    public static void main(String[] args) throws Exception {

        FigureAbs sq = new Square(12);
        FigureAbs cir = new Circle(30);
        FigureAbs triangle = new Triangle(20, 25, 10);
        FigureAbs rectriangle = new RectangleTriangle(15, 20, 20, 3);
        FigureAbs equitriangle = new EquilateralTriangle(22);

        FigureAbs[] figures = { sq, cir, triangle, rectriangle,  equitriangle };

        for (FigureAbs figureAbs : figures) {
            System.out.println("La clase es: " + figureAbs.getClass().getSimpleName());
            System.out.println("El area es: " + figureAbs.getArea());
            System.out.println("El perimetro es: " + figureAbs.getPerimeter());
            System.out.println("----------------------------------------------------");
        }

    }
}