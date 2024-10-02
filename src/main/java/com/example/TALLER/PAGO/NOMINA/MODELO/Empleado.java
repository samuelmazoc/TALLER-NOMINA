package com.example.TALLER.PAGO.NOMINA.MODELO;

public class Empleado {
    private Long id;

    private String nombre;

    private String apellido;

    private Integer edad;

    private String experienciaLaboral;

    private String educacion;

    private String banco;

    private Integer numeroCuentaBancaria;

    private String correo;

    private Integer celular;

    private String direccion;

    private String habilidades;

    private String fortalezas;

    private Boolean hijos;

    private String sexo;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String apellido, Integer edad, String experienciaLaboral, String educacion, String banco, Integer numeroCuentaBancaria, String correo, Integer celular, String direccion, String habilidades, String fortalezas, Boolean hijos, String sexo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.experienciaLaboral = experienciaLaboral;
        this.educacion = educacion;
        this.banco = banco;
        this.numeroCuentaBancaria = numeroCuentaBancaria;
        this.correo = correo;
        this.celular = celular;
        this.direccion = direccion;
        this.habilidades = habilidades;
        this.fortalezas = fortalezas;
        this.hijos = hijos;
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

    public String getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public void setExperienciaLaboral(String experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    public String getEducacion() {
        return educacion;
    }

    public void setEducacion(String educacion) {
        this.educacion = educacion;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Integer getNumeroCuentaBancaria() {
        return numeroCuentaBancaria;
    }

    public void setNumeroCuentaBancaria(Integer numeroCuentaBancaria) {
        this.numeroCuentaBancaria = numeroCuentaBancaria;
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

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getFortalezas() {
        return fortalezas;
    }

    public void setFortalezas(String fortalezas) {
        this.fortalezas = fortalezas;
    }

    public Boolean getHijos() {
        return hijos;
    }

    public void setHijos(Boolean hijos) {
        this.hijos = hijos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", experienciaLaboral='" + experienciaLaboral + '\'' +
                ", educacion='" + educacion + '\'' +
                ", banco=" + banco +
                ", numeroCuentaBancaria=" + numeroCuentaBancaria +
                ", correo='" + correo + '\'' +
                ", celular=" + celular +
                ", direccion='" + direccion + '\'' +
                ", habilidades='" + habilidades + '\'' +
                ", fortalezas='" + fortalezas + '\'' +
                ", hijos=" + hijos +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
