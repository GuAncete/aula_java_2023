/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz_Ex03;
import javax.swing.JOptionPane;
/**
 *
 * @author gustavoan7
 */
public class NotaVIEW {

    
  
    
    public static void main( String[] args){
        NotaDTO notaDTO = new NotaDTO();
        NotaCTR notaCTR = new NotaCTR();
        float nota[][] = new float[6][6];
    
        for(int linha=0; linha<6; linha++){
            for(int coluna=1; coluna<5; coluna++){
                nota[linha][coluna] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do aluno: "));
            }
        }
          notaDTO.setNota(nota);
        JOptionPane.showMessageDialog(null, notaCTR.mostrarNota(notaDTO));
        
        JOptionPane.showMessageDialog(null, notaCTR.mediaNota(notaDTO));
    }
}
