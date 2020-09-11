/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolo.proyecto_ctabancaria;
import java.util.Scanner;

/**
 *
 * @author Rolo
 */
public class MiCtaBanEncapsulado {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ClaseCtaBanEncapsulado miCta;
        ClaseCtaBanEncapsulado miCta2;        

        miCta = new ClaseCtaBanEncapsulado();
        miCta2 = new ClaseCtaBanEncapsulado();
        Scanner sc = new Scanner(System.in); 
        
        System.out.println(" Cargo datos 1 ---  " );    
        miCta.setNombre("Pedro");
        miCta.setTipoCta("Corriente");
        miCta.setSaldo(5000);
        
        System.out.println(" Saco 2000 --- Otro Importe: " );    
        miCta.extraer(2000);
        System.out.println(" Saco 10000 --- Otro Importe: " );    
        miCta.extraer(10000);
        System.out.println(" Saco 1500 --- Otro importe: " );    
        miCta.extraer(1500);

        System.out.println(" Cargo datos 2 ---  " );    
        miCta2.setSaldo(10000);
        
        System.out.println("Ingrese Nombre: " );    
        miCta2.setNombre(sc.nextLine());
        System.out.println("Ingrese Tipo Cuenta: " );    
        miCta2.setTipoCta(sc.nextLine());
        System.out.println("Ingrese Importe a retirar: " );    
        miCta2.extraer(sc.nextDouble());
        System.out.println(" Saco xx --- Otro Importe: " );    
        miCta2.extraer(sc.nextDouble());
        System.out.println(" Saco xxx --- Otro importe: " );    
        miCta2.extraer(sc.nextDouble());
    }        
}
