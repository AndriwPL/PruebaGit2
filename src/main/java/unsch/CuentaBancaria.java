package unsch;

public class CuentaBancaria {
    private double saldo;
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    public void depositar(double monto) {
        saldo += monto;
    }
    public double obtenerSaldo() {
        return saldo;
    }

    //Prueba de la autonomia de cada rama
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        }
    }

}