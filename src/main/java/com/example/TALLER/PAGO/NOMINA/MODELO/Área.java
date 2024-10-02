package com.example.TALLER.PAGO.NOMINA.MODELO;

public class Área {
    private Long id;

    private String nombre;

    private String director;

    private String ubicacion;

    private String trabjadores;

    private String extencionArea;

    private String sucursal;

    private String tecnologia;

    private String funcion;

    private Boolean activo;

    public Área() {
    }

    public Área(Long id, String nombre, String director, String ubicacion, String trabjadores, String extencionArea, String sucursal, String tecnologia, String funcion, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.director = director;
        this.ubicacion = ubicacion;
        this.trabjadores = trabjadores;
        this.extencionArea = extencionArea;
        this.sucursal = sucursal;
        this.tecnologia = tecnologia;
        this.funcion = funcion;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTrabjadores() {
        return trabjadores;
    }

    public void setTrabjadores(String trabjadores) {
        this.trabjadores = trabjadores;
    }

    public String getExtencionArea() {
        return extencionArea;
    }

    public void setExtencionArea(String extencionArea) {
        this.extencionArea = extencionArea;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
