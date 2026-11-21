/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class Cuadrado extends Figura2D {
    private double lado;
    
    public Cuadrado (double lado){
        if (lado<=0){
            throw new IllegalArgumentException("El valor del lado tiene que ser positivo");
    }
        this.lado=lado;
        
         
    }  
    @Override
    public double calcularArea(){
        return lado*lado;
    }
    @Override
    public double calcularPerimetro(){
        return 4*lado;
    }
}
