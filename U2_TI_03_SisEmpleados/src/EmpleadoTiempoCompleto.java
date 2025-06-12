public class EmpleadoTiempoCompleto extends Empleado {

    private String beneficios;


    public EmpleadoTiempoCompleto(String beneficios, String id, String nombre, double salarioBase) {

        super (id, nombre, salarioBase);
        this.beneficios = beneficios;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
    
    @Override
    
    public double calcularSalario() {
        return getSalarioBase();
    }

}
