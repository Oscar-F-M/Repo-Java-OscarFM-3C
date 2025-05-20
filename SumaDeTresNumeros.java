/*
 * Autor: Oscar Fuentes Mendoza
 * Fecha: 20/05/2025
 * Este programa recibe tres numeros con la opcion JOptionPane.showInputDialog
 * y realiza la suma de los tres numeros, despues hace un promedio de los tres numeros
 */


import javax.swing.JOptionPane;

public class SumaDeTresNumeros {

    public static void main(String[] args) {

    
        String numero1;
        String numero2;
        String numero3;
        numero1 = JOptionPane.showInputDialog("Ingrese el primer numero");
        numero2 =JOptionPane.showInputDialog("Ingresa el segundo numero");
        numero3 = JOptionPane.showInputDialog("Ingresa el tercer numero");

    
        System.out.println("El promedio de los tres numeros es:: " + (Double.parseDouble(numero1) + Double.parseDouble(numero2) + Double.parseDouble(numero3))/3);

    }



}
