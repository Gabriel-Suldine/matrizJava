/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.matrizes;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Matriz01 {

    public static void main(String[] args) {

        int matriz[][] = new int[3][2];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite um numero: ");
                matriz[i][j] = entrada.nextInt();

            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 2; j++) {
                System.out.printf("%d ",matriz[i][j]);

            }
            System.out.println(" |");
        }
    }
}
