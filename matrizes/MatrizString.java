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
public class MatrizString {
    public static void main(String[]args){
    
        String matriz[][] = new String[3][2];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite uma palavra: ");
                matriz[i][j] = entrada.next();

            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 2; j++) {
                System.out.printf("%s ",matriz[i][j]);

            }
            System.out.println(" |");
    
    }
    
    
    }}
