/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.matrizes;

import java.util.Scanner;

/**
 *
 * @author 03569198200
 */
public class MatrizSomatoria {

    public static void main(String[] args) {
        int matriz[][] = {{54, 40, 18}, {8, 75, 33}, {12, 41, 92}, {27, 7, 67}};
        int somatorio = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 3; j++) {
                somatorio += matriz[i][j];
            }
        }
        System.out.println(somatorio);

    }

}
