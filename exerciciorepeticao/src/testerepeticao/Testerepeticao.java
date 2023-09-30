/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testerepeticao;

/**
 *
 * @author Joao
 */
public class Testerepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c = 1;
        do{
            if (c % 5 != 0) System.out.println(c);
            else break;
            c += 1;
        } while (c<=10);
    }
}
