import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String numero1;
        String numero2;
        String numero3;
        numero1 = JOptionPane.showInputDialog("Ingrese el primer numero");
        numero2 =JOptionPane.showInputDialog("Ingresa el segundo numero");
        numero3 = JOptionPane.showInputDialog("Ingresa el tercer numero");

    
        System.out.println("El promedio de los tres numeros es:: " + (Double.parseDouble(numero1) + Double.parseDouble(numero2) + Double.parseDouble(numero3))/3);
    }
}
