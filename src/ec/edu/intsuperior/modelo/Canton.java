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
public class Canton {
    private String idCanton;
    private String municipio;
    private Parroquia parroquia;

    public Canton(String idCanton,String municipio, Parroquia parroquia) {
        this.idCanton = idCanton;
        this.parroquia = parroquia;
        this.municipio = municipio;
        
    }

    public String getIdCanton() {
        return idCanton;
    }

    public void setIdCanton(String idCanton) {
        this.idCanton = idCanton;
    }

    public Parroquia getParroquia() {
        return parroquia;
    }

    public void setParroquia(Parroquia parroquia) {
        this.parroquia = parroquia;
    }
    public String getMunicipio(){
        return municipio;
    }
    public void setMunicipio(){
                this.municipio=municipio;

    }
}
