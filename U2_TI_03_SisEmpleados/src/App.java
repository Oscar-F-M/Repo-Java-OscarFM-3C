public class App {
    public static void main(String[] args) throws Exception {
       
        EmpleadoTiempoCompleto empleadoTiempo = new EmpleadoTiempoCompleto("Beneficios", "123456", "Oscar", 10000);
        System.out.println(empleadoTiempo.calcularSalario());
        EmpleadoPorHoras empleadoHoras =new EmpleadoPorHoras("hola", "Oscar", 20000, 10);
        System.out.println(empleadoHoras.calcularSalario());

    }
}
