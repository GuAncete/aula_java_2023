/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz_Ex01;

/**
 *
 * @author gustavoan7
 */
public class NumeroDAO {
    String resposta="";
    public String mostrarMatriz(NumeroDTO numeroDTO){
        int n[][] = numeroDTO.getN();
        for (int linha=0; linha<2; linha++){
            for(int coluna=0; coluna<3; coluna++){
                this.resposta += " [" + n[linha][coluna] + "] ";
            }
            this.resposta += "\n";
        }
        return this.resposta;
    }
    

}
