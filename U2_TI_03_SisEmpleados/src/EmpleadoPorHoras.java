public class EmpleadoPorHoras extends Empleado {
    private int HorasTrabajadas;

    public int getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        HorasTrabajadas = horasTrabajadas;
    }

    public EmpleadoPorHoras(String id, String nombre, double salarioBase, int horasTrabajadas) {
        super(id, nombre, salarioBase);
        HorasTrabajadas = horasTrabajadas;
    }
     @Override
    
    public double calcularSalario() {
        return getSalarioBase() * HorasTrabajadas;
    }


}
