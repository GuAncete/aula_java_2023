/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz_Ex02;
import javax.swing.JOptionPane;
/**
 *
 * @author gustavoan7
 */
public class MatrizVIEW {
    public static void main(String[] args){
        
        MatrizDTO matrizDTO = new MatrizDTO();
        MatrizCTR matrizCTR = new MatrizCTR();
        
        int matriz[][] = new int [3][3];
        
        for(int linha=0; linha<3; linha++){
            for(int coluna=0; coluna<3; coluna++){
                matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe a linha:"+ linha + " coluna: "+ coluna));
            }
        }
        matrizDTO.setMatriz(matriz);
        JOptionPane.showMessageDialog(null, matrizCTR.mostrarMatriz(matrizDTO));
        
        JOptionPane.showMessageDialog(null, matrizCTR.mostrarDiagonal(matrizDTO));
    }
}
