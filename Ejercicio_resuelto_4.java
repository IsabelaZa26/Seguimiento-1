/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_resuelto_4;


public class Ejercicio_resuelto_4 {

    public static void main(String[] args) {
double edjuan = 9;
double edalber, edana, edmama;
edalber = calculos.calcular_edalber(edjuan);
edana = calculos.calcular_edana(edjuan);
edmama = calculos.calcular_edmama(edjuan, edalber, edana);
System.out.println("La edad de Juan es: " + edjuan);
System.out.println("La edad de Ana es: " + edana);
System.out.println("La edad de Alberto es:" + edalber);
System.out.println("La edad de la Mama es: " + edmama);

    }
}
