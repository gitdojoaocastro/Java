/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Joao
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String nome = teclado.nextLine();
        System.out.println("Digite uma nota:");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %S é %.1f \n", nome, nota);
        
        
        /* System Out !!
         *  String nome = "Joao";
         *  float nota = 8.5f;
         *  //System.out.println("A nota é " + nota);
         *  //System.out.format("A nota de %S é %.1f \n", nome, nota);
         *  System.out.printf("A nota de %S é %.1f \n", nome, nota);
         */
    }
  
}
