/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz_Ex03;

/**
 *
 * @author gustavoan7
 */
public class NotaDAO {
    String resposta ="";
    float media;
    public String mostrarNota(NotaDTO notaDTO){
        float notaAUX[][] = notaDTO.getNota();
        
        for(int linha=0; linha<5; linha++){
            for(int coluna=1; coluna<5; coluna++){
                this.resposta += " [" + notaAUX[linha][coluna] + "] ";
            }
        this.resposta += "\n";            
        }
        return resposta;
    }
    
    public String mediaNota(NotaDTO notaDTO){
        resposta = "";
        float notaAUX[][] = notaDTO.getNota();
        float tudoAUX=0;
        for(int linha=0; linha<5; linha++){
            for(int coluna=1; coluna<5; coluna++){
                this.resposta += " [" + notaAUX[linha][coluna] + "] ";
                tudoAUX = notaAUX[linha][coluna] + tudoAUX;
                
            }
            media = tudoAUX/4;
                notaAUX[linha][5] = media; 
                this.resposta += notaAUX[linha][5];
            this.resposta += "\n";
            tudoAUX = 0;
        }
        return resposta;
    }
}
