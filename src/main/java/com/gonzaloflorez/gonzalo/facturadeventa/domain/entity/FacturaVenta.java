/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gonzaloflorez.gonzalo.facturadeventa.domain.entity;

import java.time.LocalDate;

/**
 *
 * @author Danilo
 */
public class FacturaVenta {
    private String numventa;
    private LocalDate fecha;
    private String empresa;
    private String direccion;
    private String telefono;
    private String codigoentidad;
    private String nit;
    private int valorprocedimiento;
    private int valorderechosala;
    private int materialeinsumo;
    private int valorlecturas;
    private int valorcopago;
    private int valorfactura;

    public FacturaVenta() {
    }

    public FacturaVenta(String numventa, LocalDate fecha, String empresa, String direccion, String telefono, String codigoentidad, String nit, int valorprocedimiento, int valorderechosala, int materialeinsumo, int valorlecturas, int valorcopago, int valorfactura) {
        this.numventa = numventa;
        this.fecha = fecha;
        this.empresa = empresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigoentidad = codigoentidad;
        this.nit = nit;
        this.valorprocedimiento = valorprocedimiento;
        this.valorderechosala = valorderechosala;
        this.materialeinsumo = materialeinsumo;
        this.valorlecturas = valorlecturas;
        this.valorcopago = valorcopago;
        this.valorfactura = valorfactura;
    }
    
    

    public String getNumventa() {
        return numventa;
    }

    public void setNumventa(String numventa) {
        this.numventa = numventa;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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

    public String getCodigoentidad() {
        return codigoentidad;
    }

    public void setCodigoentidad(String codigoentidad) {
        this.codigoentidad = codigoentidad;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getValorprocedimiento() {
        return valorprocedimiento;
    }

    public void setValorprocedimiento(int valorprocedimiento) {
        this.valorprocedimiento = valorprocedimiento;
    }

    public int getValorderechosala() {
        return valorderechosala;
    }

    public void setValorderechosala(int valorderechosala) {
        this.valorderechosala = valorderechosala;
    }

    public int getMaterialeinsumo() {
        return materialeinsumo;
    }

    public void setMaterialeinsumo(int materialeinsumo) {
        this.materialeinsumo = materialeinsumo;
    }

    public int getValorlecturas() {
        return valorlecturas;
    }

    public void setValorlecturas(int valorlecturas) {
        this.valorlecturas = valorlecturas;
    }

    public int getValorcopago() {
        return valorcopago;
    }

    public void setValorcopago(int valorcopago) {
        this.valorcopago = valorcopago;
    }

    public int getValorfactura() {
        return valorfactura;
    }

    public void setValorfactura(int valorfactura) {
        this.valorfactura = valorfactura;
    }
}
