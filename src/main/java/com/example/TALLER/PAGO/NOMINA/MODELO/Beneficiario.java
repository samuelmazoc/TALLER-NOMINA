package com.example.TALLER.PAGO.NOMINA.MODELO;

public class Beneficiario {

    private Long id;

    private String nombre;

    private String apellido;

    private Integer edad;

    private String parentezco;

    private String correo;

    private Integer celular;

    private String direccion;

    private String empleado;

    private String sexo;

    public Beneficiario() {
    }

    public Beneficiario(Long id, String nombre, String apellido, Integer edad, String parentezco, String correo, Integer celular, String direccion, String empleado, String sexo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.parentezco = parentezco;
        this.correo = correo;
        this.celular = celular;
        this.direccion = direccion;
        this.empleado = empleado;
        this.sexo = sexo;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getParentezco() {
        return parentezco;
    }

    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
