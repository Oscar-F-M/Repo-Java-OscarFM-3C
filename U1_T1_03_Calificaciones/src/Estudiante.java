public class Estudiante {
    private String nombre;
    private String matricula;
    private double[] notas = new double[5];

    // Constructor
    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota(int i) {
        return notas[i];
    }

    public void setNota(int i, double n) {
        if (i >= 0 && i < notas.length) {
            notas[i] = n;
        }
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    // Método para verificar si está aprobado
    public boolean aprobado() {
        return calcularPromedio() >= 70;
    }
}