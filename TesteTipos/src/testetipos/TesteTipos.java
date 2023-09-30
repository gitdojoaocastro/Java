/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author Joao
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        INT PARA STRING
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor)
        */
        
        /*
        STRING PARA INT
        String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);
        */
       
        //STRING PARA FLOAT
        String valor = "30";
        float idade = Float.parseFloat(valor);
        System.out.printf("%.2f \n", idade);       
        
    }
    
}
