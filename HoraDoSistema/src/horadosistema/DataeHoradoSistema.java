/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horadosistema;

import java.time.LocalDateTime;



/**
 *
 * @author Joao Castro
 */
public class DataeHoradoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println("A data do sistema é ");
        System.out.println(dataHora);
    }    
}

