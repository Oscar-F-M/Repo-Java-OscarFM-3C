public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[5];

        // Creación de objetos Estudiante
        estudiantes[0] = new Estudiante("Jarillo", "20243DS080");
        estudiantes[1] = new Estudiante("Oscar", "20243DS081");
        estudiantes[2] = new Estudiante("Daniel", "20243DS082");
        estudiantes[3] = new Estudiante("David", "20243DS083");
        estudiantes[4] = new Estudiante("Damian", "20243DS084");

        // Asignación de notas
        double[][] notasEstudiantes = {
            {85, 90, 78, 88, 92},
            {65, 70, 68, 72, 60},
            {95, 88, 92, 85, 90},
            {45, 50, 55, 60, 58},
            {80, 85, 82, 79, 84}
        };

        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < 5; j++) {
                estudiantes[i].setNota(j, notasEstudiantes[i][j]);
            }
        }

        // Mostrar resultados
        for (Estudiante e : estudiantes) {
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Matrícula: " + e.getMatricula());
            System.out.println("Promedio: " + e.calcularPromedio());
            System.out.println("¿Aprobado?: " + (e.aprobado() ? "Sí" : "No"));
            System.out.println("---------------------");
        }
    }
}