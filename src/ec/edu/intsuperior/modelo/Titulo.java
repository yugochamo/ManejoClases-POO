/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author PC
 */
public class Titulo {
    private String idTitulo;
    private String tipobreTitulo;

    public Titulo(String idTitulo, String tipobreTitulo) {
        this.idTitulo = idTitulo;
        this.tipobreTitulo = tipobreTitulo;
    }

    public String getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(String idTitulo) {
        this.idTitulo = idTitulo;
    }

    public String getTipobreTitulo() {
        return tipobreTitulo;
    }

    public void setTipobreTitulo(String tipobreTitulo) {
        this.tipobreTitulo = tipobreTitulo;
    }
    
}
