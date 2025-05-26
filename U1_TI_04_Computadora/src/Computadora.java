public class Computadora {
    //Crear un atributo private: marca (string), modelo (string), encendida (boolean)
    private String marca;
    private String modelo;
    private boolean encendida;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public boolean isEncendida() {
        return encendida;
    }
    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    
    //Crear un método public void encender() -> Sin no está encendida, cambia a true y muestra "Encendido"
    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("Encendido");
        }
        else {
            System.out.println("Ya esta encendido");
        }
    }

    // Crea un metododen public void apagar() -> Si está encendida, cambia a false y muestra "Apagado"
    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("Apagado");
        }
        else {
            System.out.println("Ya esta apagado");
        }
    }



}
    

