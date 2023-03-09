/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Joao Castro
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = resolucao.width;
        int altura = resolucao.height;
        System.out.println("A resolução da sua tela é de " + largura + "x" + altura);
    }
}
