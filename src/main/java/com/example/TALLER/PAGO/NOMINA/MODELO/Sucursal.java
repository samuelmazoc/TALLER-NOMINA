package com.example.TALLER.PAGO.NOMINA.MODELO;

public class Sucursal {
    private Long id;

    private String ubicacion;

    private String areas;

    private Integer empleados;

    private String direccion;

    private String telefono;

    private String extencion;

    private Boolean transporte;

    private Boolean parquedero;

    private String correo;

    public Sucursal() {
    }

    public Sucursal(Long id, String ubicacion, String areas, Integer empleados, String direccion, String telefono, String extencion, Boolean transporte, Boolean parquedero, String correo) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.areas = areas;
        this.empleados = empleados;
        this.direccion = direccion;
        this.telefono = telefono;
        this.extencion = extencion;
        this.transporte = transporte;
        this.parquedero = parquedero;
        this.correo = correo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas;
    }

    public Integer getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Integer empleados) {
        this.empleados = empleados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getExtencion() {
        return extencion;
    }

    public void setExtencion(String extencion) {
        this.extencion = extencion;
    }

    public Boolean getTransporte() {
        return transporte;
    }

    public void setTransporte(Boolean transporte) {
        this.transporte = transporte;
    }

    public Boolean getParquedero() {
        return parquedero;
    }

    public void setParquedero(Boolean parquedero) {
        this.parquedero = parquedero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
