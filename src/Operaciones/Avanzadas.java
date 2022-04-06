/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

/**
 *
 * @author lecona
 */
public class Avanzadas {
    
    public double Potencia(int base, int exponente){
        return Math.pow(base, exponente);
    }
    public double Raiz(int numero){
        return Math.sqrt(numero);
    }
    
    public double Factorial(int numero){
        if (numero == 0){
            return 1;
        }else{
            return numero * Factorial (numero -1);
        }
    }
    
    
}
