/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_6_arreglos_3;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA_6_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiEdad[];//Arreglo sin inicializar 
        Scanner scCaptu = new Scanner (System.in);//Captura desde el teclado
        //System.out.println(aiEdad[5]); error, se debe inicializar (new)
        System.out.println("Introduce la cantidad de edades a capturar");
        int iCant = scCaptu.nextInt();//Captura desde el teclado, al dar enter, un entero
        aiEdad=new int[iCant];
        for (int i = 0; i < iCant; i++) {
            System.out.println("Introduce la edad:");
            aiEdad[i]=scCaptu.nextInt();
            
        }
    }
    
}
