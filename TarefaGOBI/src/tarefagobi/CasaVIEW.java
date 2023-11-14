/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefagobi;
import javax.swing.JOptionPane;
/**
 *
 * @author gustavoan7
 */
public class CasaVIEW {

    
    public static void main (String[] args){
    CasaDTO casaDTO = new CasaDTO();
    CasaCTR casaCTR = new CasaCTR();
    
    casaDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
    casaDTO.setBairro(JOptionPane.showInputDialog("Informe o Bairro: "));
    casaDTO.setCidade(JOptionPane.showInputDialog("Informe o Cidade "));
    casaDTO.setProprietario(JOptionPane.showInputDialog("Informe o Proprietario "));
    casaDTO.setNumero(Integer.parseInt( JOptionPane.showInputDialog("Informe o Numero: ")));
    casaDTO.setN_banheiros(Integer.parseInt(JOptionPane.showInputDialog("Informe o Banheiro: ")));
    casaDTO.setN_quarto(Integer.parseInt(JOptionPane.showInputDialog("Informe o quarto: ")));
    
    JOptionPane.showMessageDialog(null, casaCTR.publicarDados(casaDTO));
    }
}
