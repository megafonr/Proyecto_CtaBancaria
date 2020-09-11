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
public class ClaseCtaBanEncapsulado {
    private String nombre, tipoCta;
    private double saldo;
            
    public ClaseCtaBanEncapsulado() {
    this.nombre = "";
    this.tipoCta = "";
    this.saldo = 10000;
    }   

public void setNombre(String Nombre){
    if (!Nombre.isBlank() ) {
        this.nombre=Nombre;
    }
}
public String getNombre(){
    return nombre;
}    
    
public void setTipoCta(String TipoCta){
    if (!TipoCta.isBlank() ) {
        this.tipoCta = TipoCta;
        }
}
public String getTipoCta(){
    return tipoCta;
}    

public void setSaldo(double Saldo){
    if (Saldo > 0) {
        this.saldo = Saldo;
        }
}
public double getSaldo(){
    return saldo;
}    

public void extraer(double sacopesos){
    String Estado;

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
