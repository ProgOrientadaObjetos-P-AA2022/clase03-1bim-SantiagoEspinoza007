/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;


public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        
        // Se asigna valores particulares al objeto
        hospital.nombre = "Isidro Ayora";
        hospital.numeroCamas = 450;
        hospital.presupuesto = 1500000.43;
        hospital.pacientes = 230;
        
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f - %d\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto, hospital.pacientes);
        
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
       
    }
}
