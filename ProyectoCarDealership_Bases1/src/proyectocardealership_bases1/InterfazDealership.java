
package proyectocardealership_bases1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class InterfazDealership extends javax.swing.JFrame {

    static Connection connection = null;
    static String databaseName = "proyectobasededatos-281400:us-central1:proyecto-1bases1";
    static String url = "jdbc:mysql://35.239.132.203:3306/" + "mydb" + "?autoReconnect=true&useSSL=false";;
    static String username = "proyecto-1bases1";
    static String password = "root";
    public InterfazDealership() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        initComponents();
	Class.forName("com.mysql.jdbc.Driver").newInstance();
        connection = DriverManager.getConnection(url, username, password);
        //Con connection ya implementas cualquier statement que querras
        /*
        PreparedStatement ps = connection.prepareStatement("INSERT INTO mydb.Planta_de_Fabricacion\n"
                + "(idPlanta,Ubicacion,Name,Tipo)\n"
                + "VALUES\n"
                + "(25,'Honduras','Planta Tura','Ensamblaje');");
        int status = ps.executeUpdate();
        if (status != 0) {
            System.out.println("Connection successfull");
            System.out.println("Inserted");
        } else {
            System.out.println("No connection");
        }
        */
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login_JD = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jtxt_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtxt_contrasena = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jtp_main = new javax.swing.JTabbedPane();
        Cliente_JP = new javax.swing.JPanel();
        Ubicacion_Vehiculos_JP = new javax.swing.JPanel();
        Informes_Ventas_JP = new javax.swing.JPanel();
        admin_JP = new javax.swing.JPanel();

        jtxt_usuario.setText("Ingrese su usuario");

        jLabel1.setText("USUARIO");

        jtxt_contrasena.setText("Ingrese contraseña");

        jLabel2.setText("Contraseña");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("LOGIN");

        jButton1.setText("Ingresar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(jtxt_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jtxt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(162, 162, 162))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel3)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jtxt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtxt_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Login_JDLayout = new javax.swing.GroupLayout(Login_JD.getContentPane());
        Login_JD.getContentPane().setLayout(Login_JDLayout);
        Login_JDLayout.setHorizontalGroup(
            Login_JDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Login_JDLayout.setVerticalGroup(
            Login_JDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtp_main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtp_mainMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Cliente_JPLayout = new javax.swing.GroupLayout(Cliente_JP);
        Cliente_JP.setLayout(Cliente_JPLayout);
        Cliente_JPLayout.setHorizontalGroup(
            Cliente_JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        Cliente_JPLayout.setVerticalGroup(
            Cliente_JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        jtp_main.addTab("Cliente", Cliente_JP);

        javax.swing.GroupLayout Ubicacion_Vehiculos_JPLayout = new javax.swing.GroupLayout(Ubicacion_Vehiculos_JP);
        Ubicacion_Vehiculos_JP.setLayout(Ubicacion_Vehiculos_JPLayout);
        Ubicacion_Vehiculos_JPLayout.setHorizontalGroup(
            Ubicacion_Vehiculos_JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        Ubicacion_Vehiculos_JPLayout.setVerticalGroup(
            Ubicacion_Vehiculos_JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        jtp_main.addTab("Ubicación de Vehículos", Ubicacion_Vehiculos_JP);

        javax.swing.GroupLayout Informes_Ventas_JPLayout = new javax.swing.GroupLayout(Informes_Ventas_JP);
        Informes_Ventas_JP.setLayout(Informes_Ventas_JPLayout);
        Informes_Ventas_JPLayout.setHorizontalGroup(
            Informes_Ventas_JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        Informes_Ventas_JPLayout.setVerticalGroup(
            Informes_Ventas_JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        jtp_main.addTab("Informes de Ventas", Informes_Ventas_JP);

        javax.swing.GroupLayout admin_JPLayout = new javax.swing.GroupLayout(admin_JP);
        admin_JP.setLayout(admin_JPLayout);
        admin_JPLayout.setHorizontalGroup(
            admin_JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        admin_JPLayout.setVerticalGroup(
            admin_JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        jtp_main.addTab("Administrador", admin_JP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtp_main)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtp_main)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtp_mainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtp_mainMouseClicked
        
    }//GEN-LAST:event_jtp_mainMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazDealership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazDealership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazDealership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazDealership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InterfazDealership().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cliente_JP;
    private javax.swing.JPanel Informes_Ventas_JP;
    private javax.swing.JDialog Login_JD;
    private javax.swing.JPanel Ubicacion_Vehiculos_JP;
    private javax.swing.JPanel admin_JP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jtp_main;
    private javax.swing.JTextField jtxt_contrasena;
    private javax.swing.JTextField jtxt_usuario;
    // End of variables declaration//GEN-END:variables
}