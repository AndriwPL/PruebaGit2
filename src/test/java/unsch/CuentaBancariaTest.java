package unsch;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CuentaBancariaTest {
    @Test
    void depositoDebeIncrementarSaldo() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        cuenta.depositar(50);
        assertEquals(150, cuenta.obtenerSaldo());
    }
    @Test
    void transferenciaDebeMoverFondosEntreCuentas() {
        CuentaBancaria origen = new CuentaBancaria(200);
        CuentaBancaria destino = new CuentaBancaria(50);
        boolean resultado = origen.transferir(destino, 80);
        assertTrue(resultado);
        assertEquals(120, origen.obtenerSaldo());
        assertEquals(130, destino.obtenerSaldo());
    }
    @Test
    void transferenciaConSaldoInsuficienteDebeSerRechazada() {
        CuentaBancaria origen = new CuentaBancaria(100);
        CuentaBancaria destino = new CuentaBancaria(50);
        boolean resultado = origen.transferir(destino, 500);
        assertFalse(resultado);
        assertEquals(100, origen.obtenerSaldo());
        assertEquals(50, destino.obtenerSaldo());
    }
}
