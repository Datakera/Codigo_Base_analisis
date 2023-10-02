package com.mycompany.codigoanalisis;

import javax.swing.JOptionPane;

public class Usuario {
public String nombre;
    public String apellido;
    public String documento;

    public void capturarDatosPersonales() {
        nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
        documento = JOptionPane.showInputDialog("Ingrese su número de documento:");
    }

    public void mostrarDatosPersonales() {
        JOptionPane.showMessageDialog(null, "Datos personales:\nNombre: " + nombre + "\nApellido: " + apellido + "\nDocumento: " + documento);
    }
    
}
