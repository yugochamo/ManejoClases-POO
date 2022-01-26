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
public class Etnia {
    private String idEtnia;
    private String nombreEtnia;

    public Etnia(String idEtnia, String nombreEtnia) {
        this.idEtnia = idEtnia;
        this.nombreEtnia = nombreEtnia;
    }

    public String getIdEtnia() {
        return idEtnia;
    }

    public void setIdEtnia(String idEtnia) {
        this.idEtnia = idEtnia;
    }

    public String getNombreEtnia() {
        return nombreEtnia;
    }

    public void setNombreEtnia(String nombreEtnia) {
        this.nombreEtnia = nombreEtnia;
    }
    
}
