/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturacondicionalprogramaidade;

import java.util.Scanner;

/**
 *
 * @author Joao
 */
public class EstruturaCondicionalProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        int nas = teclado.nextInt();
        int idade = 2023 - nas;
        System.out.println("Você tem " + idade + " anos");
        if (idade>=18) {
            System.out.println("Você é maior de idade");
        } else{
            System.out.println("Você é menor de idade");
       }
    }
    
}
