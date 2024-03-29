/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoparqueadero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
/**
 *
 * @author USUARIO
 */
public class PanelListarVehiculos extends javax.swing.JFrame {
    /**
     * Creates new form PanelListarVehiculos
     */
    
    
    public PanelListarVehiculos() {
        initComponents();
        rbFueraParq.setSelected(true);
        TableColumnModel columModel = tblVehiculos.getColumnModel();
        
        columModel.getColumn(0).setPreferredWidth(40);
        columModel.getColumn(1).setPreferredWidth(70);
        columModel.getColumn(2).setPreferredWidth(150);
        columModel.getColumn(3).setPreferredWidth(100);
        columModel.getColumn(4).setPreferredWidth(70);
        columModel.getColumn(5).setPreferredWidth(70);
        columModel.getColumn(6).setPreferredWidth(100);
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfPropietario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jLabel5 = new javax.swing.JLabel();
        rbEnParq = new javax.swing.JRadioButton();
        rbFueraParq = new javax.swing.JRadioButton();
        cbMoto = new javax.swing.JCheckBox();
        cbAuto = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        btnBuscar = new java.awt.Button();
        btnCerrar = new java.awt.Button();
        dcFechaBusqueda = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(484, 430));

        jLabel1.setText("Buscar vehiculos");

        jLabel2.setText("Placa");

        tfPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPlacaActionPerformed(evt);
            }
        });

        jLabel3.setText("Propietario");

        tfPropietario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPropietarioActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha");

        label1.setText("Tipo de vehiculo");

        jLabel5.setText("Ubicacion del vehiculo");

        rbEnParq.setText("En parqueadero");
        rbEnParq.setActionCommand("En Pa");
        rbEnParq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEnParqActionPerformed(evt);
            }
        });

        rbFueraParq.setText("Fuera de parqueadero");
        rbFueraParq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFueraParqActionPerformed(evt);
            }
        });

        cbMoto.setText("Motocicleta");
        cbMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMotoActionPerformed(evt);
            }
        });

        cbAuto.setText("Automovil");
        cbAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAutoActionPerformed(evt);
            }
        });

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Placa", "Propietario", "Tipo de Vehiculo", "Hora Entrada", "Hora Salida", "Pago"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVehiculos);

        btnBuscar.setLabel("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCerrar.setLabel("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(153, 153, 153))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(118, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbMoto)
                        .addGap(30, 30, 30)
                        .addComponent(cbAuto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbEnParq)
                        .addGap(30, 30, 30)
                        .addComponent(rbFueraParq)
                        .addGap(112, 112, 112))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel3))
                            .addComponent(tfPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel4)
                                .addGap(140, 140, 140))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dcFechaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dcFechaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbEnParq)
                            .addComponent(rbFueraParq)
                            .addComponent(cbMoto)
                            .addComponent(cbAuto))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    String consulta;
    String tipoVehiculo = "otro", estado = "", fecha = "";
    private void tfPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlacaActionPerformed

    private void rbEnParqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEnParqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEnParqActionPerformed

    private void tfPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPropietarioActionPerformed

    private void cbAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAutoActionPerformed

    private void cbMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMotoActionPerformed

    private void rbFueraParqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFueraParqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFueraParqActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        DefaultTableModel modelo= (DefaultTableModel) tblVehiculos.getModel();
        modelo.setRowCount(0);
        
        if(cbAuto.isSelected()){
            if (cbMoto.isSelected()){
                tipoVehiculo = "";
            } else {
                tipoVehiculo = "Automovil";
            }
        } else if(cbMoto.isSelected()){
            tipoVehiculo = "Motocicleta";
        }
        
        if (rbFueraParq.isSelected()){
            estado = "No Disponible";
        }
        
        if (rbEnParq.isSelected()){
            estado = "Disponible";
        }
        
        if (dcFechaBusqueda.getDate()!= null){
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dcFechaBusqueda.getDate();
            fecha = dateFormat.format(date);
        }
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bdparqueadero", "root", "");
            Statement stat = con.createStatement();
            consulta = "SELECT * FROM vehiculos WHERE estado = '"+estado+"' And tipoVehiculo LIKE'%"+tipoVehiculo+"%' AND placa LIKE '%"+tfPlaca.getText()+"%' AND horaentrada LIKE '%"+fecha+"%'";
            System.out.print(consulta);
            ResultSet rs = stat.executeQuery(consulta);
            rs.first();
            
            do{
                String horasalida = rs.getString(6);
                String pago = rs.getString(7);
                if (horasalida ==null){
                    horasalida = "No ha salido";
                    pago="0";
                } else {
                    horasalida = rs.getString(6).substring(10).substring(0,6);
                    pago = rs.getString(7);
                }
                
                String[] fila = {rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5).substring(10).substring(0,6), horasalida, "$" + pago};
                modelo.addRow(fila);
            } while (rs.next());
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PanelListarVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PanelListarVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bdparqueadero", "root", "");
            Statement stat = con.createStatement();
            consulta = "SELECT SUM(valorpagado) FROM vehiculos WHERE estado ='"+ estado +"' AND tipovehiculo LIKE'%" + tipoVehiculo +"%' AND placa LIKE '%"+ tfPlaca.getText() +"%' AND propietario LIKE '%"+ tfPropietario.getText() +"%' AND horasalida LIKE '"+ fecha +"%'";
            ResultSet rs = stat.executeQuery(consulta);
            rs.first();
            DecimalFormat df = new DecimalFormat("#.00");
            Double ingresosTotales = Double.parseDouble(rs.getString(1));
            JOptionPane.showMessageDialog(null, "El ingreso total del dia seleccionado es de: $"+ df.format(ingresosTotales)+" Pesos");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PanelListarVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        
    }//GEN-LAST:event_btnCerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelListarVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelListarVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelListarVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelListarVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelListarVehiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnBuscar;
    private java.awt.Button btnCerrar;
    private javax.swing.JCheckBox cbAuto;
    private javax.swing.JCheckBox cbMoto;
    private com.toedter.calendar.JDateChooser dcFechaBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JRadioButton rbEnParq;
    private javax.swing.JRadioButton rbFueraParq;
    private javax.swing.JTable tblVehiculos;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfPropietario;
    // End of variables declaration//GEN-END:variables
}
