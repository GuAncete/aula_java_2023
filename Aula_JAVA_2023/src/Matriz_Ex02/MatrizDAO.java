/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz_Ex02;

/**
 *
 * @author gustavoan7
 */
public class MatrizDAO {
    
    String resposta ="";
    
    
    public String mostrarMatriz(MatrizDTO matrizDTO){
        int matrizAUX[][] = matrizDTO.getMatriz();
        
        for(int linha=0; linha<3; linha++){
            for(int coluna=0; coluna<3; coluna++){
                resposta += " [" + matrizAUX[linha][coluna] + "] ";
            }
            resposta += "\n";
            
        }
        return resposta;
    }
    
        public String mostrarDiagonal(MatrizDTO matrizDTO){
            resposta = "";
        int matrizAUX[][] = matrizDTO.getMatriz();
        for(int linha=0; linha<3; linha++){
            for(int coluna=0; coluna<3; coluna++){
                if(linha == coluna){
                    matrizAUX[linha][coluna] = matrizAUX[linha][coluna]; 
                    this.resposta += " [" + matrizAUX[linha][coluna] + "] ";
                }
                else{
                    matrizAUX[linha][coluna] = 0;
                    this.resposta += " [" + matrizAUX[linha][coluna] + "] ";
                }
                
            }
            this.resposta += "\n";
        }
      return resposta;  
    }
}
