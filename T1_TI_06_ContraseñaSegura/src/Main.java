import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        UsuarioSeguro usuarioSeguro = new UsuarioSeguro();

        // Primerosolicitamos el nombre del usuario y su contraseña
        String nombre = JOptionPane.showInputDialog("Ingrsa tu nombre: ");
        usuarioSeguro.setNombreUsuario(nombre);

        String clave = JOptionPane.showInputDialog("Ingrsa tu contraseña: ");
        usuarioSeguro.setPassword(clave);

        /* 
        Validamos que el usuario y la contraseña sean correctos, si es correcto, se concede acceso
        Si no es correcto, se denega acceso 
        */
        if (usuarioSeguro.autenticar(clave)) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }


    }
}