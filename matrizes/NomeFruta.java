/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.matrizes;

/**
 *
 * @author 03569198200
 */
public class NomeFruta {

    public static void main(String[] args) {
        String matriz[][] = {{"Abacaxi", "Caio"}, {"mamão", "Alex"}, {"Caqui", "Mariana"}, {"Uva", "Sandra"}
        };
        String nome = "", fruta = "";
        for (int i = 0; i < 4; i++) {
            fruta = matriz[i][0];
            nome = matriz[i][1];
            System.out.printf("%s Gosta de %s \n", nome, fruta);
        }

    }
}
