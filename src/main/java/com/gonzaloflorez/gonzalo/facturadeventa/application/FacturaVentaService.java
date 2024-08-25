/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gonzaloflorez.gonzalo.facturadeventa.application;

import javax.swing.JTable;
import javax.swing.JTextField;

import com.gonzaloflorez.gonzalo.facturadeventa.domain.entity.FacturaVenta;
import com.gonzaloflorez.gonzalo.facturadeventa.domain.service.FacturaVentaRepository;

/**
 *
 * @author Danilo
 */
public class FacturaVentaService {
    private final FacturaVentaRepository facturaVentaRepository;

    public FacturaVentaService(FacturaVentaRepository facturaVentaRepository){
        this.facturaVentaRepository = facturaVentaRepository;
    }

    public void createFacturaVenta(FacturaVenta facturaVenta){
        facturaVentaRepository.save(facturaVenta);
    }

    public void mostrartFacturaVenta(JTable paramTablaTotalFacturaVenta){
        facturaVentaRepository.MostrarFacturaVenta(paramTablaTotalFacturaVenta);
    }

    public void EliminarFacturaVenta(JTextField paramcodigo){
        facturaVentaRepository.EliminarFacturaVenta(paramcodigo);
    }

}
