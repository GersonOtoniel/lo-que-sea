/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quicksort;

/**
 *
 * @author Gerson
 */
public class Quicksort {

    /**
     *
     * @param arreglo
     * @param primero
     * @param ultimo
     */
    public void quick(int[] arreglo, int primero, int ultimo) {

        int i, j, pivote, tam;
         final int num = 2;
        i = primero;
        j = ultimo;

        pivote = arreglo[(primero + ultimo)/2];
        //System.out.println("Pivote: " + pivote);

        do {

            while (arreglo[i] < pivote) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }

            if (i <= j) {

                tam = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = tam;
                i++;
                j--;
            }
        } while (i <= j);

        if (primero < j) {
            quick(arreglo, primero, j);
        }
        if (i < ultimo) {

            quick(arreglo, i, ultimo);
        }

        mostrar(arreglo);

    }

    public void mostrar(int[] arreglo) {
        int k;
        for (k = 0; k < arreglo.length; k++) {
            System.out.print("{" + arreglo[k] + "}");
        }

        System.out.println();
    }
}
