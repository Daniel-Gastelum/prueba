/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_14_arreglos_multidim_3;

/**
 *
 * @author danie
 */
public class EVA_14_ARREGLOS_MULTIDIM_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][][]aiArreMulti=new int [2][3][4][5];
        for (int i = 0; i < aiArreMulti.length; i++) {
            for (int j = 0; j < aiArreMulti[i].length; j++) {
                for (int k = 0; k < aiArreMulti[i][j].length; k++) {
                    for (int l = 0; l < aiArreMulti[i][j][k].length; l++) {
                        aiArreMulti[i][j][k][l] = (int)(Math.random()*100);
                        
                        
                    }
                    
                }
                
            }
            
        }
        for (int i = 0; i < aiArreMulti.length; i++) {
            for (int j = 0; j < aiArreMulti[i].length; j++) {
                for (int k = 0; k < aiArreMulti[i][j].length; k++) {
                    for (int l = 0; l < aiArreMulti[i][j][k].length; l++) {
                        System.out.println(aiArreMulti[i][j][k][l]);
                    }
    }
    
}
        }}}