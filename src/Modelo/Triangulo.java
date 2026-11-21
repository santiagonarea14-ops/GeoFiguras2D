/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class Triangulo extends Figura2D {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    public Triangulo (double ladoA, double ladoB, double ladoC){
        if(ladoA<=0||ladoB<=0||ladoC<=0){
            throw new IllegalArgumentException ("Los lados tienen que ser positivos. ");
        }
        if(ladoA+ladoB<=ladoC||ladoA+ladoC<=ladoB||ladoB+ladoC<=ladoA){
            throw new IllegalArgumentException ("Los lados no cumplen los valores de un triángulo");
            
        }
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.ladoC=ladoC;
    }
    @Override
    
    public double calcularArea(){
        double s=(ladoA+ladoB+ladoC)/2; 
        return Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));  
    }
    @Override
    public double calcularPerimetro(){
        return ladoA+ladoB+ladoC;
    }
            
}
