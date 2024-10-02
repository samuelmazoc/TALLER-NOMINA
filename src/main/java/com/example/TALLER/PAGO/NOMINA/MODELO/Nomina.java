package com.example.TALLER.PAGO.NOMINA.MODELO;

public class Nomina {
    private Long id;

    private Integer mes;

    private String empleado;

    private String diasLaborados;

    private Integer salario;

    private String deducciones;

    private String ahorro;

    private String empresa;

    private Boolean horasExtras;

    private Integer valorHora;

    public Nomina() {
    }

    public Nomina(Long id, Integer mes, String empleado, String diasLaborados, Integer salario, String deducciones, String ahorro, String empresa, Boolean horasExtras, Integer valorHora) {
        this.id = id;
        this.mes = mes;
        this.empleado = empleado;
        this.diasLaborados = diasLaborados;
        this.salario = salario;
        this.deducciones = deducciones;
        this.ahorro = ahorro;
        this.empresa = empresa;
        this.horasExtras = horasExtras;
        this.valorHora = valorHora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getDiasLaborados() {
        return diasLaborados;
    }

    public void setDiasLaborados(String diasLaborados) {
        this.diasLaborados = diasLaborados;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(String deducciones) {
        this.deducciones = deducciones;
    }

    public String getAhorro() {
        return ahorro;
    }

    public void setAhorro(String ahorro) {
        this.ahorro = ahorro;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Boolean getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(Boolean horasExtras) {
        this.horasExtras = horasExtras;
    }

    public Integer getValorHora() {
        return valorHora;
    }

    public void setValorHora(Integer valorHora) {
        this.valorHora = valorHora;
    }
}
