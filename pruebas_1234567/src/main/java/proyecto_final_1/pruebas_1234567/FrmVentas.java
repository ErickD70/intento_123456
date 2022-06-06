/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_final_1.pruebas_1234567;
import DAO.ComidaDAO;
import Entidades.Comida;
import DAO.PostresDAO;
import Entidades.Postres;
import DAO.BebidasDAO;
import Entidades.Bebidas;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import Entidades.DetalleOrden;

public class FrmVentas extends javax.swing.JFrame {

    DefaultTableModel modelo=new DefaultTableModel(); 
       
    double precio=0;
    double precio2=0;
    double precio3=0;
    int cantidad=0;
    int cantidad2=0;
    int cantidad3=0;

    public FrmVentas() {
        initComponents();

        nomcomida();
        nombrebida();
        nombrePostre();
        calcularPreciocomida();
        calcularPreciobebida();
        calcularPreciopostre();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbocomida = new javax.swing.JComboBox<>();
        cbobebida = new javax.swing.JComboBox<>();
        cbopostre = new javax.swing.JComboBox<>();
        btnagregar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        lbliva = new javax.swing.JLabel();
        lblsubtotal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        spncomida = new javax.swing.JSpinner();
        spnbebida = new javax.swing.JSpinner();
        spnpostre = new javax.swing.JSpinner();
        lblprecio = new javax.swing.JLabel();
        lblimporte = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblprecio2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblprecio3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblimporte2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblimporte3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("cambio de algo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 440, 55));

        jLabel2.setText("Comida");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setText("Bebida");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        jLabel4.setText("Postre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

        jLabel5.setText("cantidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, -1, 20));

        jLabel6.setText("PRECIO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, 20));

        cbocomida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbocomida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocomidaActionPerformed(evt);
            }
        });
        getContentPane().add(cbocomida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 220, -1));

        cbobebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbobebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbobebidaActionPerformed(evt);
            }
        });
        getContentPane().add(cbobebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 220, -1));

        cbopostre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbopostre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbopostreActionPerformed(evt);
            }
        });
        getContentPane().add(cbopostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 220, -1));

        btnagregar.setText("jButton1");
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, -1, 70));

        jLabel9.setText("Total");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, 70, 30));

        jLabel8.setText("Iva");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 70, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 730, 290));

        jLabel11.setText("Subtotal");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, 70, 30));

        lbltotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbltotal.setText("$0.00 USD");
        getContentPane().add(lbltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 600, 90, 30));

        lbliva.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbliva.setText("$0.00 USD");
        getContentPane().add(lbliva, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 560, 90, 30));

        lblsubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblsubtotal.setText("$0.00 USD");
        getContentPane().add(lblsubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 520, 90, 30));

        jLabel14.setText("IMPORTE");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 20));

        jLabel15.setText("cantidad");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        jLabel16.setText("cantidad");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, 20));
        getContentPane().add(spncomida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 160, 40));
        getContentPane().add(spnbebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 170, 40));
        getContentPane().add(spnpostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 180, 40));

        lblprecio.setText("$0.00 USD");
        getContentPane().add(lblprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 60, 20));

        lblimporte.setText("$0.00 USD");
        getContentPane().add(lblimporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 60, 20));

        jLabel7.setText("PRECIO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, 20));

        lblprecio2.setText("$0.00 USD");
        getContentPane().add(lblprecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 60, 20));

        jLabel10.setText("PRECIO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, -1, 20));

        lblprecio3.setText("$0.00 USD");
        getContentPane().add(lblprecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, 60, 20));

        jLabel17.setText("IMPORTE");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, 20));

        lblimporte2.setText("$0.00 USD");
        getContentPane().add(lblimporte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 60, 20));

        jLabel18.setText("IMPORTE");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, -1, 20));

        lblimporte3.setText("$0.00 USD");
        getContentPane().add(lblimporte3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 330, 60, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbocomidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocomidaActionPerformed
        // TODO add your handling code here:
        calcularPreciocomida();
    }//GEN-LAST:event_cbocomidaActionPerformed

    private void cbobebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbobebidaActionPerformed
        // TODO add your handling code here:
        calcularPreciobebida();
    }//GEN-LAST:event_cbobebidaActionPerformed

    private void cbopostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbopostreActionPerformed
        // TODO add your handling code here:
        calcularPreciopostre();
    }//GEN-LAST:event_cbopostreActionPerformed
       
    private void nomcomida()
    {
       ComidaDAO c = new ComidaDAO();
       ArrayList<Comida> ListadoComida = c.ListadoComida();
   
       cbocomida.removeAllItems();
       
       for(int i = 0; i <ListadoComida.size();i++)
       {
       cbocomida.addItem(ListadoComida.get(i).getNombreComida());
       }
    }
    private void nombrebida()
    {
      BebidasDAO c = new BebidasDAO();
       ArrayList<Bebidas> Listadobebidas = c.ListadoBebidas();
   
       cbobebida.removeAllItems();
       
       for(int i = 0; i <Listadobebidas.size();i++)
       {
       cbobebida.addItem(Listadobebidas.get(i).getNombreBebida());
       }
    }
    
     private void nombrePostre()
    {
      PostresDAO c = new PostresDAO();
       ArrayList<Postres> Listadopostres = c.ListadoPostres();
   
       cbopostre.removeAllItems();
       
       for(int i = 0; i <Listadopostres.size();i++)
       {
       cbopostre.addItem(Listadopostres.get(i).getNombrePostres());
       }
    }
     
    public void calcularPreciocomida()
    {
     ComidaDAO c = new ComidaDAO();
     ArrayList<Comida> ListadoComida = c.ListadoComida();
     for(int i = 0; i <ListadoComida.size();i++)
     precio = ListadoComida.get(i).getPrecioComida();
    cantidad = Integer.parseInt(spncomida.getValue().toString());
    lblprecio.setText(Amoneda(precio));
    lblimporte.setText(Amoneda(precio*cantidad));

    }
    public void calcularPreciobebida()
    {
    BebidasDAO b = new BebidasDAO();
    ArrayList<Bebidas> Listadobebidas = b.ListadoBebidas();
    for(int i = 0; i <Listadobebidas.size();i++)
    precio2 = Listadobebidas.get(i).getPrecioBebida();
   cantidad2 = Integer.parseInt(spnbebida.getValue().toString());
    lblprecio2.setText(Amoneda(precio2));
    lblimporte2.setText(Amoneda(precio*cantidad2));
    }
    public void calcularPreciopostre()
    {
    PostresDAO p = new PostresDAO();
     ArrayList<Postres> Listadopostres = p.ListadoPostres();
     for(int i = 0; i <Listadopostres.size();i++)
     precio3 = Listadopostres.get(i).getPrecioPostre();
   cantidad3 = Integer.parseInt(spnpostre.getValue().toString());
   lblprecio3.setText(Amoneda(precio3));
    lblimporte3.setText(Amoneda(precio*cantidad3));
    }
    public String Amoneda (double precio)
    {
    return "$ "+Math.round(precio*100.00)/100.00+" USD";
    }
    
  
    
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
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JComboBox<String> cbobebida;
    private javax.swing.JComboBox<String> cbocomida;
    private javax.swing.JComboBox<String> cbopostre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblimporte;
    private javax.swing.JLabel lblimporte2;
    private javax.swing.JLabel lblimporte3;
    private javax.swing.JLabel lbliva;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JLabel lblprecio2;
    private javax.swing.JLabel lblprecio3;
    private javax.swing.JLabel lblsubtotal;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JSpinner spnbebida;
    private javax.swing.JSpinner spncomida;
    private javax.swing.JSpinner spnpostre;
    // End of variables declaration//GEN-END:variables
}
