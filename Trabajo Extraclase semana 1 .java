/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int dedu;
        int salarioo;
        String n = JOptionPane.showInputDialog("Ingrese su Nombre");
        String salario = JOptionPane.showInputDialog("Ingrese su salario ");
        salarioo=Integer.parseInt(salario);
        dedu = salarioo * 9;
        int deduu;
        deduu = dedu / 100;
        int neto;
        neto = salarioo - deduu;

        int entrada;
        entrada = salarioo - deduu;
        System.out.println("Estimado" + n);
        System.out.println("El deglose de su salario queda de la siguiente manera : ");
        System.out.println("Salario bruto " + salarioo);
        System.out.println("Deducciones" + deduu);
        System.out.println("Salario Neto " + neto);

        // TODO code application logic here
    }

}
