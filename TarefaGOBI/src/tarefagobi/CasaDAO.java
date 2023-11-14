/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefagobi;

/**
 *
 * @author gustavoan7
 */
public class CasaDAO {
    private String mensagem ="";
    
    public String publicarDados(CasaDTO casaDTO){
        this.mensagem += "Endereço: "+ casaDTO.getEndereco() +
                "\nNumero: " + casaDTO.getNumero() + "\nBairro: "+ casaDTO.getCidade() +
                "\nProprietario: " + casaDTO.getProprietario() + "\nQuarto: " + casaDTO.getN_banheiros()+ 
                "\nBanheiros: " + casaDTO.getN_banheiros();
        return this.mensagem;
    }
           
}
