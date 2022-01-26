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
public class Parroquia {
    private String idParroquia;
    private Barrio barrio;

    public Parroquia(String idParroquia, Barrio barrio) {
        this.idParroquia = idParroquia;
        this.barrio = barrio;
    }

    public String getIdParroquia() {
        return idParroquia;
    }

    public void setIdParroquia(String idParroquia) {
        this.idParroquia = idParroquia;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }
    
}
