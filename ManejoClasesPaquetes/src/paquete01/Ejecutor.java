/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);
                
        int numeroCamas;
        String nomHospital;
        double presupuestoH;
        
        System.out.println("Ingrese el nombre del hospital");
        nomHospital = leer.nextLine();
        
        System.out.println("Ingrese numero de camas");
        numeroCamas = leer.nextInt();
        
        System.out.println("Ingrese presupuesto");
        presupuestoH = leer.nextDouble();
        
        leer.nextLine();        
        Hospital h1 = new Hospital();
        h1.establecerNombre(nomHospital);
        h1.establecerNumeroCamas(numeroCamas);
        h1.establecerPresupuesto(presupuestoH);
        
        System.out.println("-----------------------------------");
        
        System.out.println("Ingrese el nombre del hospital 2");
        nomHospital = leer.nextLine();
        
        System.out.println("Ingrese numero de camas 2");
        numeroCamas = leer.nextInt();
        
        System.out.println("Ingrese presupuesto 2");
        presupuestoH = leer.nextDouble();
        
        Hospital h2 = new Hospital();
        h2.establecerNombre(nomHospital);
        h2.establecerNumeroCamas(numeroCamas);
        h2.establecerPresupuesto(presupuestoH); 
        
        System.out.printf("%s \n", "Hola desde el main");
        System.out.printf("%s - %d - %.2f\n ", h1.obtenerNombre(), h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        System.out.printf("%s - %d - %.2f\n ", h2.obtenerNombre(), h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());
    }
}
