/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz_Ex03;

/**
 *
 * @author gustavoan7
 */
public class NotaDTO {
    private float nota[][] = new float[6][6];
    float tudo;

    public float[][] getNota() {
        return nota;
    }

    public void setNota(float[][] nota) {
        this.nota = nota;
    }

    public float getTudo() {
        return tudo;
    }

    public void setTudo(int tudo) {
        this.tudo = tudo;
    }

}
