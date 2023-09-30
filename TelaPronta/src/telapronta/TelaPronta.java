/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package telapronta;

import javax.swing.JOptionPane;

/**
 *
 * @author Joao
 */
public class TelaPronta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* mensagem simples em janela
        JOptionPane.showMessageDialog(null, "Mensagem", "Título", JOptionPane.WARNING_MESSAGE);
        */
        
        int c, s=0, t=0, p=0, i=0, cem=0, m;
        do{
            c = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>Valor 0 interrompe</em></html>"));
            s += c;
            t++;
            if (c%2==0 & c!=0){
               p++;
            } else if (c!=0) {
               i++;
            }
            if (c>100) {
               cem++; 
            }
        } while (c != 0);
        t--;
        m = s/t;
        JOptionPane.showMessageDialog(null, "<html>Resultado final<hr>" + "<br>Total de valores: " + t + "<br>Total de pares: " + p + "<br>Total de ímpares: " + i + "<br>Acima de 100: " + cem + "<br>A média dos valores é " + m + "<br>A soma dos números é " + s + "</html>", "Soma", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
