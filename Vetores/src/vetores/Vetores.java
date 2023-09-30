/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores;

import java.util.Arrays;

/**
 *
 * @author Joao
 */
public class Vetores {

    /**
     * @param args the command line argument s
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,7,8,1,2,8};
        System.out.println("O total de casas de n é " + n.length);
        
        // System.out.print(Arrays.toString(n));
        
        for (int c = 0; c <= n.length-1; c++) {
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
    }
}
