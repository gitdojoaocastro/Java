/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturarepeticaotestenofinal;

import java.util.Scanner;

/**
 *
 * @author Joao
 */
public class EstruturaRepeticaoTestenoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* cc = 0;
        do {
            System.out.println("cambalhota " + cc);
            cc++;
        } while (cc<1000);   
    }*/
        int n , s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.println("Digite um número");
            n=teclado.nextInt();
            s+=n;
            System.out.println("Quer continuar? [S/N]");
            resp=teclado.next();
         } while (resp.equals("S") || resp.equals("s"));
        System.out.println("A soma dos valores é " + s);
    }
    }
