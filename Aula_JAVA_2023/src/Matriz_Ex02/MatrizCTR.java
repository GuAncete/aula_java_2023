/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz_Ex02;

/**
 *
 * @author gustavoan7
 */
public class MatrizCTR {
    MatrizDAO matrizDAO = new MatrizDAO();
    
    public String mostrarMatriz(MatrizDTO matrizDTO){
        return matrizDAO.mostrarMatriz(matrizDTO);
    }
    public String mostrarDiagonal(MatrizDTO matrizDTO){
        return matrizDAO.mostrarDiagonal(matrizDTO);
    }
}
