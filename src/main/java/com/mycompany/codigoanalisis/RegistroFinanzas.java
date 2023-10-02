package com.mycompany.codigoanalisis;
public class RegistroFinanzas {

    public static void main(String[] args) {
       // Creamos una instancia de la clase Usuario para gestionar los datos personales
        Usuario usuario = new Usuario();
        usuario.capturarDatosPersonales();

        // Creamos una instancia de la clase Finanzas para gestionar los gastos, ingresos y ahorros
        Finanzas finanzas = new Finanzas();
        finanzas.iniciarRegistro();

        // Mostramos los datos personales y el saldo de ahorros al final
        usuario.mostrarDatosPersonales();
        finanzas.mostrarSaldoAhorros();
    }
}
