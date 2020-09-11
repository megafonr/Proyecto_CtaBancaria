/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolo.proyecto_ctabancaria;

/**
 *
 * @author Rolo
 */
public class MiCtaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

        ClaseCuentaBancaria miCta;
        ClaseCuentaBancaria miCta2;           // para segunda parte

        miCta = new ClaseCuentaBancaria();
        
        miCta2 = new ClaseCuentaBancaria("pedro","Corriente",22000);   // para segunda parte
        
        System.out.println(" Primera Parte --- constructor por defecto: " );    
        miCta.extraer(1000);

        System.out.println(" Segunda Parte --- constructor 3 parametros: " );    
        miCta2.extraer(2000);
        System.out.println(" Segunda Parte --- Otro Importe: " );    
        miCta2.extraer(2000);
        System.out.println(" Segunda Parte --- constructor 3 parametros: " );    
        miCta2.extraer(100011);
    }
}
