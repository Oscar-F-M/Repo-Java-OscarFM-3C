public class App {
    public static void main(String[] args) throws Exception {
        //Crear ina instancia a la clase CuentaBancaria
        CuentaBancaria cuentaBancaria = new CuentaBancaria();

        //Depositar 1000, retirar 200 y luego intentar retirar 1000
        //En cada paso se debe imprimir el saldo y si la operacion fue exitosa o no
        cuentaBancaria.depositar(1000);
        cuentaBancaria.retirar(200);
        cuentaBancaria.retirar(10000);


    }
}
