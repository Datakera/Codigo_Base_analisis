package com.mycompany.codigoanalisis;

import javax.swing.JOptionPane;

public class Finanzas {
private double gastos;
    private double ingresos;
    Usuario mostrarDatos = new Usuario();

    public void iniciarRegistro() {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    "Menú de opciones:\n" +
                    "1. Editar tus dados\n" +
                    "2. Registrar ingreso\n" +
                    "3. Registrar gasto\n" +
                    "4. Ver saldo de ahorros\n" +
                    "5. Salir");

            int seleccion = Integer.parseInt(opcion);

            switch (seleccion) {
                case 1:
                mostrarDatos.capturarDatosPersonales();
                mostrarDatos.mostrarDatosPersonales();
                break;
                case 2:
                    registrarIngreso();
                    break;
                case 3:
                    registrarGasto();
                    break;
                case 4:
                    mostrarSaldoAhorros();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    public void registrarGasto() {
        String gastoStr = JOptionPane.showInputDialog("Ingrese el monto del gasto:");
        double montoGasto = Double.parseDouble(gastoStr);
        gastos += montoGasto;
    }

    public void registrarIngreso() {
        String ingresoStr = JOptionPane.showInputDialog("Ingrese el monto del ingreso:");
        double montoIngreso = Double.parseDouble(ingresoStr);
        ingresos += montoIngreso;
    }

    public void mostrarSaldoAhorros() {
        double ahorros = ingresos - gastos;
        JOptionPane.showMessageDialog(null, "Saldo de ahorros: $" + ahorros);
    }    
}
