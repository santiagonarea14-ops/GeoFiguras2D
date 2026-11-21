/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Rectangulo extends Figura2D{
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura){
        if (base<=0||altura<=0){
            throw new IllegalArgumentException("La base y altura tiene que ser positivos");
        }
        this.base=base;
        this.altura=altura;
    }
    @Override
    public double calcularArea(){
        return base*altura;
    }
    @Override
    public double calcularPerimetro(){
        return 2*(base+altura);
    }
}
