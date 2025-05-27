public class CuentaBancaria {
    //Crear atributos private: titular (String), saldo(double)
    private String titular;
    private double saldo;


 public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Se tiene que crear metodos public 

    //Suma a saldo solo si su monto es mayor a cero
    public void depositar(double monto){
        if(monto > 0){
            saldo = monto + saldo;
            System.out.println("Se ha depositado " + monto + " y el saldo es " + saldo);
        }
    }

    //Si se cumple el requisito de retirar dentro del if, resta y devuelve true, sino devuelve false
    public boolean retirar(double monto){
        if(monto > 0 && saldo >= monto){
            saldo = saldo - monto;
            System.out.println("Se ha retirado " + monto + " y el saldo es " + saldo);
            return true;
        }else{
            System.out.println("No se puede retirar el monto de " + monto + "\nPorque el saldo es insuficiente: " + saldo);
            return false;
        }

    }

    
    
    
}
