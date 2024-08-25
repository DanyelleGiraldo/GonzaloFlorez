package com.gonzaloflorez.gonzalo.facturadeventa.infrastructure.out;

import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import com.gonzaloflorez.gonzalo.config.DatabaseConfig;
import com.gonzaloflorez.gonzalo.facturadeventa.domain.entity.FacturaVenta;
import com.gonzaloflorez.gonzalo.facturadeventa.domain.service.FacturaVentaRepository;



public class FacturaVentaMySQLRepository implements FacturaVentaRepository {

    @Override
    public void save(FacturaVenta facturaVenta) {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void MostrarFacturaVenta(JTable paramTablaTotalFacturaVenta) {
        DefaultTableModel modelo = new DefaultTableModel();

        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaTotalFacturaVenta.setRowSorter(OrdenarTabla);

        String sql="";
        
        modelo.addColumn("numventa");
        modelo.addColumn("fecha");
        modelo.addColumn("empresa");
        modelo.addColumn("direccion");
        modelo.addColumn("telefono");
        modelo.addColumn("codigoentidad");
        modelo.addColumn("nit");
        modelo.addColumn("valorprocedimiento");
        modelo.addColumn("valorderechosala");
        modelo.addColumn("materialeinsumo");
        modelo.addColumn("valorlecturas");
        modelo.addColumn("valorcopago");
        modelo.addColumn("valorfactura");
        

        paramTablaTotalFacturaVenta.setModel(modelo);

        sql = "Select * from ventas";

        String[] datos = new String[13];
        Statement st;
        try{
           st= DatabaseConfig.Getconnection().createStatement();

           ResultSet rs = st.executeQuery(sql);
           while (rs.next()) {
            datos[0]=rs.getString(1);            
            datos[1]=rs.getString(2);            
            datos[2]=rs.getString(3);        
            datos[3]=rs.getString(4);        
            datos[4]=rs.getString(5);        
            datos[5]=rs.getString(6);        
            datos[6]=rs.getString(7);        
            datos[7]=rs.getString(8);        
            datos[8]=rs.getString(9);        
            datos[9]=rs.getString(10);
            datos[10]=rs.getString(11);
            datos[11]=rs.getString(12);
            datos[12]=rs.getString(13);

            modelo.addRow(datos);  

           }
        } catch (Exception e) {
		    JOptionPane.showMessageDialog(null, "No se pudieron mostrar los registros error: " + e.toString());
        }
    }

    @Override
    public void EliminarFacturaVenta(JTextField paramcodigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'EliminarFacturaVenta'");
    }

    
}
