/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quicksort;

/**
 *
 * @author Gerson
 */
public class principal {
    
    public static void main(String[] args){
        Quicksort arreglo = new Quicksort();
        int arreglo_numeros[] ={7, 5, 8, 11, 2, 3, 5, 7};
    
    System.out.println("Arreglo a ordenar: ");
    arreglo.mostrar(arreglo_numeros);
    System.out.println();
    System.out.println("Arreglo ordenado: ");
    arreglo.quick(arreglo_numeros, 0, arreglo_numeros.length-1);
    
    }
}
