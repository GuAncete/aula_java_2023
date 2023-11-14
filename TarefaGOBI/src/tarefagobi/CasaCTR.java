/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefagobi;

/**
 *
 * @author gustavoan7
 */
public class CasaCTR {
    CasaDTO casaDTO = new CasaDTO();
    CasaDAO casaDAO = new CasaDAO();
    
    public String publicarDados(CasaDTO casaDTO){
        return casaDAO.publicarDados(casaDTO);
    }
}
