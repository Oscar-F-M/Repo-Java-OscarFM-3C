/*
App.java en la que se calcula el area y perimetro de distintas figuras como lo son: cuadrado,
circulo y triangulo isosceles.
Autor: Oscar Fuentes Mendoza
 */
import Model.Circle;
import Model.Square;
import Model.Triangle;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Square sq = new Square();
        Circle cir = new Circle();
        Triangle tri = new Triangle();

        double side, radio, base, height;
        String message;

        System.out.println("Ingresa un mensaje: "); //Se pide el mensaje 
        message = sc.nextLine(); 
        sq.setMessage(message);

        //Se calcula el area y el perimetro del cuadrado
        System.out.println("Ingresa un lado del cuadrado: ");
        side = sc.nextDouble();
        sq.setside(side);
        System.out.println("El perimetro del cuadrado es: " + sq.getPerimeter()); 
        System.out.println("El area del cuadrado es: " + sq.getArea() + "\n");

        //Se calcula el area y el perimetro del circulo
        System.out.println("Ingresa el radio del circulo");
        radio = sc.nextDouble();
        cir.setRadio(radio);
        System.out.println("El perimetro del circulo es:" + cir.getPerimeter());
        System.out.println("El area del circulo es:" + cir.getArea() + "\n");

        //Se calcula el area y el perimetro del triangulo
        System.out.println("Ingresa un lado del triangulo isosceles");
        side = sc.nextDouble();
        tri.setSide(side);
        System.out.println("Ingresa la base del triangulo isosceles: ");
        base = sc.nextDouble();
        tri.setBase(base);
        System.out.println("Ingresa la altura del triangulo isosceles: ");
        height = sc.nextDouble();
        tri.setHeight(height);
        System.out.println("El perimetro del triangulo es:" + tri.getPerimeter());
        System.out.println("El area del triangulo es:" + tri.getArea() + "\n");

        sc.close();
    }
}
