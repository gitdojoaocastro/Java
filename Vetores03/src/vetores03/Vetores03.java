/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores03;

import java.util.Arrays;

/**
 *
 * @author Joao
 */
public class Vetores03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(v); //organizar por ordem
        for (double valor: v) {
            System.out.print(valor + " ");
        }
        int s = Arrays.binarySearch(v,9);
        System.out.println("A posição do vetor 9 é " + s );
    }
}
