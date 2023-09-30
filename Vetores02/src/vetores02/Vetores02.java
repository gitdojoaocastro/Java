/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores02;

/**
 *
 * @author Joao
 */
public class Vetores02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"jan", "fev", "mar", "abr", "mai", "jun",
                        "jul", "ago", "set", "out", "nov", "dez"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
        
        for (int c = 0; c < mes.length; c++) {
            System.out.println("O mês de " + mes[c] + " tem um total de " + dias[c]);                                                                                                                                                                                                                    
        }
        
        //System.out.println("O mês de " + mes[]);
    }
    
}
