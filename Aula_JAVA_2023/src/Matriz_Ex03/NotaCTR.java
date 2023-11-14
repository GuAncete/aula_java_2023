/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz_Ex03;

/**
 *
 * @author gustavoan7
 */
public class NotaCTR {
    NotaDAO notaDAO = new NotaDAO();
    public String mostrarNota(NotaDTO notaDTO){
        return notaDAO.mostrarNota(notaDTO);
    }
    public String mediaNota(NotaDTO notaDTO){
        return notaDAO.mediaNota(notaDTO);
    }
}
