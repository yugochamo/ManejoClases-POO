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
public class Alumno {

    private String cedula;
    private String apellido1;
    private String apellido2;
    private String nombre1;
    private String nombre2;
    private String email;
    private String telefono;
    private String fechaNacimiento;
    private String nivel;
    private String paralelo;
    private Carrera carrera;
    private Ciudad cuidad;
    private TipoSangre tipoSangre;
    private Etnia etnia; 
    private Titulo titulo;    

    public Alumno(String cedula, String apellido1, String apellido2, String nombre1, String nombre2, String email, String telefono, String fechaNacimiento, String nivel, String paralelo, Carrera carrera, Ciudad cuidad, TipoSangre tipoSangre, Etnia etnia, Titulo titulo) {
        this.cedula = cedula;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.email = email;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.nivel = nivel;
        this.paralelo = paralelo;
        this.carrera = carrera;
        this.cuidad = cuidad;
        this.tipoSangre = tipoSangre;
        this.etnia = etnia;
        this.titulo = titulo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Ciudad getCuidad() {
        return cuidad;
    }

    public void setCuidad(Ciudad cuidad) {
        this.cuidad = cuidad;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Etnia getEtnia() {
        return etnia;
    }

    public void setEtnia(Etnia etnia) {
        this.etnia = etnia;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }
    
    

}
