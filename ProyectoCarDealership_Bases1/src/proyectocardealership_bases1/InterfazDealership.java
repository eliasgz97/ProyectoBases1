package proyectocardealership_bases1;

import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class InterfazDealership extends javax.swing.JFrame {

    static Connection connection = null;
    static String databaseName = "proyectobasededatos-281400:us-central1:proyecto-1bases1";
    static String url = "jdbc:mysql://35.239.132.203:3306/" + "mydb" + "?autoReconnect=true&useSSL=false";
    ;
    static String username = "proyecto-1bases1";
    static String password = "root";
    static Statement stmt;

    ConexionBD con = new ConexionBD();
    Connection cn = con.conexion();

    public InterfazDealership() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        initComponents();

        jtp_main.setEnabledAt(0, false);
        jtp_main.setEnabledAt(1, false);
        jtp_main.setEnabledAt(2, false);
        jtp_main.setEnabledAt(3, true);
        jtp_main.setSelectedIndex(3);
        jtxt_usuario.setText("DanielRC");
        jpf_contrasena.setText("1234");
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

    private void ELIMINAR() throws SQLException {
        int quien = A_Quien();
        switch (quien) {
            case 1:
                //Aqui cargas las plantas para eliminar, en la Jlist

//                jD_eliminarNonTrans.pack();
//                jD_eliminarNonTrans.setModal(true);
//                jD_eliminarNonTrans.setLocationRelativeTo(this);
//                jD_eliminarNonTrans.setVisible(true);
                break;
            case 2:
//                Aqui cargas los Vehiculos para eliminar  en la Jlist
//                jD_eliminarNonTrans.pack();
//                jD_eliminarNonTrans.setModal(true);
//                jD_eliminarNonTrans.setLocationRelativeTo(this);
//                jD_eliminarNonTrans.setVisible(true);
                break;
            case 3:
                //Aqui cargas las ventas para eliminar
//                jD_eliminarTrans.pack();
//                jD_eliminarTrans.setModal(true);
//                jD_eliminarTrans.setLocationRelativeTo(this);
//                jD_eliminarTrans.setVisible(true);
                break;
            case 4:
                //Aqui cargas los proveedores para eliminar  en la Jlist
//                jD_eliminarNonTrans.pack();
//                jD_eliminarNonTrans.setModal(true);
//                jD_eliminarNonTrans.setLocationRelativeTo(this);
//                jD_eliminarNonTrans.setVisible(true);
                break;
            case 5:
                //Aqui cargas los Concesionario para eliminar en la Jlist
//                jD_eliminarNonTrans.pack();
//                jD_eliminarNonTrans.setModal(true);
//                jD_eliminarNonTrans.setLocationRelativeTo(this);
//                jD_eliminarNonTrans.setVisible(true);
                break;
            case 6:
                //Aqui cargas las Compras para eliminar
//                jD_eliminarTrans.pack();
//                jD_eliminarTrans.setModal(true);
//                jD_eliminarTrans.setLocationRelativeTo(this);
//                jD_eliminarTrans.setVisible(true);
                break;
            case 7:
                //Aqui cargas las Companias para eliminar en la Jlist
//                jD_eliminarNonTrans.pack();
//                jD_eliminarNonTrans.setModal(true);
//                jD_eliminarNonTrans.setLocationRelativeTo(this);
//                jD_eliminarNonTrans.setVisible(true);
                break;
            case 8:
                //Aqui cargas los Clientas para eliminar en la Jlist
//                jD_eliminarNonTrans.pack();
//                jD_eliminarNonTrans.setModal(true);
//                jD_eliminarNonTrans.setLocationRelativeTo(this);
//                jD_eliminarNonTrans.setVisible(true);
                break;
            case 9:
                //Aqui cargas las Provisiones para eliminar
                String sqlEliminarVenta = "SELECT idVenta FROM Venta";
                llenarComboBox(jcbx_eliminaridventa, sqlEliminarVenta);
                try {
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery("select * from  Venta");
                    JTable table_prueba = new JTable(buildTableModel(rs));
                    DefaultTableModel tabla_eliminarventa = (DefaultTableModel) table_prueba.getModel();
                    jt_eliminarventa.setModel(tabla_eliminarventa);
                } catch (SQLException ex) {
                    Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
                }
                jd_eliminarventa.pack();
                jd_eliminarventa.setModal(true);
                jd_eliminarventa.setLocationRelativeTo(this);
                jd_eliminarventa.setVisible(true);
                break;
            default:
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jd_CrearCliente = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxt_idcliente = new javax.swing.JTextField();
        jtxt_nombrecliente = new javax.swing.JTextField();
        rb_sexoM = new javax.swing.JRadioButton();
        rb_sexoF = new javax.swing.JRadioButton();
        jtxt_telefonocliente = new javax.swing.JTextField();
        jtxt_direccioncliente = new javax.swing.JTextField();
        jcbx_idconcesionariocrearcliente = new javax.swing.JComboBox<>();
        jbt_crearcliente = new javax.swing.JButton();
        rb_empresacliente = new javax.swing.JRadioButton();
        jd_CrearConcesionario = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtxt_correoconcesionario = new javax.swing.JTextField();
        jtxt_paisconcesionario = new javax.swing.JTextField();
        jtxt_numerotelefonoconcesionario = new javax.swing.JTextField();
        jbt_crearconcesionario = new javax.swing.JButton();
        jbt_agregarpaisconcesionario = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtxt_ciudadpais = new javax.swing.JTextField();
        jtxt_nombreconcesionario = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jd_CrearMarca = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtxt_codigomarca = new javax.swing.JTextField();
        jtxt_nombremarca = new javax.swing.JTextField();
        jbt_crearmarca = new javax.swing.JButton();
        jd_CrearModelo = new javax.swing.JDialog();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jtxt_idmodelo = new javax.swing.JTextField();
        jtxt_motormodelo = new javax.swing.JTextField();
        jtxt_modelotipo = new javax.swing.JTextField();
        jcbx_codigomarcamodelo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jtxt_nombreestilo = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jbt_agregarestilo = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jbt_agregartransmision = new javax.swing.JButton();
        jrdb_manual = new javax.swing.JRadioButton();
        jrdb_automatico = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jtxt_nombrecolor = new javax.swing.JTextField();
        jbt_agregarcolor = new javax.swing.JButton();
        jtxt_nombremodelo = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jd_CrearPieza = new javax.swing.JDialog();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jcbx_idplantadefabricacionpieza = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        jtxt_nombrepieza = new javax.swing.JTextField();
        jcbx_idmodelopieza = new javax.swing.JComboBox<>();
        jbt_insertarpieza = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jcbx_correoproveedorhaspieza = new javax.swing.JComboBox<>();
        jd_CrearProveedor = new javax.swing.JDialog();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jtxt_correoelectronicoproveedor = new javax.swing.JTextField();
        jtxt_paisproveedor = new javax.swing.JTextField();
        jtxt_numerotelefonoproveedor = new javax.swing.JTextField();
        jbt_insertarproveedor = new javax.swing.JButton();
        jd_CrearVehiculo = new javax.swing.JDialog();
        jLabel54 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jtxt_VIN = new javax.swing.JTextField();
        jcbx_correoconcesionariovehiculo = new javax.swing.JComboBox<>();
        jcbx_codigomarcavehiculo = new javax.swing.JComboBox<>();
        jcbx_plantadefabricacionvehiculo = new javax.swing.JComboBox<>();
        jbt_insertarvehiculo = new javax.swing.JButton();
        jbt_generarvincode = new javax.swing.JButton();
        jtxt_numeracion = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jcbx_modelovehiculo = new javax.swing.JComboBox<>();
        jLabel97 = new javax.swing.JLabel();
        jtxt_estadovehiculo = new javax.swing.JTextField();
        jd_CrearPlanta = new javax.swing.JDialog();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jtxt_idplantafabricacion = new javax.swing.JTextField();
        jtxt_ubicacionplanta = new javax.swing.JTextField();
        jtxt_nombreplanta = new javax.swing.JTextField();
        jtxt_tipo = new javax.swing.JTextField();
        jbt_ingresarplantadefabricacion = new javax.swing.JButton();
        Btg_tipo = new javax.swing.ButtonGroup();
        jd_ventanaCRUD = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jB_anteriorProveedoresClientes1 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jB_ejecutarCRUD = new javax.swing.JButton();
        jRB_pieza = new javax.swing.JRadioButton();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jRB_modificar = new javax.swing.JRadioButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jRB_proveedor = new javax.swing.JRadioButton();
        jRB_marca = new javax.swing.JRadioButton();
        jRB_vehiculo = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jRB_plantaFabricacion = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        jRB_consecionario = new javax.swing.JRadioButton();
        jRB_modelo = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jRB_cliente = new javax.swing.JRadioButton();
        jRB_venta = new javax.swing.JRadioButton();
        jLabel90 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jRB_crear = new javax.swing.JRadioButton();
        jRB_eliminar = new javax.swing.JRadioButton();
        jLabel132 = new javax.swing.JLabel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        panelImage5 = new org.edisoncor.gui.panel.PanelImage();
        panelImage6 = new org.edisoncor.gui.panel.PanelImage();
        panelImage7 = new org.edisoncor.gui.panel.PanelImage();
        panelImage8 = new org.edisoncor.gui.panel.PanelImage();
        panelImage9 = new org.edisoncor.gui.panel.PanelImage();
        panelImage10 = new org.edisoncor.gui.panel.PanelImage();
        panelImage11 = new org.edisoncor.gui.panel.PanelImage();
        panelImage14 = new org.edisoncor.gui.panel.PanelImage();
        jLabel39 = new javax.swing.JLabel();
        jd_crearventa = new javax.swing.JDialog();
        jLabel84 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jcbx_correoconcesionarioventa = new javax.swing.JComboBox<>();
        jcbx_idclienteventa = new javax.swing.JComboBox<>();
        jB_crearVenta = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        jcbx_vinvehiculoventa = new javax.swing.JComboBox<>();
        jLabel87 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jtxt_idventa = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jtxt_cantidadventa = new javax.swing.JTextField();
        date_fechaventa = new com.toedter.calendar.JDateChooser();
        jLabel116 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_bitacora = new javax.swing.JTable();
        btg_entidades = new javax.swing.ButtonGroup();
        btg_transmision = new javax.swing.ButtonGroup();
        jd_modificarCliente = new javax.swing.JDialog();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jtxt_modificarnombrecliente = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        rb_sexoM1 = new javax.swing.JRadioButton();
        rb_sexoF1 = new javax.swing.JRadioButton();
        jLabel77 = new javax.swing.JLabel();
        jtxt_modificartelefonocliente = new javax.swing.JTextField();
        jtxt_modificardireccioncliente = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jcbx_idconcesionariomodificarcliente = new javax.swing.JComboBox<>();
        jbt_modificarrcliente = new javax.swing.JButton();
        rb_Empresa = new javax.swing.JRadioButton();
        jcbx_idmodificarcliente = new javax.swing.JComboBox<>();
        jLabel81 = new javax.swing.JLabel();
        jd_modificarmarca = new javax.swing.JDialog();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jtxt_modificarnombremarca = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jbt_guardarrmarca = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        jcbx_codigomarcamodificarmarca = new javax.swing.JComboBox<>();
        jbg_modificartipo = new javax.swing.ButtonGroup();
        jd_modificarmodelo = new javax.swing.JDialog();
        jtxt_modificarmotormodelo = new javax.swing.JTextField();
        jtxt_modificarmodelotipo = new javax.swing.JTextField();
        jcbx_codigomarcamodificarmodelo = new javax.swing.JComboBox<>();
        jLabel83 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jtxt_modificarnombremodelo = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jcbx_idmodelomodificar = new javax.swing.JComboBox<>();
        btg_operaciones = new javax.swing.ButtonGroup();
        jd_modificarconcesionario = new javax.swing.JDialog();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jtxt_modificarnumerotelefonoconcesionario = new javax.swing.JTextField();
        jbt_modificarconcesionario = new javax.swing.JButton();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jtxt_paisconcesionario1 = new javax.swing.JTextField();
        jtxt_ciudadpais1 = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        jbt_agregarpaisconcesionario1 = new javax.swing.JButton();
        jcbx_correoelectronicoconcesionario_modificar = new javax.swing.JComboBox<>();
        jd_modificarplanta = new javax.swing.JDialog();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jtxt_modificarubicacionplanta = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jtxt_modificarnombreplanta = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jtxt_modificartipoplanta = new javax.swing.JTextField();
        jbt_mdificarplantadefabricacion = new javax.swing.JButton();
        jcbx_modificarplantaid = new javax.swing.JComboBox<>();
        jd_modificarventa = new javax.swing.JDialog();
        jb_guardarventa = new javax.swing.JButton();
        date_modificarfechaventa = new com.toedter.calendar.JDateChooser();
        jLabel108 = new javax.swing.JLabel();
        jcbx_modificaridclienteventa = new javax.swing.JComboBox<>();
        jLabel112 = new javax.swing.JLabel();
        jtxt_modificarcantidadventa = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jcbx_modificaridventa = new javax.swing.JComboBox<>();
        jd_reportes = new javax.swing.JDialog();
        jLabel117 = new javax.swing.JLabel();
        jb_tendenciaxano = new javax.swing.JButton();
        jb_tendenciaxsemana = new javax.swing.JButton();
        jb_mayorescantidades = new javax.swing.JButton();
        jb_mayor_rotacion = new javax.swing.JButton();
        jb_tendenciaxmes = new javax.swing.JButton();
        jb_mejoresmontos = new javax.swing.JButton();
        jb_mejoresmeses = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jd_eliminarventa = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_eliminarventa = new javax.swing.JTable();
        jLabel110 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jcbx_eliminaridventa = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jd_inventario = new javax.swing.JDialog();
        jScrollPane6 = new javax.swing.JScrollPane();
        jt_concesionarionventario = new javax.swing.JTable();
        jcbx_concesionarioinventario = new javax.swing.JComboBox<>();
        jLabel131 = new javax.swing.JLabel();
        jbt_buscarconcesionarioinventario = new javax.swing.JButton();
        jLabel133 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtp_main = new javax.swing.JTabbedPane();
        Cliente_JP = new javax.swing.JPanel();
        panelImage12 = new org.edisoncor.gui.panel.PanelImage();
        jcb_clientemarca = new javax.swing.JComboBox<>();
        jcb_clientecolor = new javax.swing.JComboBox<>();
        jcb_ubicacion = new javax.swing.JComboBox<>();
        jb_localizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_clientes = new javax.swing.JTable();
        jLabel109 = new javax.swing.JLabel();
        Informes_Ventas_JP = new javax.swing.JPanel();
        panelImage16 = new org.edisoncor.gui.panel.PanelImage();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_informe = new javax.swing.JTable();
        jb_informe = new javax.swing.JButton();
        admin_JP = new javax.swing.JPanel();
        panelImage13 = new org.edisoncor.gui.panel.PanelImage();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel130 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        Ingresar = new javax.swing.JPanel();
        panelImage15 = new org.edisoncor.gui.panel.PanelImage();
        jLabel15 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jtxt_usuario = new javax.swing.JTextField();
        jpf_contrasena = new javax.swing.JPasswordField();
        jLabel25 = new javax.swing.JLabel();
        jrb_cliente = new javax.swing.JRadioButton();
        jrb_conse = new javax.swing.JRadioButton();
        jrb_market = new javax.swing.JRadioButton();
        jrb_admin = new javax.swing.JRadioButton();
        jbt_login = new javax.swing.JButton();
        panelImageReflect1 = new org.edisoncor.gui.panel.PanelImageReflect();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Crear Cliente");

        jLabel5.setText("Id Cliente");

        jLabel6.setText("Nombre");

        jLabel7.setText("Tipo/Sexo");

        jLabel8.setText("Teléfono");

        jLabel9.setText("Dirección");

        jLabel10.setText("Concesionario Correo");

        Btg_tipo.add(rb_sexoM);
        rb_sexoM.setText("M");

        Btg_tipo.add(rb_sexoF);
        rb_sexoF.setText("F");

        jbt_crearcliente.setText("Crear");
        jbt_crearcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_crearclienteActionPerformed(evt);
            }
        });

        Btg_tipo.add(rb_empresacliente);
        rb_empresacliente.setText("Empresa");

        javax.swing.GroupLayout jd_CrearClienteLayout = new javax.swing.GroupLayout(jd_CrearCliente.getContentPane());
        jd_CrearCliente.getContentPane().setLayout(jd_CrearClienteLayout);
        jd_CrearClienteLayout.setHorizontalGroup(
            jd_CrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearClienteLayout.createSequentialGroup()
                .addGroup(jd_CrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CrearClienteLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jd_CrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jd_CrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_CrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxt_idcliente)
                                .addComponent(jtxt_nombrecliente)
                                .addComponent(jcbx_idconcesionariocrearcliente, 0, 118, Short.MAX_VALUE)
                                .addComponent(jtxt_telefonocliente)
                                .addComponent(jtxt_direccioncliente))
                            .addGroup(jd_CrearClienteLayout.createSequentialGroup()
                                .addComponent(rb_sexoM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb_sexoF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_empresacliente))))
                    .addGroup(jd_CrearClienteLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel4))
                    .addGroup(jd_CrearClienteLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jbt_crearcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jd_CrearClienteLayout.setVerticalGroup(
            jd_CrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearClienteLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(43, 43, 43)
                .addGroup(jd_CrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxt_idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jd_CrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_sexoM)
                        .addComponent(rb_sexoF)
                        .addComponent(rb_empresacliente)))
                .addGap(12, 12, 12)
                .addGroup(jd_CrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtxt_telefonocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_CrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jtxt_direccioncliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jcbx_idconcesionariocrearcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jbt_crearcliente)
                .addGap(31, 31, 31))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Crear Concesionario");

        jLabel12.setText("Correo Electrónico");

        jLabel13.setText("País");

        jLabel14.setText("Número de Teléfono");

        jbt_crearconcesionario.setText("Crear");
        jbt_crearconcesionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_crearconcesionarioActionPerformed(evt);
            }
        });

        jbt_agregarpaisconcesionario.setText("Agregar");
        jbt_agregarpaisconcesionario.setEnabled(false);
        jbt_agregarpaisconcesionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_agregarpaisconcesionarioActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Agregar Países y Ciudades de Concesionario");

        jLabel23.setText("Ciudad");

        jLabel107.setText("Nombre");

        javax.swing.GroupLayout jd_CrearConcesionarioLayout = new javax.swing.GroupLayout(jd_CrearConcesionario.getContentPane());
        jd_CrearConcesionario.getContentPane().setLayout(jd_CrearConcesionarioLayout);
        jd_CrearConcesionarioLayout.setHorizontalGroup(
            jd_CrearConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_CrearConcesionarioLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jd_CrearConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_CrearConcesionarioLayout.createSequentialGroup()
                        .addGroup(jd_CrearConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jd_CrearConcesionarioLayout.createSequentialGroup()
                                .addGroup(jd_CrearConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel107))
                                .addGap(18, 18, 18)
                                .addGroup(jd_CrearConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxt_numerotelefonoconcesionario, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(jbt_crearconcesionario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxt_correoconcesionario, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(jtxt_nombreconcesionario)))
                            .addGroup(jd_CrearConcesionarioLayout.createSequentialGroup()
                                .addGroup(jd_CrearConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel13))
                                .addGap(34, 34, 34)
                                .addGroup(jd_CrearConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxt_paisconcesionario)
                                    .addComponent(jtxt_ciudadpais, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))))
                        .addGap(27, 27, 27)
                        .addComponent(jbt_agregarpaisconcesionario)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_CrearConcesionarioLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(143, 143, 143))))
            .addGroup(jd_CrearConcesionarioLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel22)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_CrearConcesionarioLayout.setVerticalGroup(
            jd_CrearConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearConcesionarioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jd_CrearConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_nombreconcesionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel107))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_CrearConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtxt_correoconcesionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jd_CrearConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxt_numerotelefonoconcesionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(54, 54, 54)
                .addComponent(jbt_crearconcesionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGroup(jd_CrearConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CrearConcesionarioLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jd_CrearConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxt_paisconcesionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_CrearConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jtxt_ciudadpais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_CrearConcesionarioLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jbt_agregarpaisconcesionario)
                        .addGap(64, 64, 64))))
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Crear Marca");

        jLabel17.setText("Código Marca");

        jLabel18.setText("Nombre");

        jbt_crearmarca.setText("Crear");
        jbt_crearmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_crearmarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_CrearMarcaLayout = new javax.swing.GroupLayout(jd_CrearMarca.getContentPane());
        jd_CrearMarca.getContentPane().setLayout(jd_CrearMarcaLayout);
        jd_CrearMarcaLayout.setHorizontalGroup(
            jd_CrearMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearMarcaLayout.createSequentialGroup()
                .addGroup(jd_CrearMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CrearMarcaLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jd_CrearMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jd_CrearMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxt_codigomarca)
                            .addComponent(jtxt_nombremarca, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                    .addGroup(jd_CrearMarcaLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel16))
                    .addGroup(jd_CrearMarcaLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jbt_crearmarca)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jd_CrearMarcaLayout.setVerticalGroup(
            jd_CrearMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearMarcaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel16)
                .addGap(48, 48, 48)
                .addGroup(jd_CrearMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtxt_codigomarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jd_CrearMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jtxt_nombremarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jbt_crearmarca)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Crear Modelo");

        jLabel1.setText("Id Modelo");

        jLabel3.setText("Motor");

        jLabel35.setText("Tipo");

        jtxt_idmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_idmodeloActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo Marca");

        jButton3.setText("Insertar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel28.setText("Nombre de Estilo");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setText("Estilo");

        jbt_agregarestilo.setText("Agregar Estilo");
        jbt_agregarestilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_agregarestiloActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setText("Transmisión");

        jLabel44.setText("Transmisión");

        jbt_agregartransmision.setText("Agregar Transmision");
        jbt_agregartransmision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_agregartransmisionActionPerformed(evt);
            }
        });

        btg_transmision.add(jrdb_manual);
        jrdb_manual.setText("Manual");

        btg_transmision.add(jrdb_automatico);
        jrdb_automatico.setText("Automático");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setText("Color");

        jLabel45.setText("Nombre Color");

        jbt_agregarcolor.setText("Agregar Color");
        jbt_agregarcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_agregarcolorActionPerformed(evt);
            }
        });

        jtxt_nombremodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombremodeloActionPerformed(evt);
            }
        });

        jLabel82.setText("Nombre");

        javax.swing.GroupLayout jd_CrearModeloLayout = new javax.swing.GroupLayout(jd_CrearModelo.getContentPane());
        jd_CrearModelo.getContentPane().setLayout(jd_CrearModeloLayout);
        jd_CrearModeloLayout.setHorizontalGroup(
            jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel20))
                    .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                        .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                                        .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel37)
                                            .addComponent(jLabel28))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtxt_nombreestilo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                                        .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel45))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtxt_nombrecolor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63))))
                            .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jbt_agregarestilo)))
                        .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel41))
                            .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbt_agregartransmision)
                                    .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                                        .addComponent(jLabel44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrdb_automatico)
                                            .addComponent(jrdb_manual)))))))
                    .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jbt_agregarcolor))
                    .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                                .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel35))
                                .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcbx_codigomarcamodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxt_motormodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxt_idmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxt_modelotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel82)
                                .addGap(18, 18, 18)
                                .addComponent(jtxt_nombremodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jd_CrearModeloLayout.setVerticalGroup(
            jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(27, 27, 27)
                .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxt_idmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_motormodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_modelotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_nombremodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82))
                .addGap(29, 29, 29)
                .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbx_codigomarcamodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jtxt_nombreestilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jbt_agregarestilo)
                        .addGap(34, 34, 34))
                    .addGroup(jd_CrearModeloLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(18, 18, 18)
                        .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jrdb_manual))
                        .addGap(7, 7, 7)
                        .addComponent(jrdb_automatico)
                        .addGap(18, 18, 18)
                        .addComponent(jbt_agregartransmision)))
                .addGap(31, 31, 31)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addGroup(jd_CrearModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jtxt_nombrecolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbt_agregarcolor)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setText("Piezas");

        jLabel47.setText("Nombre Pieza");

        jLabel48.setText("Id_modelo");

        jLabel49.setText("Id planta de fabricación");

        jbt_insertarpieza.setText("Insertar");
        jbt_insertarpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_insertarpiezaActionPerformed(evt);
            }
        });

        jLabel65.setText("Correo Proveedor");

        javax.swing.GroupLayout jd_CrearPiezaLayout = new javax.swing.GroupLayout(jd_CrearPieza.getContentPane());
        jd_CrearPieza.getContentPane().setLayout(jd_CrearPiezaLayout);
        jd_CrearPiezaLayout.setHorizontalGroup(
            jd_CrearPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearPiezaLayout.createSequentialGroup()
                .addGroup(jd_CrearPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CrearPiezaLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jd_CrearPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_CrearPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxt_nombrepieza)
                            .addComponent(jcbx_idmodelopieza, 0, 148, Short.MAX_VALUE)))
                    .addGroup(jd_CrearPiezaLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel46))
                    .addGroup(jd_CrearPiezaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jd_CrearPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel65)
                            .addComponent(jLabel49))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_CrearPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbt_insertarpieza)
                            .addComponent(jcbx_idplantadefabricacionpieza, 0, 155, Short.MAX_VALUE)
                            .addComponent(jcbx_correoproveedorhaspieza, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jd_CrearPiezaLayout.setVerticalGroup(
            jd_CrearPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearPiezaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel46)
                .addGap(43, 43, 43)
                .addGroup(jd_CrearPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jtxt_nombrepieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jd_CrearPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jcbx_idmodelopieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jd_CrearPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbx_idplantadefabricacionpieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addGap(29, 29, 29)
                .addGroup(jd_CrearPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65)
                    .addComponent(jcbx_correoproveedorhaspieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jbt_insertarpieza)
                .addGap(81, 81, 81))
        );

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setText("Proveedores");

        jLabel51.setText("Correo Electronico");

        jLabel52.setText("País");

        jLabel53.setText("Número de Teléfono");

        jbt_insertarproveedor.setText("Insertar Proveedor");
        jbt_insertarproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_insertarproveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_CrearProveedorLayout = new javax.swing.GroupLayout(jd_CrearProveedor.getContentPane());
        jd_CrearProveedor.getContentPane().setLayout(jd_CrearProveedorLayout);
        jd_CrearProveedorLayout.setHorizontalGroup(
            jd_CrearProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearProveedorLayout.createSequentialGroup()
                .addGroup(jd_CrearProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CrearProveedorLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel50))
                    .addGroup(jd_CrearProveedorLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jd_CrearProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel53)
                            .addComponent(jLabel52)
                            .addComponent(jLabel51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_CrearProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxt_correoelectronicoproveedor)
                            .addComponent(jtxt_paisproveedor)
                            .addComponent(jtxt_numerotelefonoproveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                    .addGroup(jd_CrearProveedorLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jbt_insertarproveedor)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jd_CrearProveedorLayout.setVerticalGroup(
            jd_CrearProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearProveedorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel50)
                .addGap(39, 39, 39)
                .addGroup(jd_CrearProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jtxt_correoelectronicoproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_CrearProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addComponent(jtxt_paisproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_CrearProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_numerotelefonoproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addGap(31, 31, 31)
                .addComponent(jbt_insertarproveedor)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel54.setText("Vehículo");

        jLabel19.setText("VIN");

        jLabel55.setText("Correo de Concesionario");

        jLabel56.setText("Código Marca");

        jLabel57.setText("Planta de Fabricación");

        jbt_insertarvehiculo.setText("Insertar");
        jbt_insertarvehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_insertarvehiculoActionPerformed(evt);
            }
        });

        jbt_generarvincode.setText("Generar VIN Code");
        jbt_generarvincode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_generarvincodeActionPerformed(evt);
            }
        });

        jLabel58.setText("Numeración");

        jLabel59.setText("Codigo Modelo");

        jLabel97.setText("Estado");

        javax.swing.GroupLayout jd_CrearVehiculoLayout = new javax.swing.GroupLayout(jd_CrearVehiculo.getContentPane());
        jd_CrearVehiculo.getContentPane().setLayout(jd_CrearVehiculoLayout);
        jd_CrearVehiculoLayout.setHorizontalGroup(
            jd_CrearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearVehiculoLayout.createSequentialGroup()
                .addGroup(jd_CrearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CrearVehiculoLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel54))
                    .addGroup(jd_CrearVehiculoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jd_CrearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_CrearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jd_CrearVehiculoLayout.createSequentialGroup()
                                    .addComponent(jLabel55)
                                    .addGap(18, 18, 18)
                                    .addComponent(jcbx_correoconcesionariovehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jd_CrearVehiculoLayout.createSequentialGroup()
                                    .addGroup(jd_CrearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel57)
                                        .addComponent(jLabel56)
                                        .addComponent(jLabel58)
                                        .addComponent(jLabel59)
                                        .addComponent(jLabel97))
                                    .addGap(18, 18, 18)
                                    .addGroup(jd_CrearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxt_numeracion)
                                        .addComponent(jcbx_codigomarcavehiculo, 0, 184, Short.MAX_VALUE)
                                        .addComponent(jcbx_plantadefabricacionvehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcbx_modelovehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxt_estadovehiculo))))
                            .addGroup(jd_CrearVehiculoLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(jtxt_VIN, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jd_CrearVehiculoLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jbt_insertarvehiculo)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_CrearVehiculoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbt_generarvincode)
                .addGap(125, 125, 125))
        );
        jd_CrearVehiculoLayout.setVerticalGroup(
            jd_CrearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearVehiculoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel54)
                .addGap(18, 18, 18)
                .addGroup(jd_CrearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jcbx_correoconcesionariovehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jcbx_codigomarcavehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jd_CrearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jcbx_modelovehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_CrearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57)
                    .addComponent(jcbx_plantadefabricacionvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jd_CrearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CrearVehiculoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel58))
                    .addGroup(jd_CrearVehiculoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtxt_numeracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97)
                    .addComponent(jtxt_estadovehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jbt_generarvincode)
                .addGap(18, 18, 18)
                .addGroup(jd_CrearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_VIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(28, 28, 28)
                .addComponent(jbt_insertarvehiculo)
                .addGap(39, 39, 39))
        );

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel60.setText("Planta de Fabricación");

        jLabel61.setText("ID planta");

        jLabel62.setText("Ubicación");

        jLabel63.setText("Nombre");

        jLabel64.setText("Tipo");

        jbt_ingresarplantadefabricacion.setText("Ingresar");
        jbt_ingresarplantadefabricacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_ingresarplantadefabricacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_CrearPlantaLayout = new javax.swing.GroupLayout(jd_CrearPlanta.getContentPane());
        jd_CrearPlanta.getContentPane().setLayout(jd_CrearPlantaLayout);
        jd_CrearPlantaLayout.setHorizontalGroup(
            jd_CrearPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearPlantaLayout.createSequentialGroup()
                .addGroup(jd_CrearPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CrearPlantaLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel60))
                    .addGroup(jd_CrearPlantaLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jd_CrearPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel62)
                            .addComponent(jLabel61)
                            .addComponent(jLabel63)
                            .addComponent(jLabel64))
                        .addGap(18, 18, 18)
                        .addGroup(jd_CrearPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxt_idplantafabricacion)
                            .addComponent(jtxt_ubicacionplanta)
                            .addComponent(jtxt_nombreplanta)
                            .addComponent(jtxt_tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                    .addGroup(jd_CrearPlantaLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jbt_ingresarplantadefabricacion)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jd_CrearPlantaLayout.setVerticalGroup(
            jd_CrearPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearPlantaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel60)
                .addGap(41, 41, 41)
                .addGroup(jd_CrearPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jtxt_idplantafabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jtxt_ubicacionplanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_CrearPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jtxt_nombreplanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jtxt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jbt_ingresarplantadefabricacion)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jd_ventanaCRUD.setResizable(false);
        jd_ventanaCRUD.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, 80));

        jLabel34.setBackground(new java.awt.Color(51, 51, 51));
        jLabel34.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("Seleccione la entidad que desea aplicarle lo antes seleccionado:");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jB_anteriorProveedoresClientes1.setBackground(new java.awt.Color(153, 153, 153));
        jB_anteriorProveedoresClientes1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jB_anteriorProveedoresClientes1.setBorderPainted(false);
        jPanel4.add(jB_anteriorProveedoresClientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel40.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setText("Marca");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        jLabel42.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 51, 51));
        jLabel42.setText("Vehiculo");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        jB_ejecutarCRUD.setText("Ejecutar");
        jB_ejecutarCRUD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_ejecutarCRUDMouseClicked(evt);
            }
        });
        jB_ejecutarCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ejecutarCRUDActionPerformed(evt);
            }
        });
        jPanel4.add(jB_ejecutarCRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 650, 114, 51));

        btg_entidades.add(jRB_pieza);
        jPanel4.add(jRB_pieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, -1, -1));
        jPanel4.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, -1, -1));

        jLabel72.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(51, 51, 51));
        jLabel72.setText("Pieza");
        jPanel4.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, -1, -1));
        jPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 140));

        jLabel38.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("Modificar");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        jRB_modificar.setBackground(new java.awt.Color(51, 255, 102));
        btg_operaciones.add(jRB_modificar);
        jPanel4.add(jRB_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 30, -1));

        jLabel36.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 51));
        jLabel36.setText("Eliminar");
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        jLabel27.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Proveedor");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        btg_entidades.add(jRB_proveedor);
        jPanel4.add(jRB_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, -1, -1));

        btg_entidades.add(jRB_marca);
        jPanel4.add(jRB_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        btg_entidades.add(jRB_vehiculo);
        jPanel4.add(jRB_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, -1, -1));

        jLabel26.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Planta");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, -1, -1));

        btg_entidades.add(jRB_plantaFabricacion);
        jPanel4.add(jRB_plantaFabricacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, -1, -1));

        jLabel31.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setText("Consecionario");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, 20));

        btg_entidades.add(jRB_consecionario);
        jPanel4.add(jRB_consecionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, -1, -1));

        btg_entidades.add(jRB_modelo);
        jPanel4.add(jRB_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, -1, -1));

        jLabel29.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Modelo");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, -1, -1));

        jLabel32.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setText("Cliente");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, -1));

        btg_entidades.add(jRB_cliente);
        jRB_cliente.setToolTipText("");
        jPanel4.add(jRB_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        btg_entidades.add(jRB_venta);
        jRB_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_ventaActionPerformed(evt);
            }
        });
        jPanel4.add(jRB_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 700, -1, -1));

        jLabel90.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel90.setText("Registro en Bitácora");
        jPanel4.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, -1, -1));

        jLabel33.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("Crear");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jRB_crear.setBackground(new java.awt.Color(51, 255, 102));
        btg_operaciones.add(jRB_crear);
        jPanel4.add(jRB_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 30, -1));

        btg_operaciones.add(jRB_eliminar);
        jPanel4.add(jRB_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 30, -1));

        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/Crear.png"))); // NOI18N
        jPanel4.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/Modificar.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel4.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 140, 120));

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/Delete.png"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel4.add(panelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 120, 130));

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/brand.png"))); // NOI18N

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel4.add(panelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 60, 40));

        panelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/Cliente.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage4Layout = new javax.swing.GroupLayout(panelImage4);
        panelImage4.setLayout(panelImage4Layout);
        panelImage4Layout.setHorizontalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        panelImage4Layout.setVerticalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel4.add(panelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 60, 50));

        panelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/proveedores.png"))); // NOI18N

        javax.swing.GroupLayout panelImage5Layout = new javax.swing.GroupLayout(panelImage5);
        panelImage5.setLayout(panelImage5Layout);
        panelImage5Layout.setHorizontalGroup(
            panelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        panelImage5Layout.setVerticalGroup(
            panelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel4.add(panelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 60, 60));

        panelImage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/Concesionario.png"))); // NOI18N

        javax.swing.GroupLayout panelImage6Layout = new javax.swing.GroupLayout(panelImage6);
        panelImage6.setLayout(panelImage6Layout);
        panelImage6Layout.setHorizontalGroup(
            panelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        panelImage6Layout.setVerticalGroup(
            panelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel4.add(panelImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 60, 60));

        panelImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/Parts.png"))); // NOI18N

        javax.swing.GroupLayout panelImage7Layout = new javax.swing.GroupLayout(panelImage7);
        panelImage7.setLayout(panelImage7Layout);
        panelImage7Layout.setHorizontalGroup(
            panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        panelImage7Layout.setVerticalGroup(
            panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel4.add(panelImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 70, 60));

        panelImage8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/Car_1.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage8Layout = new javax.swing.GroupLayout(panelImage8);
        panelImage8.setLayout(panelImage8Layout);
        panelImage8Layout.setHorizontalGroup(
            panelImage8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        panelImage8Layout.setVerticalGroup(
            panelImage8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel4.add(panelImage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 70, 50));

        panelImage9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/modelo.png"))); // NOI18N

        javax.swing.GroupLayout panelImage9Layout = new javax.swing.GroupLayout(panelImage9);
        panelImage9.setLayout(panelImage9Layout);
        panelImage9Layout.setHorizontalGroup(
            panelImage9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        panelImage9Layout.setVerticalGroup(
            panelImage9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel4.add(panelImage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 70, 70));

        panelImage10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/planta de fabricacion.png"))); // NOI18N

        javax.swing.GroupLayout panelImage10Layout = new javax.swing.GroupLayout(panelImage10);
        panelImage10.setLayout(panelImage10Layout);
        panelImage10Layout.setHorizontalGroup(
            panelImage10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        panelImage10Layout.setVerticalGroup(
            panelImage10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel4.add(panelImage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 60, 60));

        panelImage11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/bitacora.png"))); // NOI18N

        javax.swing.GroupLayout panelImage11Layout = new javax.swing.GroupLayout(panelImage11);
        panelImage11.setLayout(panelImage11Layout);
        panelImage11Layout.setHorizontalGroup(
            panelImage11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        panelImage11Layout.setVerticalGroup(
            panelImage11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel4.add(panelImage11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, 60, 50));

        panelImage14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/WhatsApp Image 2020-07-06 at 12.36.44 AM.jpeg"))); // NOI18N

        jLabel39.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 51));
        jLabel39.setText("Seleccione lo que desea realizar:");

        javax.swing.GroupLayout panelImage14Layout = new javax.swing.GroupLayout(panelImage14);
        panelImage14.setLayout(panelImage14Layout);
        panelImage14Layout.setHorizontalGroup(
            panelImage14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel39)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        panelImage14Layout.setVerticalGroup(
            panelImage14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage14Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel39)
                .addContainerGap(631, Short.MAX_VALUE))
        );

        jPanel4.add(panelImage14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 560, 680));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 560, 730));

        jd_ventanaCRUD.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, -1));

        jd_crearventa.setResizable(false);

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel17.add(jcbx_correoconcesionarioventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 180, -1));
        jPanel17.add(jcbx_idclienteventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 180, -1));

        jB_crearVenta.setText("Crear");
        jB_crearVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_crearVentaMouseClicked(evt);
            }
        });
        jB_crearVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_crearVentaActionPerformed(evt);
            }
        });
        jPanel17.add(jB_crearVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel86.setText("Crear registro de venta");
        jPanel17.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));
        jPanel17.add(jcbx_vinvehiculoventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 180, -1));

        jLabel87.setText("Fecha de la compra ");
        jPanel17.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabel111.setText("IdCliente");
        jPanel17.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel89.setText("Vin Vehiculo");
        jPanel17.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        jLabel85.setText("Correo Concesionario");
        jPanel17.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel95.setText("Id Venta");
        jPanel17.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));
        jPanel17.add(jtxt_idventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 180, -1));

        jLabel96.setText("Monto Venta");
        jPanel17.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));
        jPanel17.add(jtxt_cantidadventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 180, -1));

        date_fechaventa.setDateFormatString("YYYY-MM-dd");
        jPanel17.add(date_fechaventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 180, -1));

        jLabel116.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel116.setText("BITÁCORA");
        jPanel17.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jt_bitacora.setModel(new DefaultTableModel());
        jScrollPane1.setViewportView(jt_bitacora);

        jPanel17.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 550, 460));

        javax.swing.GroupLayout jd_crearventaLayout = new javax.swing.GroupLayout(jd_crearventa.getContentPane());
        jd_crearventa.getContentPane().setLayout(jd_crearventaLayout);
        jd_crearventaLayout.setHorizontalGroup(
            jd_crearventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearventaLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel84)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_crearventaLayout.setVerticalGroup(
            jd_crearventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearventaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel84)
                .addContainerGap(512, Short.MAX_VALUE))
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel73.setText("Modificar Cliente");

        jLabel74.setText("Id Cliente");

        jtxt_modificarnombrecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_modificarnombreclienteActionPerformed(evt);
            }
        });

        jLabel75.setText("Nombre");

        jLabel76.setText("Tipo");

        Btg_tipo.add(rb_sexoM1);
        rb_sexoM1.setSelected(true);
        rb_sexoM1.setText("M");

        Btg_tipo.add(rb_sexoF1);
        rb_sexoF1.setText("F");

        jLabel77.setText("Teléfono");

        jtxt_modificardireccioncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_modificardireccionclienteActionPerformed(evt);
            }
        });

        jLabel78.setText("Dirección");

        jLabel79.setText("Concesionario Correo");

        jbt_modificarrcliente.setText("Guardar");
        jbt_modificarrcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_modificarrclienteActionPerformed(evt);
            }
        });

        Btg_tipo.add(rb_Empresa);
        rb_Empresa.setText("Empresa");
        rb_Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_EmpresaActionPerformed(evt);
            }
        });

        jLabel81.setText("Persona");

        javax.swing.GroupLayout jd_modificarClienteLayout = new javax.swing.GroupLayout(jd_modificarCliente.getContentPane());
        jd_modificarCliente.getContentPane().setLayout(jd_modificarClienteLayout);
        jd_modificarClienteLayout.setHorizontalGroup(
            jd_modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarClienteLayout.createSequentialGroup()
                .addGroup(jd_modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificarClienteLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel73))
                    .addGroup(jd_modificarClienteLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jbt_modificarrcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_modificarClienteLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jd_modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel75)
                            .addComponent(jLabel74)
                            .addComponent(jLabel76)
                            .addComponent(jLabel77)
                            .addComponent(jLabel78)
                            .addComponent(jLabel79))
                        .addGap(18, 18, 18)
                        .addGroup(jd_modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_modificarClienteLayout.createSequentialGroup()
                                .addComponent(rb_sexoM1)
                                .addGap(47, 47, 47)
                                .addComponent(rb_Empresa))
                            .addGroup(jd_modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jcbx_idmodificarcliente, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxt_modificarnombrecliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcbx_idconcesionariomodificarcliente, javax.swing.GroupLayout.Alignment.LEADING, 0, 118, Short.MAX_VALUE)
                                .addComponent(rb_sexoF1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxt_modificardireccioncliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxt_modificartelefonocliente, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel81))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jd_modificarClienteLayout.setVerticalGroup(
            jd_modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarClienteLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel73)
                .addGap(43, 43, 43)
                .addGroup(jd_modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jcbx_idmodificarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_modificarnombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel81)
                .addGap(4, 4, 4)
                .addGroup(jd_modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificarClienteLayout.createSequentialGroup()
                        .addGroup(jd_modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel76)
                            .addComponent(rb_sexoM1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_sexoF1))
                    .addComponent(rb_Empresa))
                .addGap(18, 18, 18)
                .addGroup(jd_modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jtxt_modificartelefonocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78)
                    .addComponent(jtxt_modificardireccioncliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jcbx_idconcesionariomodificarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbt_modificarrcliente)
                .addGap(31, 31, 31))
        );

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel68.setText("Modificar Marca");

        jLabel69.setText("Código Marca");

        jLabel70.setText("Nombre");

        jbt_guardarrmarca.setText("Guardar");
        jbt_guardarrmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_guardarrmarcaActionPerformed(evt);
            }
        });

        jLabel80.setText("Ingrese el codigo de la marca a modificar");

        jcbx_codigomarcamodificarmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbx_codigomarcamodificarmarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_modificarmarcaLayout = new javax.swing.GroupLayout(jd_modificarmarca.getContentPane());
        jd_modificarmarca.getContentPane().setLayout(jd_modificarmarcaLayout);
        jd_modificarmarcaLayout.setHorizontalGroup(
            jd_modificarmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarmarcaLayout.createSequentialGroup()
                .addGroup(jd_modificarmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificarmarcaLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jd_modificarmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel70)
                            .addComponent(jLabel69))
                        .addGap(18, 35, Short.MAX_VALUE)
                        .addGroup(jd_modificarmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxt_modificarnombremarca)
                            .addComponent(jcbx_codigomarcamodificarmarca, 0, 137, Short.MAX_VALUE)))
                    .addGroup(jd_modificarmarcaLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jbt_guardarrmarca)))
                .addGap(108, 108, 108))
            .addGroup(jd_modificarmarcaLayout.createSequentialGroup()
                .addGroup(jd_modificarmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificarmarcaLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel68))
                    .addGroup(jd_modificarmarcaLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel80)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_modificarmarcaLayout.setVerticalGroup(
            jd_modificarmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarmarcaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel80)
                .addGap(35, 35, 35)
                .addGroup(jd_modificarmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(jcbx_codigomarcamodificarmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jd_modificarmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jtxt_modificarnombremarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jbt_guardarrmarca)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel83.setText("Codigo Marca");

        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jtxt_modificarnombremodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_modificarnombremodeloActionPerformed(evt);
            }
        });

        jLabel88.setText("Nombre");

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel91.setText("Modificar Modelo");

        jLabel92.setText("Id Modelo");

        jLabel93.setText("Motor");

        jLabel94.setText("Tipo");

        jcbx_idmodelomodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbx_idmodelomodificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_modificarmodeloLayout = new javax.swing.GroupLayout(jd_modificarmodelo.getContentPane());
        jd_modificarmodelo.getContentPane().setLayout(jd_modificarmodeloLayout);
        jd_modificarmodeloLayout.setHorizontalGroup(
            jd_modificarmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarmodeloLayout.createSequentialGroup()
                .addGroup(jd_modificarmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificarmodeloLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jd_modificarmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_modificarmodeloLayout.createSequentialGroup()
                                .addGroup(jd_modificarmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel83)
                                    .addComponent(jLabel92)
                                    .addComponent(jLabel93)
                                    .addComponent(jLabel94))
                                .addGroup(jd_modificarmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_modificarmodeloLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jd_modificarmodeloLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(jd_modificarmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtxt_modificarmotormodelo, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                            .addComponent(jtxt_modificarmodelotipo, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                            .addComponent(jcbx_idmodelomodificar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificarmodeloLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbx_codigomarcamodificarmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jd_modificarmodeloLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel88)
                                .addGap(18, 18, 18)
                                .addComponent(jtxt_modificarnombremodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jd_modificarmodeloLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel91)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jd_modificarmodeloLayout.setVerticalGroup(
            jd_modificarmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarmodeloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel91)
                .addGap(27, 27, 27)
                .addGroup(jd_modificarmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(jcbx_idmodelomodificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificarmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_modificarmotormodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93))
                .addGap(18, 18, 18)
                .addGroup(jd_modificarmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_modificarmodelotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel94))
                .addGap(18, 18, 18)
                .addGroup(jd_modificarmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_modificarnombremodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88))
                .addGap(29, 29, 29)
                .addGroup(jd_modificarmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbx_codigomarcamodificarmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel83))
                .addGap(34, 34, 34)
                .addComponent(jButton4)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel66.setText("Modifciar Concesionario");

        jLabel67.setText("Correo Electrónico");

        jLabel98.setText("Número de Teléfono");

        jbt_modificarconcesionario.setText("Modificar");
        jbt_modificarconcesionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_modificarconcesionarioActionPerformed(evt);
            }
        });

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel99.setText("Agregar Países y Ciudades de Concesionario");

        jLabel100.setText("País");

        jLabel101.setText("Ciudad");

        jbt_agregarpaisconcesionario1.setText("Agregar");
        jbt_agregarpaisconcesionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_agregarpaisconcesionario1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_modificarconcesionarioLayout = new javax.swing.GroupLayout(jd_modificarconcesionario.getContentPane());
        jd_modificarconcesionario.getContentPane().setLayout(jd_modificarconcesionarioLayout);
        jd_modificarconcesionarioLayout.setHorizontalGroup(
            jd_modificarconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificarconcesionarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel66)
                .addGap(98, 98, 98))
            .addGroup(jd_modificarconcesionarioLayout.createSequentialGroup()
                .addGroup(jd_modificarconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificarconcesionarioLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jd_modificarconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel99)
                            .addGroup(jd_modificarconcesionarioLayout.createSequentialGroup()
                                .addGroup(jd_modificarconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel101)
                                    .addComponent(jLabel100))
                                .addGap(34, 34, 34)
                                .addGroup(jd_modificarconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxt_paisconcesionario1)
                                    .addComponent(jtxt_ciudadpais1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(jbt_agregarpaisconcesionario1))))
                    .addGroup(jd_modificarconcesionarioLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jd_modificarconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel98)
                            .addComponent(jLabel67))
                        .addGap(18, 18, 18)
                        .addGroup(jd_modificarconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbx_correoelectronicoconcesionario_modificar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxt_modificarnumerotelefonoconcesionario, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbt_modificarconcesionario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_modificarconcesionarioLayout.setVerticalGroup(
            jd_modificarconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarconcesionarioLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_modificarconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jcbx_correoelectronicoconcesionario_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jd_modificarconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_modificarconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxt_modificarnumerotelefonoconcesionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbt_modificarconcesionario))
                    .addComponent(jLabel98))
                .addGap(109, 109, 109)
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jd_modificarconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificarconcesionarioLayout.createSequentialGroup()
                        .addGroup(jd_modificarconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxt_paisconcesionario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel100))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_modificarconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel101)
                            .addComponent(jtxt_ciudadpais1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificarconcesionarioLayout.createSequentialGroup()
                        .addComponent(jbt_agregarpaisconcesionario1)
                        .addGap(15, 15, 15)))
                .addGap(117, 117, 117))
        );

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel102.setText("Modificar Planta de Fabricación");

        jLabel103.setText("ID planta");

        jLabel104.setText("Ubicación");

        jLabel105.setText("Nombre");

        jLabel106.setText("Tipo");

        jbt_mdificarplantadefabricacion.setText("Guardar");
        jbt_mdificarplantadefabricacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_mdificarplantadefabricacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_modificarplantaLayout = new javax.swing.GroupLayout(jd_modificarplanta.getContentPane());
        jd_modificarplanta.getContentPane().setLayout(jd_modificarplantaLayout);
        jd_modificarplantaLayout.setHorizontalGroup(
            jd_modificarplantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarplantaLayout.createSequentialGroup()
                .addGroup(jd_modificarplantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificarplantaLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jd_modificarplantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel104)
                            .addComponent(jLabel103)
                            .addComponent(jLabel105)
                            .addComponent(jLabel106))
                        .addGap(18, 18, 18)
                        .addGroup(jd_modificarplantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxt_modificarubicacionplanta)
                            .addComponent(jtxt_modificarnombreplanta)
                            .addComponent(jtxt_modificartipoplanta, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jcbx_modificarplantaid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jd_modificarplantaLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jbt_mdificarplantadefabricacion)))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificarplantaLayout.createSequentialGroup()
                .addGap(0, 70, Short.MAX_VALUE)
                .addComponent(jLabel102)
                .addGap(63, 63, 63))
        );
        jd_modificarplantaLayout.setVerticalGroup(
            jd_modificarplantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarplantaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel102)
                .addGap(42, 42, 42)
                .addGroup(jd_modificarplantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(jcbx_modificarplantaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificarplantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(jtxt_modificarubicacionplanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_modificarplantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105)
                    .addComponent(jtxt_modificarnombreplanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificarplantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(jtxt_modificartipoplanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jbt_mdificarplantadefabricacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jb_guardarventa.setText("Guardar");
        jb_guardarventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarventaMouseClicked(evt);
            }
        });
        jb_guardarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarventaActionPerformed(evt);
            }
        });

        date_modificarfechaventa.setDateFormatString("YYYY-MM-dd");

        jLabel108.setText("Fecha de la compra ");

        jLabel112.setText("IdCliente");

        jLabel113.setText("Monto Venta");

        jLabel114.setText("Id Venta");

        jLabel115.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel115.setText("Modificar Venta");

        javax.swing.GroupLayout jd_modificarventaLayout = new javax.swing.GroupLayout(jd_modificarventa.getContentPane());
        jd_modificarventa.getContentPane().setLayout(jd_modificarventaLayout);
        jd_modificarventaLayout.setHorizontalGroup(
            jd_modificarventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarventaLayout.createSequentialGroup()
                .addGroup(jd_modificarventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificarventaLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jd_modificarventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jd_modificarventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel108)
                                .addComponent(jLabel113, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel112)
                            .addComponent(jLabel114))
                        .addGap(38, 38, 38)
                        .addGroup(jd_modificarventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(date_modificarfechaventa, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jtxt_modificarcantidadventa)
                            .addComponent(jcbx_modificaridclienteventa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbx_modificaridventa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jd_modificarventaLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel115))
                    .addGroup(jd_modificarventaLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jb_guardarventa)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jd_modificarventaLayout.setVerticalGroup(
            jd_modificarventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarventaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel115)
                .addGap(66, 66, 66)
                .addGroup(jd_modificarventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel114)
                    .addComponent(jcbx_modificaridventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jd_modificarventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbx_modificaridclienteventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel112))
                .addGap(18, 18, 18)
                .addGroup(jd_modificarventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel108, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date_modificarfechaventa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jd_modificarventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(jtxt_modificarcantidadventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(jb_guardarventa)
                .addGap(69, 69, 69))
        );

        jLabel117.setFont(new java.awt.Font("BankGothic Md BT", 1, 36)); // NOI18N
        jLabel117.setText("REPORTES");

        jb_tendenciaxano.setText("Ver vista");
        jb_tendenciaxano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_tendenciaxanoActionPerformed(evt);
            }
        });

        jb_tendenciaxsemana.setText("Ver vista");
        jb_tendenciaxsemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_tendenciaxsemanaActionPerformed(evt);
            }
        });

        jb_mayorescantidades.setText("Ver vista");
        jb_mayorescantidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mayorescantidadesActionPerformed(evt);
            }
        });

        jb_mayor_rotacion.setText("Ver vista");
        jb_mayor_rotacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mayor_rotacionActionPerformed(evt);
            }
        });

        jb_tendenciaxmes.setText("Ver vista");
        jb_tendenciaxmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_tendenciaxmesActionPerformed(evt);
            }
        });

        jb_mejoresmontos.setText("Ver vista");
        jb_mejoresmontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mejoresmontosActionPerformed(evt);
            }
        });

        jb_mejoresmeses.setText("Ver vista");
        jb_mejoresmeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mejoresmesesActionPerformed(evt);
            }
        });

        jButton10.setText("Ver vista");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel118.setFont(new java.awt.Font("Sylfaen", 0, 11)); // NOI18N
        jLabel118.setText("Tendecias de Ventas (AÑO)");

        jLabel119.setFont(new java.awt.Font("Sylfaen", 0, 11)); // NOI18N
        jLabel119.setText("Tendecias de Ventas (MES)");

        jLabel120.setFont(new java.awt.Font("Sylfaen", 0, 11)); // NOI18N
        jLabel120.setText("Mejores montos de venta y marcas");

        jLabel121.setFont(new java.awt.Font("Sylfaen", 0, 11)); // NOI18N
        jLabel121.setText("Tendecias de Ventas (SEMANA)");

        jLabel122.setFont(new java.awt.Font("Sylfaen", 0, 11)); // NOI18N
        jLabel122.setText("Mejores meses para Pick Ups");

        jLabel123.setFont(new java.awt.Font("Sylfaen", 0, 11)); // NOI18N
        jLabel123.setText("Mayores cantidades de venta y marcas");

        jLabel124.setFont(new java.awt.Font("Sylfaen", 0, 11)); // NOI18N
        jLabel124.setText("Distribuidores con rotación mas alta");

        jLabel125.setFont(new java.awt.Font("Sylfaen", 0, 11)); // NOI18N
        jLabel125.setText("Distribuidores con rotación mas baja");

        javax.swing.GroupLayout jd_reportesLayout = new javax.swing.GroupLayout(jd_reportes.getContentPane());
        jd_reportes.getContentPane().setLayout(jd_reportesLayout);
        jd_reportesLayout.setHorizontalGroup(
            jd_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_reportesLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel117)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_reportesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jd_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jd_reportesLayout.createSequentialGroup()
                            .addComponent(jLabel124)
                            .addGap(58, 58, 58)
                            .addComponent(jLabel125)
                            .addContainerGap())
                        .addComponent(jLabel123, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jd_reportesLayout.createSequentialGroup()
                        .addGroup(jd_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_reportesLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jd_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb_tendenciaxsemana)
                                    .addComponent(jb_tendenciaxano)
                                    .addComponent(jb_mayorescantidades)
                                    .addComponent(jb_mayor_rotacion)))
                            .addGroup(jd_reportesLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel121))
                            .addGroup(jd_reportesLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel118)))
                        .addGroup(jd_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_reportesLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jb_tendenciaxmes)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_reportesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jd_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel120)
                                    .addGroup(jd_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_reportesLayout.createSequentialGroup()
                                            .addComponent(jLabel122)
                                            .addGap(38, 38, 38))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_reportesLayout.createSequentialGroup()
                                            .addComponent(jb_mejoresmeses)
                                            .addGap(68, 68, 68))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_reportesLayout.createSequentialGroup()
                                            .addComponent(jButton10)
                                            .addGap(66, 66, 66))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_reportesLayout.createSequentialGroup()
                                            .addComponent(jb_mejoresmontos)
                                            .addGap(67, 67, 67))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_reportesLayout.createSequentialGroup()
                                            .addComponent(jLabel119)
                                            .addGap(50, 50, 50)))))))))
        );
        jd_reportesLayout.setVerticalGroup(
            jd_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_reportesLayout.createSequentialGroup()
                .addComponent(jLabel117)
                .addGap(44, 44, 44)
                .addGroup(jd_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_reportesLayout.createSequentialGroup()
                        .addComponent(jLabel118)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_tendenciaxano)
                        .addGroup(jd_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_reportesLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel121))
                            .addGroup(jd_reportesLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jb_tendenciaxsemana)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_reportesLayout.createSequentialGroup()
                        .addComponent(jLabel119)
                        .addGap(18, 18, 18)
                        .addComponent(jb_tendenciaxmes)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel120)
                        .addGap(18, 18, 18)
                        .addComponent(jb_mejoresmontos)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel122)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jd_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_mayorescantidades)
                    .addComponent(jb_mejoresmeses))
                .addGap(25, 25, 25)
                .addGroup(jd_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124)
                    .addComponent(jLabel125))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_mayor_rotacion)
                    .addComponent(jButton10))
                .addGap(62, 62, 62))
        );

        jt_eliminarventa.setModel(new DefaultTableModel());
        jScrollPane4.setViewportView(jt_eliminarventa);

        jLabel110.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel110.setText("Eliminar Venta");

        jLabel126.setText("ID Venta");

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_eliminarventaLayout = new javax.swing.GroupLayout(jd_eliminarventa.getContentPane());
        jd_eliminarventa.getContentPane().setLayout(jd_eliminarventaLayout);
        jd_eliminarventaLayout.setHorizontalGroup(
            jd_eliminarventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarventaLayout.createSequentialGroup()
                .addGroup(jd_eliminarventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_eliminarventaLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel126)
                        .addGap(45, 45, 45)
                        .addComponent(jcbx_eliminaridventa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_eliminarventaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_eliminarventaLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_eliminarventaLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel110)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_eliminarventaLayout.setVerticalGroup(
            jd_eliminarventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarventaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel110)
                .addGap(41, 41, 41)
                .addGroup(jd_eliminarventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel126)
                    .addComponent(jcbx_eliminaridventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jd_inventario.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jt_concesionarionventario.setModel(new DefaultTableModel());
        jScrollPane6.setViewportView(jt_concesionarionventario);

        jd_inventario.getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 650, 260));

        jd_inventario.getContentPane().add(jcbx_concesionarioinventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 230, -1));

        jLabel131.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel131.setText("Lista de Concesionarios");
        jd_inventario.getContentPane().add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 210, 30));

        jbt_buscarconcesionarioinventario.setText("Buscar");
        jbt_buscarconcesionarioinventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_buscarconcesionarioinventarioActionPerformed(evt);
            }
        });
        jd_inventario.getContentPane().add(jbt_buscarconcesionarioinventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 130, -1));

        jLabel133.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel133.setText("Concesionario");
        jd_inventario.getContentPane().add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 100, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtp_main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtp_mainMouseClicked(evt);
            }
        });

        Cliente_JP.setEnabled(false);
        Cliente_JP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cliente_JPMouseClicked(evt);
            }
        });

        panelImage12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/VCliente.jpeg"))); // NOI18N

        jcb_clientemarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_clientemarcaActionPerformed(evt);
            }
        });

        jb_localizar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jb_localizar.setText("LOCALIZAR");
        jb_localizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_localizarActionPerformed(evt);
            }
        });

        jt_clientes.setModel(new DefaultTableModel());
        jScrollPane2.setViewportView(jt_clientes);

        jLabel109.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel109.setText("¡LOCALIZA TU VEHICULO!");

        javax.swing.GroupLayout panelImage12Layout = new javax.swing.GroupLayout(panelImage12);
        panelImage12.setLayout(panelImage12Layout);
        panelImage12Layout.setHorizontalGroup(
            panelImage12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel109)
                .addGap(339, 339, 339))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage12Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(panelImage12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage12Layout.createSequentialGroup()
                        .addGroup(panelImage12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jb_localizar)
                            .addComponent(jcb_clientemarca, 0, 123, Short.MAX_VALUE)
                            .addComponent(jcb_clientecolor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcb_ubicacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage12Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        panelImage12Layout.setVerticalGroup(
            panelImage12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jcb_clientemarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcb_clientecolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcb_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jb_localizar)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout Cliente_JPLayout = new javax.swing.GroupLayout(Cliente_JP);
        Cliente_JP.setLayout(Cliente_JPLayout);
        Cliente_JPLayout.setHorizontalGroup(
            Cliente_JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Cliente_JPLayout.setVerticalGroup(
            Cliente_JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jtp_main.addTab("Cliente", Cliente_JP);

        Informes_Ventas_JP.setEnabled(false);

        panelImage16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/Reportes de Ventas.jpeg"))); // NOI18N

        jt_informe.setModel(new DefaultTableModel());
        jScrollPane3.setViewportView(jt_informe);

        jb_informe.setText("Ver Informe de Ventas");
        jb_informe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_informeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImage16Layout = new javax.swing.GroupLayout(panelImage16);
        panelImage16.setLayout(panelImage16Layout);
        panelImage16Layout.setHorizontalGroup(
            panelImage16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage16Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(panelImage16Layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jb_informe, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelImage16Layout.setVerticalGroup(
            panelImage16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage16Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_informe)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Informes_Ventas_JPLayout = new javax.swing.GroupLayout(Informes_Ventas_JP);
        Informes_Ventas_JP.setLayout(Informes_Ventas_JPLayout);
        Informes_Ventas_JPLayout.setHorizontalGroup(
            Informes_Ventas_JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Informes_Ventas_JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImage16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Informes_Ventas_JPLayout.setVerticalGroup(
            Informes_Ventas_JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jtp_main.addTab("Informes de Ventas", Informes_Ventas_JP);

        admin_JP.setBackground(new java.awt.Color(255, 255, 255));
        admin_JP.setEnabled(false);
        admin_JP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_JPMouseClicked(evt);
            }
        });
        admin_JP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/Ventana admin.jpeg"))); // NOI18N

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/67360-200.png"))); // NOI18N
        jToggleButton2.setText("REPORTES");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(153, 153, 153));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/unnamed.png"))); // NOI18N
        jToggleButton1.setText("CRUD");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/2897616.png"))); // NOI18N
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jLabel130.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel130.setText("REPORTES");

        jLabel128.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel128.setText("INVENTARIO");

        jLabel129.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel129.setText("CRUD");

        javax.swing.GroupLayout panelImage13Layout = new javax.swing.GroupLayout(panelImage13);
        panelImage13.setLayout(panelImage13Layout);
        panelImage13Layout.setHorizontalGroup(
            panelImage13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage13Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(panelImage13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelImage13Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel129)))
                .addGroup(panelImage13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage13Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel130)
                        .addGap(147, 147, 147)))
                .addGroup(panelImage13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage13Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel128)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage13Layout.createSequentialGroup()
                        .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );
        panelImage13Layout.setVerticalGroup(
            panelImage13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage13Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(panelImage13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage13Layout.createSequentialGroup()
                        .addComponent(jLabel128)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelImage13Layout.createSequentialGroup()
                        .addComponent(jLabel130)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton2))
                    .addGroup(panelImage13Layout.createSequentialGroup()
                        .addComponent(jLabel129)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        admin_JP.add(panelImage13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 530));

        jtp_main.addTab("Administrador", admin_JP);

        Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarMouseClicked(evt);
            }
        });

        panelImage15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectocardealership_bases1/gt40mkii01.jpg"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("LOGIN");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("USUARIO");

        jtxt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_usuarioActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Contraseña");

        jrb_cliente.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrb_cliente);
        jrb_cliente.setSelected(true);
        jrb_cliente.setText("Cliente");
        jrb_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_clienteActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrb_conse);
        jrb_conse.setText("Consecionario");

        buttonGroup1.add(jrb_market);
        jrb_market.setText("Dpt Marketing");

        buttonGroup1.add(jrb_admin);
        jrb_admin.setText("Admin");

        jbt_login.setText("Ingresar");
        jbt_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbt_loginMouseClicked(evt);
            }
        });
        jbt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImage15Layout = new javax.swing.GroupLayout(panelImage15);
        panelImage15.setLayout(panelImage15Layout);
        panelImage15Layout.setHorizontalGroup(
            panelImage15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelImage15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelImage15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jrb_cliente)
                        .addComponent(jrb_conse)
                        .addComponent(jrb_market)
                        .addComponent(jrb_admin))
                    .addGroup(panelImage15Layout.createSequentialGroup()
                        .addComponent(jbt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(141, 141, 141)
                .addComponent(panelImageReflect1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
            .addGroup(panelImage15Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addGroup(panelImage15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage15Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelImage15Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpf_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelImage15Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel15)))
                .addContainerGap(334, Short.MAX_VALUE))
        );
        panelImage15Layout.setVerticalGroup(
            panelImage15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage15Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel15)
                .addGap(33, 33, 33)
                .addGroup(panelImage15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelImage15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelImage15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jpf_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(29, 29, 29)
                        .addComponent(jrb_cliente)
                        .addGap(5, 5, 5)
                        .addComponent(jrb_conse)
                        .addGap(5, 5, 5)
                        .addComponent(jrb_market)
                        .addGap(5, 5, 5)
                        .addComponent(jrb_admin)
                        .addGap(30, 30, 30)
                        .addComponent(jbt_login)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                        .addComponent(panelImageReflect1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
        );

        javax.swing.GroupLayout IngresarLayout = new javax.swing.GroupLayout(Ingresar);
        Ingresar.setLayout(IngresarLayout);
        IngresarLayout.setHorizontalGroup(
            IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        IngresarLayout.setVerticalGroup(
            IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jtp_main.addTab("Ingresar", Ingresar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtp_main)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jtp_main, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void jB_ejecutarCRUDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_ejecutarCRUDMouseClicked
        try {
            String sqlModelo = "select idModelo from Modelo";
            llenarComboBox(jcbx_modelovehiculo, sqlModelo);

        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }
        int hacer = Que_Quiere_Hacer();
        switch (hacer) {
            case 1: {
                try {

                    // System.out.println(jcbx_idconcesionario.getSelectedItem().toString());
                    CREAR();
                } catch (SQLException ex) {
                    Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 2: {
                try {
                    MODIFICAR();
                } catch (SQLException ex) {
                    Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            break;
            case 3: {
                try {
                    ELIMINAR();
                } catch (SQLException ex) {
                    Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            default:
                JOptionPane.showMessageDialog(this, "Seleccione que desea realizar");
                break;
        }

//        try {
//            llenarComboBox(jcbx_idconcesionario, sql);
//        } catch (SQLException ex) {
//            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }//GEN-LAST:event_jB_ejecutarCRUDMouseClicked

    private void jbt_crearmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_crearmarcaActionPerformed

        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO Marca (Codigo_marca, Nombre) VALUES (?, ?)");
            pst.setString(1, jtxt_codigomarca.getText());
            pst.setString(2, jtxt_nombremarca.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbt_crearmarcaActionPerformed

    private void jbt_crearconcesionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_crearconcesionarioActionPerformed
        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO Concesionario (Correo_electronico, Numero_telefono, Nombre) VALUES (?, ?, ?)");
            pst.setString(1, jtxt_correoconcesionario.getText());
            pst.setString(2, jtxt_numerotelefonoconcesionario.getText());
            pst.setString(3, jtxt_nombreconcesionario.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Datos guardados");
            jbt_agregarpaisconcesionario.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jbt_crearconcesionarioActionPerformed

    private void jbt_agregarpaisconcesionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_agregarpaisconcesionarioActionPerformed
        try {
            PreparedStatement pst2 = cn.prepareStatement("INSERT INTO Pais (pais_concesionario, Concesionario_Correo_electronico, ciudad) VALUES (?, ?, ?)");
            pst2.setString(1, jtxt_paisconcesionario.getText());
            pst2.setString(2, jtxt_correoconcesionario.getText());
            pst2.setString(3, jtxt_ciudadpais.getText());
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(this, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jbt_agregarpaisconcesionarioActionPerformed

    private void jtxt_idmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_idmodeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_idmodeloActionPerformed

    private void jbt_crearclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_crearclienteActionPerformed
        String persona = "";
        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO Cliente (Id_cliente, Nombre,Tipo,Telefono,Direccion, Concesionario_Correo_electronico) VALUES (?, ?, ?, ?, ?, ?)");
            pst.setString(1, jtxt_idcliente.getText());
            pst.setString(2, jtxt_nombrecliente.getText());
            if (rb_sexoM.isSelected()) {
                persona = "Persona " + rb_sexoM.getText();
                pst.setString(3, persona);
            } else if (rb_sexoF.isSelected()) {
                persona = "Persona " + rb_sexoF.getText();
                pst.setString(3, persona);
            } else if (rb_empresacliente.isSelected()) {
                pst.setString(3, rb_empresacliente.getText());
            }
            pst.setString(4, jtxt_telefonocliente.getText());
            pst.setString(5, jtxt_direccioncliente.getText());
            pst.setString(6, jcbx_idconcesionariocrearcliente.getSelectedItem().toString());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Datos guardados");
            jbt_agregarpaisconcesionario.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_jbt_crearclienteActionPerformed

    private void jB_ejecutarCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ejecutarCRUDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_ejecutarCRUDActionPerformed

    private void jbt_insertarproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_insertarproveedorActionPerformed

        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO Proveedor (Correo_electronico, Pais,Numero) VALUES (?, ?, ?)");
            pst.setString(1, jtxt_correoelectronicoproveedor.getText());
            pst.setString(2, jtxt_paisproveedor.getText());
            pst.setString(3, jtxt_numerotelefonoproveedor.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jbt_insertarproveedorActionPerformed

    private void jbt_ingresarplantadefabricacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_ingresarplantadefabricacionActionPerformed
        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO Planta_de_Fabricacion (idPlanta, Ubicacion, Nombre, Tipo) VALUES (?, ?, ?, ?)");
            pst.setString(1, jtxt_idplantafabricacion.getText());
            pst.setString(2, jtxt_ubicacionplanta.getText());
            pst.setString(3, jtxt_nombreplanta.getText());
            pst.setString(4, jtxt_tipo.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jbt_ingresarplantadefabricacionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO Modelo (idModelo, Motor, Tipo, Marca_Codigo_marca,Nombre) VALUES (?, ?, ?, ?, ?)");
            pst.setString(1, jtxt_idmodelo.getText());
            pst.setString(2, jtxt_motormodelo.getText());
            pst.setString(3, jtxt_modelotipo.getText());
            pst.setString(4, jcbx_codigomarcamodelo.getSelectedItem().toString());
            pst.setString(5, jtxt_nombremodelo.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Insertado correctamente, ingrese los valores posteriores");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jbt_agregarestiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_agregarestiloActionPerformed
        PreparedStatement pst3;
        try {
            pst3 = cn.prepareStatement("INSERT INTO Estilo (Nombre_estilo, Modelo_idModelo) VALUES (?, ?)");
            pst3.setString(1, jtxt_nombreestilo.getText());
            pst3.setString(2, jtxt_idmodelo.getText());
            pst3.executeUpdate();
            JOptionPane.showMessageDialog(this, "Datos guardados");

        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbt_agregarestiloActionPerformed

    private void jbt_agregartransmisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_agregartransmisionActionPerformed
        PreparedStatement pst4;
        try {
            pst4 = cn.prepareStatement("INSERT INTO Transmision (Transmision_modelo, Modelo_idModelo) VALUES (?, ?)");
            if (jrdb_manual.isSelected()) {
                pst4.setString(1, jrdb_manual.getText());
            } else {
                pst4.setString(1, jrdb_automatico.getText());
            }

            pst4.setString(2, jtxt_idmodelo.getText());
            pst4.executeUpdate();
            JOptionPane.showMessageDialog(this, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbt_agregartransmisionActionPerformed

    private void jbt_agregarcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_agregarcolorActionPerformed
        PreparedStatement pst2;
        try {
            pst2 = cn.prepareStatement("INSERT INTO Color (color_modelo, Modelo_idModelo) VALUES (?, ?)");
            pst2.setString(1, jtxt_nombrecolor.getText());
            pst2.setString(2, jtxt_idmodelo.getText());
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(this, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbt_agregarcolorActionPerformed

    private void jbt_guardarrmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_guardarrmarcaActionPerformed

        String modificacion_sql = "UPDATE Marca SET Nombre=? WHERE Codigo_marca=?";

        ResultSet rs = null;

        try {
            PreparedStatement pst = cn.prepareStatement(modificacion_sql);
            pst.setString(1, jtxt_modificarnombremarca.getText());
            pst.setString(2, jcbx_codigomarcamodificarmarca.getSelectedItem().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Modificaciònn exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbt_guardarrmarcaActionPerformed

    private void jbt_modificarrclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_modificarrclienteActionPerformed
        String modificacion_sql = "UPDATE Cliente SET Nombre=?,Tipo=?,Telefono=?,Direccion=?,Concesionario_Correo_electronico=? WHERE Id_cliente=?";

        ResultSet rs = null;

        try {
            PreparedStatement pst = cn.prepareStatement(modificacion_sql);
            pst.setString(1, jtxt_modificarnombrecliente.getText());
            if (rb_sexoM1.isSelected()) {
                pst.setString(2, rb_sexoM1.getText());
            } else if (rb_sexoF1.isSelected()) {
                pst.setString(2, rb_sexoF1.getText());
            } else {
                pst.setString(2, rb_Empresa.getText());
            }
            pst.setString(3, jtxt_modificartelefonocliente.getText());
            pst.setString(4, jtxt_modificardireccioncliente.getText());
            pst.setString(5, jcbx_idconcesionariomodificarcliente.getSelectedItem().toString());
            pst.setString(6, jcbx_idmodificarcliente.getSelectedItem().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Modificaciònn exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbt_modificarrclienteActionPerformed

    private void rb_EmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_EmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_EmpresaActionPerformed

    private void jtxt_modificarnombreclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_modificarnombreclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_modificarnombreclienteActionPerformed

    private void jtxt_modificardireccionclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_modificardireccionclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_modificardireccionclienteActionPerformed

    private void jtxt_nombremodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nombremodeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_nombremodeloActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String modificacion_sql = "UPDATE Modelo SET Motor=?,Tipo=?,Marca_Codigo_marca=?,Nombre=? WHERE idModelo=?";
        try {
            PreparedStatement pst = cn.prepareStatement(modificacion_sql);
            pst.setString(1, jtxt_modificarmotormodelo.getText());
            pst.setString(2, jtxt_modificarmodelotipo.getText());
            pst.setString(3, jcbx_codigomarcamodificarmodelo.getSelectedItem().toString());
            pst.setString(4, jtxt_modificarnombremodelo.getText());
            pst.setString(5, jcbx_idmodelomodificar.getSelectedItem().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Modificación exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtxt_modificarnombremodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_modificarnombremodeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_modificarnombremodeloActionPerformed

    private void jcbx_idmodelomodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbx_idmodelomodificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbx_idmodelomodificarActionPerformed

    private void jcbx_codigomarcamodificarmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbx_codigomarcamodificarmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbx_codigomarcamodificarmarcaActionPerformed

    private void jB_crearVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_crearVentaMouseClicked

        //mandar datos a la base
//        cn = db.getConnection();
//        CallableStatement cs = null;
//        String sql = "{CALL sp_insertarLe_Vende_A(?,?,?,?)}";
//        try {
//            cs = conn.prepareCall(sql);
//            cs.setString(1, rtnCon);
//            cs.setString(2, rtnCliente);
//            cs.setString(3, vinVehiculoVendido);
//            cs.setDate(4, fechaSql);
//            cs.execute();
//            cs.close();
//            conn.close();
//            JOptionPane.showMessageDialog(jD_crearCompania, "Se ha agregado a la DB con éxito", "Exito", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_jB_crearVentaMouseClicked

    private void jB_crearVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_crearVentaActionPerformed
        try {
            //        Date fechaVenta;
//        fechaVenta = (Date) date_fechaventa.getDate();
//        java.sql.Date fechaSql = new java.sql.Date(fechaVenta.getTime());
//        PreparedStatement pst;
            PreparedStatement pst2;
            CallableStatement stmt = (CallableStatement) cn.prepareCall("{call Crear_Venta (?,?,?,?,?,?)}");
            pst2 = cn.prepareStatement("UPDATE Vehiculo SET Estado=? WHERE VIN = ?");
            stmt.setString(1, jtxt_idventa.getText());
            stmt.setString(2, jtxt_cantidadventa.getText());
            stmt.setString(3, jcbx_correoconcesionarioventa.getSelectedItem().toString());
            stmt.setString(4, jcbx_idclienteventa.getSelectedItem().toString());
            stmt.setString(5, jcbx_vinvehiculoventa.getSelectedItem().toString());
            stmt.setString(6, ((JTextField) date_fechaventa.getDateEditor().getUiComponent()).getText());
            stmt.executeUpdate();
            pst2.setString(1, "Vendido");
            pst2.setString(2, jcbx_vinvehiculoventa.getSelectedItem().toString());
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(this, "Datos agregados");
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Venta");
            JTable bitacora = new JTable(buildTableModel(rs));
            DefaultTableModel modelobitacora = (DefaultTableModel) bitacora.getModel();
            jt_bitacora.setModel(modelobitacora);
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }
//        try {
//            pst = cn.prepareStatement("INSERT INTO Venta (idVenta, CantidadVenta, Correo_Concesionario, Id_Cliente, VIN, FechaCompra) VALUES (?, ?, ?, ?, ?, ?)");
//           
//            pst.setString(1, jtxt_idventa.getText());
//            pst.setString(2, jtxt_cantidadventa.getText());
//            pst.setString(3, jcbx_correoconcesionarioventa.getSelectedItem().toString());
//            pst.setString(4, jcbx_idclienteventa.getSelectedItem().toString());
//            pst.setString(5, jcbx_vinvehiculoventa.getSelectedItem().toString());
//            //  pst.setDate(6, fechaSql);
//            pst.setString(6, ((JTextField) date_fechaventa.getDateEditor().getUiComponent()).getText());
//            pst2.setString(1, "Vendido");
//            pst2.setString(2, jcbx_vinvehiculoventa.getSelectedItem().toString());
//            pst.executeUpdate();
//            pst2.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(this, ex.getMessage());
//        }

    }//GEN-LAST:event_jB_crearVentaActionPerformed

    private void jbt_insertarpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_insertarpiezaActionPerformed
        PreparedStatement pst;
        PreparedStatement pst2;
        try {
            pst = cn.prepareStatement("INSERT INTO Pieza (Nombre, Modelo_idModelo, PlantaFabricacion_idPlanta) VALUES (?, ?, ?)");
            pst2 = cn.prepareStatement("INSERT INTO Proveedor_has_Pieza (Proveedor_Correo_electronico, Pieza_Modelo_idModelo) VALUES (?, ?)");
            pst.setString(1, jtxt_nombrepieza.getText());
            pst.setString(2, jcbx_idmodelopieza.getSelectedItem().toString());
            pst.setString(3, jcbx_idplantadefabricacionpieza.getSelectedItem().toString());
            pst2.setString(1, jcbx_correoproveedorhaspieza.getSelectedItem().toString());
            pst2.setString(2, jcbx_idmodelopieza.getSelectedItem().toString());
            pst.executeUpdate();
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(this, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_jbt_insertarpiezaActionPerformed

    private void jbt_insertarvehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_insertarvehiculoActionPerformed
        PreparedStatement pst;
        try {
            pst = cn.prepareStatement("INSERT INTO Vehiculo (VIN, Concesionario_Correo_electronico, Marca_Codigo_marca, PlantaFabricacion_idPlanta, Estado) VALUES (?, ?, ?, ?, ?)");
            pst.setString(1, jtxt_VIN.getText());
            pst.setString(2, jcbx_correoconcesionariovehiculo.getSelectedItem().toString());
            pst.setString(3, jcbx_codigomarcavehiculo.getSelectedItem().toString());
            pst.setString(4, jcbx_plantadefabricacionvehiculo.getSelectedItem().toString());
            pst.setString(5, jtxt_estadovehiculo.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jbt_insertarvehiculoActionPerformed

    private void jbt_generarvincodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_generarvincodeActionPerformed
        String vincode = jcbx_codigomarcavehiculo.getSelectedItem().toString() + jcbx_modelovehiculo.getSelectedItem().toString() + jcbx_plantadefabricacionvehiculo.getSelectedItem().toString() + jtxt_numeracion.getText();
        jtxt_VIN.setText(vincode);
        jtxt_VIN.setEditable(false);
    }//GEN-LAST:event_jbt_generarvincodeActionPerformed

    private void jbt_modificarconcesionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_modificarconcesionarioActionPerformed
        String modificacion_sql = "UPDATE Concesionario SET Numero_telefono=? WHERE Correo_electronico=?";

        ResultSet rs = null;
        try {
            PreparedStatement pst = cn.prepareStatement(modificacion_sql);
            pst.setString(1, jtxt_modificarnumerotelefonoconcesionario.getText());
            pst.setString(2, jcbx_correoelectronicoconcesionario_modificar.getSelectedItem().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Modificación exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbt_modificarconcesionarioActionPerformed

    private void jbt_agregarpaisconcesionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_agregarpaisconcesionario1ActionPerformed
        try {
            PreparedStatement pst2 = cn.prepareStatement("INSERT INTO Pais (pais_concesionario, Concesionario_Correo_electronico, ciudad) VALUES (?, ?, ?)");
            pst2.setString(1, jtxt_paisconcesionario.getText());
            pst2.setString(2, jtxt_correoconcesionario.getText());
            pst2.setString(3, jtxt_ciudadpais.getText());
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(this, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jbt_agregarpaisconcesionario1ActionPerformed

    private void jRB_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB_ventaActionPerformed

    private void jbt_mdificarplantadefabricacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_mdificarplantadefabricacionActionPerformed
        String modificacion_sql = "UPDATE Planta_de_Fabricacion SET Ubicacion=?,Nombre=?,Tipo=? WHERE idPlanta=?";
        ResultSet rs = null;
        try {
            PreparedStatement pst = cn.prepareStatement(modificacion_sql);
            pst.setString(1, jtxt_modificarubicacionplanta.getText());
            pst.setString(2, jtxt_modificarnombreplanta.getText());
            pst.setString(3, jtxt_modificartipoplanta.getText());
            pst.setString(4, jcbx_modificarplantaid.getSelectedItem().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Modificación exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbt_mdificarplantadefabricacionActionPerformed

    private void jb_guardarventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarventaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_guardarventaMouseClicked

    private void jb_guardarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarventaActionPerformed
        String modificacion_sql = "UPDATE Venta SET CantidadVenta=?,Id_Cliente=?, FechaCompra=? WHERE idVenta=?";

        ResultSet rs = null;
        try {
            PreparedStatement pst = cn.prepareStatement(modificacion_sql);
            pst.setString(1, jtxt_modificarcantidadventa.getText());
            pst.setString(2, jcbx_modificaridclienteventa.getSelectedItem().toString());
            pst.setString(3, ((JTextField) date_modificarfechaventa.getDateEditor().getUiComponent()).getText());
            pst.setString(4, jcbx_modificaridventa.getSelectedItem().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Modificación exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_guardarventaActionPerformed

    private void jb_tendenciaxsemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_tendenciaxsemanaActionPerformed
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from  Ventas_semana_marca");
            JTable table_prueba = new JTable(buildTableModel(rs));
            JOptionPane.showMessageDialog(null, new JScrollPane(table_prueba));
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_jb_tendenciaxsemanaActionPerformed

    private void jb_mejoresmesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mejoresmesesActionPerformed
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from  Ventas_PickUp");
            JTable table_prueba = new JTable(buildTableModel(rs));
            JOptionPane.showMessageDialog(null, new JScrollPane(table_prueba));
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_mejoresmesesActionPerformed

    private void jb_tendenciaxmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_tendenciaxmesActionPerformed
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from  Ventas_mes_marca");
            JTable table_prueba = new JTable(buildTableModel(rs));
            JOptionPane.showMessageDialog(null, new JScrollPane(table_prueba));

        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_tendenciaxmesActionPerformed

    private void jb_mayor_rotacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mayor_rotacionActionPerformed
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from  Rotacion_Inventario");
            JTable table_prueba = new JTable(buildTableModel(rs));
            JOptionPane.showMessageDialog(null, new JScrollPane(table_prueba));

        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_mayor_rotacionActionPerformed

    private void jb_tendenciaxanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_tendenciaxanoActionPerformed
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from  Ventas_ano_marca");
            JTable table_prueba = new JTable(buildTableModel(rs));
            JOptionPane.showMessageDialog(null, new JScrollPane(table_prueba));

        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_jb_tendenciaxanoActionPerformed

    private void jb_mejoresmontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mejoresmontosActionPerformed
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from  MejoresMontos");
            JTable table_prueba = new JTable(buildTableModel(rs));
            JOptionPane.showMessageDialog(null, new JScrollPane(table_prueba));

        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_jb_mejoresmontosActionPerformed

    private void jb_mayorescantidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mayorescantidadesActionPerformed
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from Cantidad_Ventas_Marca");
            JTable table_prueba = new JTable(buildTableModel(rs));
            JOptionPane.showMessageDialog(null, new JScrollPane(table_prueba));

        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_jb_mayorescantidadesActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from  Rotacion_Inventario");
            JTable table_prueba = new JTable(buildTableModel(rs));
            JOptionPane.showMessageDialog(null, new JScrollPane(table_prueba));

        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jtp_mainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtp_mainMouseClicked

    }//GEN-LAST:event_jtp_mainMouseClicked

    private void IngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarMouseClicked

    }//GEN-LAST:event_IngresarMouseClicked

    private void jbt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_loginActionPerformed

    private void jbt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt_loginMouseClicked
        if (jrb_cliente.isSelected()) {
            if (jtxt_usuario.getText().equals(clname) && jpf_contrasena.getText().equals(clpass)) {
                JOptionPane.showMessageDialog(this, "Bienvenido!");
                jtp_main.setEnabledAt(0, true);
                jtp_main.setEnabledAt(1, false);
                jtp_main.setEnabledAt(2, false);
                jtp_main.setEnabledAt(3, false);
            } else {
                JOptionPane.showMessageDialog(this, "Acceso denegado, revise los datos");
            }

        } else if (jrb_conse.isSelected()) {
            if (jtxt_usuario.getText().equals(consename) && jpf_contrasena.getText().equals(consepass)) {
                JOptionPane.showMessageDialog(this, "Bienvenido!");
                jtp_main.setEnabledAt(0, false);
                jtp_main.setEnabledAt(1, true);
                jtp_main.setEnabledAt(2, false);
                jtp_main.setEnabledAt(3, false);
            } else {
                JOptionPane.showMessageDialog(this, "Acceso denegado, revise los datos");
                System.out.println(jtxt_usuario.getText());
                System.out.println(jpf_contrasena.getText());
            }
        } else if (jrb_market.isSelected()) {
            if (jtxt_usuario.getText().equals(mkname) && jpf_contrasena.getText().equals(mkpass)) {
                JOptionPane.showMessageDialog(this, "Bienvenido!");
                jtp_main.setEnabledAt(0, false);
                jtp_main.setEnabledAt(1, true);
                jtp_main.setEnabledAt(2, false);
                jtp_main.setEnabledAt(3, false);
            } else {
                JOptionPane.showMessageDialog(this, "Acceso denegado, revise los datos");
                System.out.println(jtxt_usuario.getText());
                System.out.println(jpf_contrasena.getText());
            }
        } else if (jrb_admin.isSelected()) {
            if (jtxt_usuario.getText().equals(adname) && jpf_contrasena.getText().equals(adpass)) {
                JOptionPane.showMessageDialog(this, "Bienvenido administrador");
                jtp_main.setEnabledAt(0, true);
                jtp_main.setEnabledAt(1, true);
                jtp_main.setEnabledAt(2, true);
                jtp_main.setEnabledAt(3, true);

            } else {
                JOptionPane.showMessageDialog(this, "Acceso denegado, revise los datos");
                System.out.println(jtxt_usuario.getText());
                System.out.println(jpf_contrasena.getText());

            }
        }
    }//GEN-LAST:event_jbt_loginMouseClicked

    private void jrb_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrb_clienteActionPerformed

    private void jtxt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_usuarioActionPerformed

    private void admin_JPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_JPMouseClicked
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from Planta_de_Fabricacion");
            JTable table_prueba = new JTable(buildTableModel(rs));
            JOptionPane.showMessageDialog(null, new JScrollPane(table_prueba));
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_admin_JPMouseClicked

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        String sqlInventario = "select Correo_electronico from Concesionario";
        try {
            llenarComboBox(jcbx_concesionarioinventario, sqlInventario);
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_inventario.pack();
        jd_inventario.setModal(true);
        jd_inventario.setLocationRelativeTo(this);
        jd_inventario.setVisible(true);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        jd_reportes.pack();
        jd_reportes.setModal(true);
        jd_reportes.setLocationRelativeTo(this);
        jd_reportes.setVisible(true);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        jd_ventanaCRUD.pack();
        jd_ventanaCRUD.setModal(true);
        jd_ventanaCRUD.setLocationRelativeTo(this);
        jd_ventanaCRUD.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void Cliente_JPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cliente_JPMouseClicked
        String sqlMarca = "select Nombre from Marca";

        try {
            ArrayList<String> colormodelo = new ArrayList();
            ArrayList<String> ubicacion = new ArrayList();
            llenarComboBox(jcb_clientemarca, sqlMarca);
            String sqlColor = "Select color_modelo from Color";
            String sqlUbicacion = "Select pais_concesionario from Pais";

            PreparedStatement pst = cn.prepareStatement(sqlColor);
            ResultSet rs = pst.executeQuery(sqlColor);
            PreparedStatement pst2 = cn.prepareStatement(sqlUbicacion);
            ResultSet rs2 = pst2.executeQuery(sqlUbicacion);

            while (rs.next()) {
                colormodelo.add(rs.getString("color_modelo"));
            }
            LinkedHashSet<String> hashSet = new LinkedHashSet<>(colormodelo);
            ArrayList<String> listWithoutDuplicates = new ArrayList<>(hashSet);

            while (rs2.next()) {
                ubicacion.add(rs2.getString("pais_concesionario"));
            }
            LinkedHashSet<String> hashSet2 = new LinkedHashSet<>(ubicacion);
            ArrayList<String> listWithoutDuplicates2 = new ArrayList<>(hashSet2);
            //System.out.println(listWithoutDuplicates);
            for (int i = 0; i < listWithoutDuplicates.size(); i++) {
                jcb_clientecolor.addItem(listWithoutDuplicates.get(i));
            }

            for (int i = 0; i < listWithoutDuplicates2.size(); i++) {
                jcb_ubicacion.addItem(listWithoutDuplicates2.get(i));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Cliente_JPMouseClicked

    private void jb_localizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_localizarActionPerformed
        try {
            CallableStatement cs = (CallableStatement) cn.prepareCall("{Call Ubicacion_Vehiculo(?, ?, ?)}");
            cs.setString(1, jcb_clientemarca.getSelectedItem().toString());
            cs.setString(2, jcb_clientecolor.getSelectedItem().toString());
            cs.setString(3, jcb_ubicacion.getSelectedItem().toString());
            ResultSet rs = cs.executeQuery();
            JTable Localizacion = new JTable(buildTableModel(rs));
            DefaultTableModel modelolocalizacion = (DefaultTableModel) Localizacion.getModel();
            jt_clientes.setModel(modelolocalizacion);
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }
        // ResultSet rs = st.executeQuery("SELECT * FROM Venta");
    }//GEN-LAST:event_jb_localizarActionPerformed

    private void jcb_clientemarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_clientemarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_clientemarcaActionPerformed

    private void jb_informeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_informeActionPerformed
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Venta");
            JTable bitacora = new JTable(buildTableModel(rs));
            DefaultTableModel modelobitacora = (DefaultTableModel) bitacora.getModel();
            jt_informe.setModel(modelobitacora);
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jb_informeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE Venta WHERE idVenta = ?");
            pst.setString(1, jcbx_eliminaridventa.getSelectedItem().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Datos Eliminados");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbt_buscarconcesionarioinventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_buscarconcesionarioinventarioActionPerformed

        try {
            CallableStatement call = (CallableStatement) cn.prepareCall("{call inventario_concesionarios (?)}");
            call.setString(1, jcbx_concesionarioinventario.getSelectedItem().toString());
            ResultSet rs = call.executeQuery();
            JTable bitacora = new JTable(buildTableModel(rs));
            DefaultTableModel modelobitacora = (DefaultTableModel) bitacora.getModel();
            jt_concesionarionventario.setModel(modelobitacora);
            call.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(InterfazDealership.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbt_buscarconcesionarioinventarioActionPerformed

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

    private int Que_Quiere_Hacer() {
        int hacer = 0;
        if (jRB_crear.isSelected()) {
            hacer = 1;
        } else if (jRB_modificar.isSelected()) {
            hacer = 2;
        } else if (jRB_eliminar.isSelected()) {
            hacer = 3;
        }
        return hacer;
    }

    private void CREAR() throws SQLException {
        String sqlComboBox = "";
        String sqlComboBox2 = "";
        String sqlComboBox3 = "";
        int quien = A_Quien();
        switch (quien) {
            case 1:
                //cargar el combobox jCB_crearIdCompaniaPlanta
//                sqlComboBox = "SELECT idCompañia FROM compañia";
//                try {
//                    llenarComboBox(cb_crearIdCompaniaPlanta, sqlComboBox);
//                } catch (SQLException ex) {
//                    Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
//                }

                jd_CrearPlanta.pack();
                jd_CrearPlanta.setModal(true);
                jd_CrearPlanta.setLocationRelativeTo(this);
                jd_CrearPlanta.setVisible(true);

                break;
            case 2:
                //cargar el combobox jCB_crearIdCompaniaVehiculo
//                sqlComboBox = "SELECT idCompañia FROM compañia";
//                try {
//                    llenarComboBox(jCB_crearIdCompaniaVehiculo, sqlComboBox);
//                } catch (SQLException ex) {
//                    Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
//                }
                String sqlMarca = "select Codigo_marca from Marca";
                llenarComboBox(jcbx_codigomarcavehiculo, sqlMarca);
                String sqlConcesionario = "SELECT Correo_electronico FROM Concesionario";
                llenarComboBox(jcbx_correoconcesionariovehiculo, sqlConcesionario);
                String sqlplanta = "SELECT idPlanta FROM Planta_de_Fabricacion";
                llenarComboBox(jcbx_plantadefabricacionvehiculo, sqlplanta);
                jd_CrearVehiculo.pack();
                jd_CrearVehiculo.setModal(true);
                jd_CrearVehiculo.setLocationRelativeTo(this);
                jd_CrearVehiculo.setVisible(true);
                break;
            case 3:
                //cargar comboboxes de la ventana de crearVenta
//                sqlComboBox = "SELECT rtnCon FROM concesionario";
//                sqlComboBox2 = "SELECT rtnClien FROM cliente";
//                sqlComboBox3 = "SELECT vinVehiculoComprado FROM compra_a";
//                try {
//                    llenarComboBox(jCB_crearRtnConVenta, sqlComboBox);
//                    llenarComboBox(jCB_crearRtnClienteVenta, sqlComboBox2);
//                    llenarComboBox(jCB_crearVinVehiculoVendido, sqlComboBox3);
//                } catch (SQLException ex) {
//                    Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
//                }
                jd_CrearMarca.pack();
                jd_CrearMarca.setModal(true);
                jd_CrearMarca.setLocationRelativeTo(this);
                jd_CrearMarca.setVisible(true);
                break;
            case 4:

                jd_CrearProveedor.pack();
                jd_CrearProveedor.setModal(true);
                jd_CrearProveedor.setLocationRelativeTo(this);
                jd_CrearProveedor.setVisible(true);
                break;
            case 5:
                jd_CrearConcesionario.pack();
                jd_CrearConcesionario.setModal(true);
                jd_CrearConcesionario.setLocationRelativeTo(this);
                jd_CrearConcesionario.setVisible(true);
                break;
            case 6:
                String sqlModelo = "select idModelo from Modelo";
                llenarComboBox(jcbx_idmodelopieza, sqlModelo);
                String sqlplantapieza = "SELECT idPlanta FROM Planta_de_Fabricacion";
                llenarComboBox(jcbx_idplantadefabricacionpieza, sqlplantapieza);
                String sqlProveedor = "SELECT Correo_electronico FROM Proveedor";
                llenarComboBox(jcbx_correoproveedorhaspieza, sqlProveedor);
                jd_CrearPieza.pack();
                jd_CrearPieza.setModal(true);
                jd_CrearPieza.setLocationRelativeTo(this);
                jd_CrearPieza.setVisible(true);
                break;
            case 7:
                String sqlMarcamodelo = "select Codigo_marca from Marca";
                llenarComboBox(jcbx_codigomarcamodelo, sqlMarcamodelo);
                jd_CrearModelo.pack();
                jd_CrearModelo.setModal(true);
                jd_CrearModelo.setLocationRelativeTo(this);
                jd_CrearModelo.setVisible(true);
                break;
            case 8:
                String sql = "SELECT Correo_electronico FROM Concesionario";
                llenarComboBox(jcbx_idconcesionariocrearcliente, sql);
                jd_CrearCliente.pack();
                jd_CrearCliente.setModal(true);
                jd_CrearCliente.setLocationRelativeTo(this);
                jd_CrearCliente.setVisible(true);
                break;
            case 9:
                Statement st;
                st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM Venta");
                JTable bitacora = new JTable(buildTableModel(rs));
                DefaultTableModel modelobitacora = (DefaultTableModel) bitacora.getModel();
                jt_bitacora.setModel(modelobitacora);
                String sqlVenta = "SELECT Correo_electronico FROM Concesionario";
                llenarComboBox(jcbx_correoconcesionarioventa, sqlVenta);
                String sqlcliente = "SELECT Id_cliente FROM Cliente";
                llenarComboBox(jcbx_idclienteventa, sqlcliente);
                String sqlvehiculo = "SELECT VIN FROM Vehiculo WHERE Estado='Inventario'";
                llenarComboBox(jcbx_vinvehiculoventa, sqlvehiculo);
                jd_crearventa.pack();
                jd_crearventa.setModal(true);
                jd_crearventa.setLocationRelativeTo(this);
                jd_crearventa.setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Seleccione a quien quiere aplicarle lo antes seleccionado!");
                break;
        }
    }

    private void MODIFICAR() throws SQLException {
        int quien = A_Quien();
        switch (quien) {
            case 1:
                String sqlplanta = "SELECT idPlanta FROM Planta_de_Fabricacion";
                llenarComboBox(jcbx_modificarplantaid, sqlplanta);
                jd_modificarplanta.pack();
                jd_modificarplanta.setModal(true);
                jd_modificarplanta.setLocationRelativeTo(this);
                jd_modificarplanta.setVisible(true);
                break;
            case 2:
                JOptionPane.showMessageDialog(this, "No se pueden modificar vehículos");
                break;
            case 3:
                String sqlMarca = "select Codigo_marca from Marca";
                llenarComboBox(jcbx_codigomarcamodificarmarca, sqlMarca);
                jd_modificarmarca.pack();
                jd_modificarmarca.setModal(true);
                jd_modificarmarca.setLocationRelativeTo(this);
                jd_modificarmarca.setVisible(true);
                break;
            case 4:
                JOptionPane.showMessageDialog(this, "No se pueden modificar Proveedores");
                break;
            case 5:
                String sql = "SELECT Correo_electronico FROM Concesionario";
                llenarComboBox(jcbx_correoelectronicoconcesionario_modificar, sql);
                jd_modificarconcesionario.pack();
                jd_modificarconcesionario.setModal(true);
                jd_modificarconcesionario.setLocationRelativeTo(this);
                jd_modificarconcesionario.setVisible(true);
                break;
            case 6:
                //Aqui Cargas los id del combobox jCB_modiRtnConCompra, jCB_modiIdCompaniaCompra, y jCB_modiVinVehiculoCompra
                break;
            case 7:
                //Aqui Cargas los id del combobox jCB_modiCompania

                String sqlModelo = "select idModelo from Modelo";
                llenarComboBox(jcbx_idmodelomodificar, sqlModelo);
                String sqlMarcamodificarmodelo = "select Codigo_marca from Marca";
                llenarComboBox(jcbx_codigomarcamodificarmodelo, sqlMarcamodificarmodelo);
                jd_modificarmodelo.pack();
                jd_modificarmodelo.setModal(true);
                jd_modificarmodelo.setLocationRelativeTo(this);
                jd_modificarmodelo.setVisible(true);
                break;
            case 8:
                //Aqui Cargas los RTN del combobox jCB_modiCliente
                String sqlcliente = "SELECT Id_cliente FROM Cliente";
                llenarComboBox(jcbx_idmodificarcliente, sqlcliente);
                String sqlmodificarcliente = "SELECT Correo_electronico FROM Concesionario";
                llenarComboBox(jcbx_idconcesionariomodificarcliente, sqlmodificarcliente);
                jd_modificarCliente.pack();
                jd_modificarCliente.setModal(true);
                jd_modificarCliente.setLocationRelativeTo(this);
                jd_modificarCliente.setVisible(true);
                break;
            case 9:
                String sqlVenta = "SELECT idVenta FROM Venta";
                llenarComboBox(jcbx_modificaridventa, sqlVenta);
                String sqlclientemodificarventa = "SELECT Id_cliente FROM Cliente";
                llenarComboBox(jcbx_modificaridclienteventa, sqlclientemodificarventa);
                String sqlcorreoconcesionariomodificarventa = "SELECT Correo_electronico FROM Concesionario";
//                llenarComboBox(jcbx_modificarcorreoconcesionarioventa, sqlcorreoconcesionariomodificarventa);
//                String sqlvehiculomodificarventa = "SELECT VIN FROM Vehiculo";
//                llenarComboBox(cb_modificarvinvehiculoventa, sqlvehiculomodificarventa);
                jd_modificarventa.pack();
                jd_modificarventa.setModal(true);
                jd_modificarventa.setLocationRelativeTo(this);
                jd_modificarventa.setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Seleccione a quien quiere aplicarle lo antes seleccionado!");
                break;
        }
    }

    public void llenarComboBox(JComboBox comboBox, String sql) throws SQLException {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) comboBox.getModel();
        Statement st = cn.createStatement();
        ResultSet rs = null;
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                modelo.addElement(rs.getString(1));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        comboBox.setModel(modelo);
    }

    private int A_Quien() {
        int quien = 0;
        if (jRB_plantaFabricacion.isSelected()) {
            quien = 1;
        } else if (jRB_vehiculo.isSelected()) {
            quien = 2;
        } else if (jRB_marca.isSelected()) {
            quien = 3;
        } else if (jRB_proveedor.isSelected()) {
            quien = 4;
        } else if (jRB_consecionario.isSelected()) {
            quien = 5;
        } else if (jRB_modelo.isSelected()) {
            quien = 7;
        } else if (jRB_cliente.isSelected()) {
            quien = 8;
        } else if (jRB_pieza.isSelected()) {
            quien = 6;
        } else if (jRB_venta.isSelected()) {
            quien = 9;
        }
        System.out.println(quien);
        return quien;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Btg_tipo;
    private javax.swing.JPanel Cliente_JP;
    private javax.swing.JPanel Informes_Ventas_JP;
    private javax.swing.JPanel Ingresar;
    private javax.swing.JPanel admin_JP;
    private javax.swing.ButtonGroup btg_entidades;
    private javax.swing.ButtonGroup btg_operaciones;
    private javax.swing.ButtonGroup btg_transmision;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser date_fechaventa;
    private com.toedter.calendar.JDateChooser date_modificarfechaventa;
    private javax.swing.JButton jB_anteriorProveedoresClientes1;
    private javax.swing.JButton jB_crearVenta;
    private javax.swing.JButton jB_ejecutarCRUD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRB_cliente;
    private javax.swing.JRadioButton jRB_consecionario;
    private javax.swing.JRadioButton jRB_crear;
    private javax.swing.JRadioButton jRB_eliminar;
    private javax.swing.JRadioButton jRB_marca;
    private javax.swing.JRadioButton jRB_modelo;
    private javax.swing.JRadioButton jRB_modificar;
    private javax.swing.JRadioButton jRB_pieza;
    private javax.swing.JRadioButton jRB_plantaFabricacion;
    private javax.swing.JRadioButton jRB_proveedor;
    private javax.swing.JRadioButton jRB_vehiculo;
    private javax.swing.JRadioButton jRB_venta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JButton jb_guardarventa;
    private javax.swing.JButton jb_informe;
    private javax.swing.JButton jb_localizar;
    private javax.swing.JButton jb_mayor_rotacion;
    private javax.swing.JButton jb_mayorescantidades;
    private javax.swing.JButton jb_mejoresmeses;
    private javax.swing.JButton jb_mejoresmontos;
    private javax.swing.JButton jb_tendenciaxano;
    private javax.swing.JButton jb_tendenciaxmes;
    private javax.swing.JButton jb_tendenciaxsemana;
    private javax.swing.ButtonGroup jbg_modificartipo;
    private javax.swing.JButton jbt_agregarcolor;
    private javax.swing.JButton jbt_agregarestilo;
    private javax.swing.JButton jbt_agregarpaisconcesionario;
    private javax.swing.JButton jbt_agregarpaisconcesionario1;
    private javax.swing.JButton jbt_agregartransmision;
    private javax.swing.JButton jbt_buscarconcesionarioinventario;
    private javax.swing.JButton jbt_crearcliente;
    private javax.swing.JButton jbt_crearconcesionario;
    private javax.swing.JButton jbt_crearmarca;
    private javax.swing.JButton jbt_generarvincode;
    private javax.swing.JButton jbt_guardarrmarca;
    private javax.swing.JButton jbt_ingresarplantadefabricacion;
    private javax.swing.JButton jbt_insertarpieza;
    private javax.swing.JButton jbt_insertarproveedor;
    private javax.swing.JButton jbt_insertarvehiculo;
    private javax.swing.JButton jbt_login;
    private javax.swing.JButton jbt_mdificarplantadefabricacion;
    private javax.swing.JButton jbt_modificarconcesionario;
    private javax.swing.JButton jbt_modificarrcliente;
    private javax.swing.JComboBox<String> jcb_clientecolor;
    private javax.swing.JComboBox<String> jcb_clientemarca;
    private javax.swing.JComboBox<String> jcb_ubicacion;
    private javax.swing.JComboBox<String> jcbx_codigomarcamodelo;
    private javax.swing.JComboBox<String> jcbx_codigomarcamodificarmarca;
    private javax.swing.JComboBox<String> jcbx_codigomarcamodificarmodelo;
    private javax.swing.JComboBox<String> jcbx_codigomarcavehiculo;
    private javax.swing.JComboBox<String> jcbx_concesionarioinventario;
    private javax.swing.JComboBox<String> jcbx_correoconcesionariovehiculo;
    private javax.swing.JComboBox<String> jcbx_correoconcesionarioventa;
    private javax.swing.JComboBox<String> jcbx_correoelectronicoconcesionario_modificar;
    private javax.swing.JComboBox<String> jcbx_correoproveedorhaspieza;
    private javax.swing.JComboBox<String> jcbx_eliminaridventa;
    private javax.swing.JComboBox<String> jcbx_idclienteventa;
    private javax.swing.JComboBox<String> jcbx_idconcesionariocrearcliente;
    private javax.swing.JComboBox<String> jcbx_idconcesionariomodificarcliente;
    private javax.swing.JComboBox<String> jcbx_idmodelomodificar;
    private javax.swing.JComboBox<String> jcbx_idmodelopieza;
    private javax.swing.JComboBox<String> jcbx_idmodificarcliente;
    private javax.swing.JComboBox<String> jcbx_idplantadefabricacionpieza;
    private javax.swing.JComboBox<String> jcbx_modelovehiculo;
    private javax.swing.JComboBox<String> jcbx_modificaridclienteventa;
    private javax.swing.JComboBox<String> jcbx_modificaridventa;
    private javax.swing.JComboBox<String> jcbx_modificarplantaid;
    private javax.swing.JComboBox<String> jcbx_plantadefabricacionvehiculo;
    private javax.swing.JComboBox<String> jcbx_vinvehiculoventa;
    private javax.swing.JDialog jd_CrearCliente;
    private javax.swing.JDialog jd_CrearConcesionario;
    private javax.swing.JDialog jd_CrearMarca;
    private javax.swing.JDialog jd_CrearModelo;
    private javax.swing.JDialog jd_CrearPieza;
    private javax.swing.JDialog jd_CrearPlanta;
    private javax.swing.JDialog jd_CrearProveedor;
    private javax.swing.JDialog jd_CrearVehiculo;
    private javax.swing.JDialog jd_crearventa;
    private javax.swing.JDialog jd_eliminarventa;
    private javax.swing.JDialog jd_inventario;
    private javax.swing.JDialog jd_modificarCliente;
    private javax.swing.JDialog jd_modificarconcesionario;
    private javax.swing.JDialog jd_modificarmarca;
    private javax.swing.JDialog jd_modificarmodelo;
    private javax.swing.JDialog jd_modificarplanta;
    private javax.swing.JDialog jd_modificarventa;
    private javax.swing.JDialog jd_reportes;
    private javax.swing.JDialog jd_ventanaCRUD;
    private javax.swing.JPasswordField jpf_contrasena;
    private javax.swing.JRadioButton jrb_admin;
    private javax.swing.JRadioButton jrb_cliente;
    private javax.swing.JRadioButton jrb_conse;
    private javax.swing.JRadioButton jrb_market;
    private javax.swing.JRadioButton jrdb_automatico;
    private javax.swing.JRadioButton jrdb_manual;
    private javax.swing.JTable jt_bitacora;
    private javax.swing.JTable jt_clientes;
    private javax.swing.JTable jt_concesionarionventario;
    private javax.swing.JTable jt_eliminarventa;
    private javax.swing.JTable jt_informe;
    private javax.swing.JTabbedPane jtp_main;
    private javax.swing.JTextField jtxt_VIN;
    private javax.swing.JTextField jtxt_cantidadventa;
    private javax.swing.JTextField jtxt_ciudadpais;
    private javax.swing.JTextField jtxt_ciudadpais1;
    private javax.swing.JTextField jtxt_codigomarca;
    private javax.swing.JTextField jtxt_correoconcesionario;
    private javax.swing.JTextField jtxt_correoelectronicoproveedor;
    private javax.swing.JTextField jtxt_direccioncliente;
    private javax.swing.JTextField jtxt_estadovehiculo;
    private javax.swing.JTextField jtxt_idcliente;
    private javax.swing.JTextField jtxt_idmodelo;
    private javax.swing.JTextField jtxt_idplantafabricacion;
    private javax.swing.JTextField jtxt_idventa;
    private javax.swing.JTextField jtxt_modelotipo;
    private javax.swing.JTextField jtxt_modificarcantidadventa;
    private javax.swing.JTextField jtxt_modificardireccioncliente;
    private javax.swing.JTextField jtxt_modificarmodelotipo;
    private javax.swing.JTextField jtxt_modificarmotormodelo;
    private javax.swing.JTextField jtxt_modificarnombrecliente;
    private javax.swing.JTextField jtxt_modificarnombremarca;
    private javax.swing.JTextField jtxt_modificarnombremodelo;
    private javax.swing.JTextField jtxt_modificarnombreplanta;
    private javax.swing.JTextField jtxt_modificarnumerotelefonoconcesionario;
    private javax.swing.JTextField jtxt_modificartelefonocliente;
    private javax.swing.JTextField jtxt_modificartipoplanta;
    private javax.swing.JTextField jtxt_modificarubicacionplanta;
    private javax.swing.JTextField jtxt_motormodelo;
    private javax.swing.JTextField jtxt_nombrecliente;
    private javax.swing.JTextField jtxt_nombrecolor;
    private javax.swing.JTextField jtxt_nombreconcesionario;
    private javax.swing.JTextField jtxt_nombreestilo;
    private javax.swing.JTextField jtxt_nombremarca;
    private javax.swing.JTextField jtxt_nombremodelo;
    private javax.swing.JTextField jtxt_nombrepieza;
    private javax.swing.JTextField jtxt_nombreplanta;
    private javax.swing.JTextField jtxt_numeracion;
    private javax.swing.JTextField jtxt_numerotelefonoconcesionario;
    private javax.swing.JTextField jtxt_numerotelefonoproveedor;
    private javax.swing.JTextField jtxt_paisconcesionario;
    private javax.swing.JTextField jtxt_paisconcesionario1;
    private javax.swing.JTextField jtxt_paisproveedor;
    private javax.swing.JTextField jtxt_telefonocliente;
    private javax.swing.JTextField jtxt_tipo;
    private javax.swing.JTextField jtxt_ubicacionplanta;
    private javax.swing.JTextField jtxt_usuario;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage10;
    private org.edisoncor.gui.panel.PanelImage panelImage11;
    private org.edisoncor.gui.panel.PanelImage panelImage12;
    private org.edisoncor.gui.panel.PanelImage panelImage13;
    private org.edisoncor.gui.panel.PanelImage panelImage14;
    private org.edisoncor.gui.panel.PanelImage panelImage15;
    private org.edisoncor.gui.panel.PanelImage panelImage16;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private org.edisoncor.gui.panel.PanelImage panelImage5;
    private org.edisoncor.gui.panel.PanelImage panelImage6;
    private org.edisoncor.gui.panel.PanelImage panelImage7;
    private org.edisoncor.gui.panel.PanelImage panelImage8;
    private org.edisoncor.gui.panel.PanelImage panelImage9;
    private org.edisoncor.gui.panel.PanelImageReflect panelImageReflect1;
    private javax.swing.JRadioButton rb_Empresa;
    private javax.swing.JRadioButton rb_empresacliente;
    private javax.swing.JRadioButton rb_sexoF;
    private javax.swing.JRadioButton rb_sexoF1;
    private javax.swing.JRadioButton rb_sexoM;
    private javax.swing.JRadioButton rb_sexoM1;
    // End of variables declaration//GEN-END:variables

    String adname = "DanielRC";
    String adpass = "1234";
    String clname = "Cliente1";
    String clpass = "12345";
    String consename = "Conse1";
    String consepass = "123456";
    String mkname = "market1";
    String mkpass = "1234";

    public static DefaultTableModel buildTableModel(ResultSet rs)
            throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }
        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }
        return new DefaultTableModel(data, columnNames);
    }

}
