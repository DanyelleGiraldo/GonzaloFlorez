/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gonzaloflorez.gonzalo.facturadeventa.domain.service;

import javax.swing.JTable;
import javax.swing.JTextField;

import com.gonzaloflorez.gonzalo.facturadeventa.domain.entity.FacturaVenta;



/**
 *
 * @author Danilo
 */
public interface FacturaVentaRepository {
    void save(FacturaVenta facturaVenta);
    void MostrarFacturaVenta(JTable paramTablaTotalFacturaVenta);
    void EliminarFacturaVenta(JTextField paramcodigo);
    
}
