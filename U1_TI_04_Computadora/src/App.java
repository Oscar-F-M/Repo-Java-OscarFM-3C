public class App {
    public static void main(String[] args) throws Exception {

        //Instancia una computadora, llama a encender() dos veces, luego apagar ()
        Computadora computadora = new Computadora();
        computadora.encender();
        computadora.encender();
        computadora.apagar();
        
    }
}
