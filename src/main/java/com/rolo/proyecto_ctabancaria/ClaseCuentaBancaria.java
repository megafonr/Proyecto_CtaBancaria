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
public class ClaseCuentaBancaria {
    String nombre, tipoCta;
    double saldo;
            
    public ClaseCuentaBancaria() {
    this.nombre = "";
    this.tipoCta = "";
    this.saldo = 10000;
    }   
//  Para Segunda parte    
    public ClaseCuentaBancaria(String Nombre) {
        this();
        this.nombre = Nombre;
    }
    public ClaseCuentaBancaria(String Nombre, String TipoCta) {
        this(Nombre);
        this.tipoCta = TipoCta;
    }
    public ClaseCuentaBancaria(String Nombre, String TipoCta, double Saldo) {
        this(Nombre,TipoCta);
        this.saldo = Saldo;
    }
//  Fin Para Segunda Parte
    
public void extraer(double sacopesos){
    String Estado;
//    Estado = " ";

    if (saldo > 0 && saldo >= sacopesos) {
      if (!(nombre.isBlank() || tipoCta.isBlank())) {
        saldo = saldo - sacopesos ;
        Estado = "Ud. Retiro: " + sacopesos + " Su nuevo Saldo es: " + saldo ;
    } else {
        Estado = "Debe ingresar un Nombre y un Tipo de Cuenta" ;
        }
    } else {
        Estado = "No tiene Saldo o el Importe a sacar es mayor a su Saldo";
    }
    
    System.out.println( Estado );
    
}  
    
}
