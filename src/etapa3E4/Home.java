/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etapa3E4;

import java.util.TreeSet;

/**
 *
 * @author HP
 */
public class Home extends javax.swing.JFrame {

    public static TreeSet<Producto> listaProducto = new TreeSet<>();

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        cargarProducto();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuRublo = new javax.swing.JMenuItem();
        jMenuNombre = new javax.swing.JMenuItem();
        jMenuPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 500));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        jMenu1.setText("Administracion");

        jMenuItem1.setText("Productos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jMenuRublo.setText("Rublo");
        jMenuRublo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRubloActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuRublo);

        jMenuNombre.setText("Nombre");
        jMenuNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNombreActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuNombre);

        jMenuPrecio.setText("Precio");
        jMenu2.add(jMenuPrecio);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNombreActionPerformed
       
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaXnombre ventana = new BusquedaXnombre();
        ventana.setVisible(true);
        escritorio.add(ventana);
        escritorio.moveToFront(ventana);
    }//GEN-LAST:event_jMenuNombreActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      
        escritorio.removeAll();
        escritorio.repaint();
        CrearProducto ventana = new CrearProducto();
        ventana.setVisible(true);
        escritorio.add(ventana);
        escritorio.moveToFront(ventana);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuRubloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRubloActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaXrublo ventana = new BusquedaXrublo();
        ventana.setVisible(true);
        escritorio.add(ventana);
        escritorio.moveToFront(ventana);
    }//GEN-LAST:event_jMenuRubloActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuNombre;
    private javax.swing.JMenuItem jMenuPrecio;
    private javax.swing.JMenuItem jMenuRublo;
    // End of variables declaration//GEN-END:variables

    private void cargarProducto() {
        listaProducto.add(new Producto(10, "azucar x 1kg", 509.77, 100, Categoria.COMESTIBLE));
        listaProducto.add(new Producto(11, "pure-tomate x170g", 209.77, 100, Categoria.COMESTIBLE));
        listaProducto.add(new Producto(16, "arroz x 1/2kg", 109.77, 100, Categoria.COMESTIBLE));
        listaProducto.add(new Producto(19, "Dulce-leche x 1/2kg", 409.77, 100, Categoria.COMESTIBLE));
        listaProducto.add(new Producto(12, "yerba x 1kg", 709.77, 100, Categoria.COMESTIBLE));

        listaProducto.add(new Producto(20, "lavandina x 1l", 509.77, 100, Categoria.LIMPIEZA));
        listaProducto.add(new Producto(21, "jabon-liquido x170cm", 209.77, 100, Categoria.LIMPIEZA));
        listaProducto.add(new Producto(26, "detergente x 300cm", 109.77, 100, Categoria.LIMPIEZA));
        listaProducto.add(new Producto(29, "perfumina x 800cm", 1409.77, 100, Categoria.LIMPIEZA));
        listaProducto.add(new Producto(22, "escoba x 1.50mts", 799.77, 100, Categoria.LIMPIEZA));

        listaProducto.add(new Producto(40, "locion x 7l0cmm", 509.77, 100, Categoria.PERFUMERIA));
        listaProducto.add(new Producto(41, "jabon-manos x170cm", 1209.77, 100, Categoria.PERFUMERIA));
        listaProducto.add(new Producto(46, "crema-acondi. x 300cm", 1109.77, 100, Categoria.PERFUMERIA));
        listaProducto.add(new Producto(49, "shampoo x 800cm", 1409.77, 100, Categoria.PERFUMERIA));
        listaProducto.add(new Producto(42, "desodorante x 170cm", 1709.77, 100, Categoria.PERFUMERIA));
    }
}
