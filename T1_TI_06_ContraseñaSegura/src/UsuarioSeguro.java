public class UsuarioSeguro {
    private String nombreUsuario;
    private String password;

    // Declaramos los setter para nombreUsuario
    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null || nombreUsuario.trim().isEmpty()) {
            System.out.println("El nombre de usuario no puede ser nulo ni estar vacío.");
        } else {
            this.nombreUsuario = nombreUsuario;
        }
    }

    // Setter para password con validaciones
    public void setPassword(String password) {
        if (password == null || password.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return;
        }
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("La contraseña debe contener al menos una letra mayúscula.");
            return;
        }
        if (!password.matches(".*[a-z].*")) {
            System.out.println("La contraseña debe contener al menos una letra minúscula.");
            return;
        }
        if (!password.matches(".*\\d.*")) {
            System.out.println("La contraseña debe contener al menos un número.");
            return;
        }

        this.password = password;
    }

    // Método de autenticación
    public boolean autenticar(String intentPassword) {
        return password != null && password.equals(intentPassword);
    }
}