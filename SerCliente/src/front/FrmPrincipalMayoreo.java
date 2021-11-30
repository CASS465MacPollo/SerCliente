/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front;

import front.secundarios.FrmAcercaDe;
import front.secundarios.FrmCambioClave;
import front.secundarios.FrmCupoEmpleado;
import front.secundarios.FrmNit;
import front.secundarios.FrmOftasDsctos;
import front.secundarios.FrmProcedimiento;
import front.secundarios.FrmRetomarGestion;
import front.secundarios.FrmSerClienteMayoreo;
import front.secundarios.FrmSoporteTecnico;
import front.secundarios.almacenes.FrmCambiarCu;
import front.secundarios.almacenes.FrmCreacionClientes;
import front.secundarios.almacenes.FrmPedidosTransmitidos;
import front.secundarios.mayoreo.FrmSubirCampanias;
import front.secundarios.mayoreo.FrmCambiarZona;
import front.secundarios.mayoreo.FrmGestionTelevendedor;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author cass465
 */
public class FrmPrincipalMayoreo extends javax.swing.JFrame {

    private Dimension dimension;
    private FrmSerClienteMayoreo vSerCliente;
    
    /**
     * Creates new form VentanaMenu
     */
    public FrmPrincipalMayoreo() {
        initComponents();
        
        vSerCliente = new FrmSerClienteMayoreo(this);
        ajustarComponentes();
    }

    private void ajustarComponentes() {
        //Icono del frame
        this.setIconImage(new ImageIcon("src/images/icons/Principal/MacPolloIcon.png").getImage());

        //Tamaño en en x y del monitor
        //dimension = super.getToolkit().getScreenSize();
        dimension = new Dimension(1680, 1010);
        super.setSize(dimension);
        
        //Centrar ventana en pantalla
        setLocationRelativeTo(null);

        //Iconos menu Pollito
        cambioClaveItem.setIcon(new ImageIcon("src/images/icons/Menu/Pollito/CambioClave.png"));
        soporteItem.setIcon(new ImageIcon("src/images/icons/Menu/Pollito/Soporte.png"));
        acercaDeItem.setIcon(new ImageIcon("src/images/icons/Menu/Pollito/AcercaDe.png"));
        salirItem.setIcon(new ImageIcon("src/images/icons/Menu/Pollito/Salir.png"));

        fechaHoyTxt.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));

        //Fuente del JTabbedPane
        opcionesPane.setFont(new Font("Dialog", Font.BOLD, 14));

        ImageIcon imagen = new ImageIcon("src/images/MacPolloN1Black.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(macPolloN1L.getWidth(), macPolloN1L.getHeight(), Image.SCALE_DEFAULT));
        macPolloN1L.setIcon(icono);

        Icon pollitoIcon = new ImageIcon(new ImageIcon("src/images/icons/Principal/MacPolloIcon30.png").getImage());
        pollitoBtn.setIcon(pollitoIcon);

        //Iconos del menu principal
        opcionesPane.setIconAt(0, new ImageIcon("src/images/icons/Menu/ServicioCliente.png"));
        opcionesPane.setIconAt(1, new ImageIcon("src/images/icons/Menu/Estadisticas.png"));
        opcionesPane.setIconAt(2, new ImageIcon("src/images/icons/Menu/ProcesosEspeciales.png"));
        
        //Iconos Servicio al Cliente
        Icon teleMercadeoIcon = new ImageIcon(new ImageIcon("src/images/icons/Menu/ServicioCliente/TeleMercadeo.png").getImage());
        teleMercadeoIconL.setIcon(teleMercadeoIcon);

        Icon callInIcon = new ImageIcon(new ImageIcon("src/images/icons/Menu/ServicioCliente/InCall.png").getImage());
        callInIconL.setIcon(callInIcon);
        callInL.setText("<html><body><center>Call Center<br>InBound</center></body></html>");

        Icon pedInIcon = new ImageIcon(new ImageIcon("src/images/icons/Menu/ServicioCliente/InPedidos.png").getImage());
        pedInIconL.setIcon(pedInIcon);

        ///////////////////
        fechaCampaniaTxt.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));

        //Iconos Estadísticas
        Icon gesClientesIcon = new ImageIcon(new ImageIcon("src/images/icons/Menu/Estadisticas/GestionClientes.png").getImage());
        gesClientesIconL.setIcon(gesClientesIcon);
        gesClientesL.setText("<html><body><center>Gestión de<br>Clientes</center></body></html>");

        Icon gesOperadorIcon = new ImageIcon(new ImageIcon("src/images/icons/Menu/Estadisticas/GestionOperador.png").getImage());
        gesOperadorIconL.setIcon(gesOperadorIcon);
        gesOperadorL.setText("<html><body><center>Gestión por<br>Operador</center></body></html>");

        Icon gesHorasIcon = new ImageIcon(new ImageIcon("src/images/icons/Menu/Estadisticas/GestionHoras.png").getImage());
        gesHorasIconL.setIcon(gesHorasIcon);
        gesHorasL.setText("<html><body><center>Gestión de<br>Horas</center></body></html>");

        Icon gesCampaniasIcon = new ImageIcon(new ImageIcon("src/images/icons/Menu/Estadisticas/GestionCampania.png").getImage());
        gesCampaniasIconL.setIcon(gesCampaniasIcon);
        gesCampaniasL.setText("<html><body><center>Gestión de<br>Campañas</center></body></html>");

        Icon cargueCampaniasIcon = new ImageIcon(new ImageIcon("src/images/icons/Menu/Estadisticas/Upload.png").getImage());
        cargueCampaniasIconL.setIcon(cargueCampaniasIcon);
        cargueCampaniasL.setText("<html><body><center>Cargue por<br>Campañas</center></body></html>");

        //Iconos Procesos Especiales
        Icon marcacionIcon = new ImageIcon(new ImageIcon("src/images/icons/Menu/Procesos Especiales/Marcacion.png").getImage());
        marcacionIconL.setIcon(marcacionIcon);
        marcacionL.setText("<html><body><center>Marcación<br>Aut / Manual</center></body></html>");

        Icon gesCampaniasPIcon = new ImageIcon(new ImageIcon("src/images/icons/Menu/Procesos Especiales/GestionCampanias.png").getImage());
        gesCampaniasPIconL.setIcon(gesCampaniasPIcon);
        gesCampaniasPL.setText("<html><body><center>Gestión de<br>Campañas</center></body></html>");

        Icon consCampaniasIcon = new ImageIcon(new ImageIcon("src/images/icons/Menu/Procesos Especiales/ConsultaCampanias.png").getImage());
        consCampaniasIconL.setIcon(consCampaniasIcon);
        consCampaniasL.setText("<html><body><center>Consultar<br>Campañas</center></body></html>");

        Icon guionIcon = new ImageIcon(new ImageIcon("src/images/icons/Menu/Procesos Especiales/Guion.png").getImage());
        guionIconL.setIcon(guionIcon);

        Icon pedVirtualesIcon = new ImageIcon(new ImageIcon("src/images/icons/Menu/Procesos Especiales/PedidosVirtuales.png").getImage());
        pedVirtualesIconL.setIcon(pedVirtualesIcon);
        pedVirtualesL.setText("<html><body><center>Pedidos<br>Virtuales</center></body></html>");

        Icon mayoreoIcon = new ImageIcon(new ImageIcon("src/images/icons/Menu/Procesos Especiales/Mayoreo.png").getImage());
        mayoreoIconL.setIcon(mayoreoIcon);
        
        //Icons mayoreo
        Icon cmbZonaOperadorIcon = new ImageIcon(new ImageIcon("src/images/icons/Menu/Procesos Especiales/Mayoreo/CambiarZona.png").getImage());
        cmbZonaOperadorItem.setIcon(cmbZonaOperadorIcon);

        Icon subirCampaniasIcon = new ImageIcon(new ImageIcon("src/images/icons/Menu/Procesos Especiales/Mayoreo/SubirArchivo.png").getImage());
        subirCampaniasItem.setIcon(subirCampaniasIcon);
        
        Icon gestionTelevendedorIcon = new ImageIcon(new ImageIcon("src/images/icons/Menu/Procesos Especiales/Mayoreo/GestionTV.png").getImage());
        gestionTelevendedorItem.setIcon(gestionTelevendedorIcon);

        //
        opciones2Pane.removeAll();
        opciones2Pane.add("Inicio", inicioPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new javax.swing.JPopupMenu();
        cambioClaveItem = new javax.swing.JMenuItem();
        soporteItem = new javax.swing.JMenuItem();
        acercaDeItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        salirItem = new javax.swing.JMenuItem();
        popupMayoreo = new javax.swing.JPopupMenu();
        cmbZonaOperadorItem = new javax.swing.JMenuItem();
        subirCampaniasItem = new javax.swing.JMenuItem();
        gestionTelevendedorItem = new javax.swing.JMenuItem();
        jPanel20 = new javax.swing.JPanel();
        opcionesPane = new javax.swing.JTabbedPane();
        servicioClienteOpcionesPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        teleMercadeoIconL = new javax.swing.JLabel();
        teleMercadeoL = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        callInIconL = new javax.swing.JLabel();
        callInL = new javax.swing.JLabel();
        jPanel70 = new javax.swing.JPanel();
        pedInIconL = new javax.swing.JLabel();
        callInL1 = new javax.swing.JLabel();
        estadisticasPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        gesClientesIconL = new javax.swing.JLabel();
        gesClientesL = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        gesOperadorIconL = new javax.swing.JLabel();
        gesOperadorL = new javax.swing.JLabel();
        jPanel98 = new javax.swing.JPanel();
        gesHorasIconL = new javax.swing.JLabel();
        gesHorasL = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        gesCampaniasIconL = new javax.swing.JLabel();
        gesCampaniasL = new javax.swing.JLabel();
        jPanel99 = new javax.swing.JPanel();
        cargueCampaniasIconL = new javax.swing.JLabel();
        cargueCampaniasL = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        marcacionIconL = new javax.swing.JLabel();
        marcacionL = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        gesCampaniasPIconL = new javax.swing.JLabel();
        gesCampaniasPL = new javax.swing.JLabel();
        jPanel100 = new javax.swing.JPanel();
        consCampaniasIconL = new javax.swing.JLabel();
        consCampaniasL = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        guionIconL = new javax.swing.JLabel();
        guionL = new javax.swing.JLabel();
        jPanel101 = new javax.swing.JPanel();
        pedVirtualesIconL = new javax.swing.JLabel();
        pedVirtualesL = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        mayoreoIconL = new javax.swing.JLabel();
        mayoreoL = new javax.swing.JLabel();
        pollitoBtn = new javax.swing.JButton();
        opciones2Pane = new javax.swing.JTabbedPane();
        inicioPanel = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        presentacionPanel = new javax.swing.JPanel();
        macPolloN1L = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fechaHoyTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        teleMercadeoPanel = new javax.swing.JPanel();
        clientesTMPanel1 = new javax.swing.JPanel();
        fechaCampaniaPanel1 = new javax.swing.JPanel();
        fechaCampaniaTxt = new javax.swing.JTextField();
        tipoMarcacionPanel1 = new javax.swing.JPanel();
        tipoMarcacionTxt1 = new javax.swing.JTextField();
        marcacionAutBtn1 = new javax.swing.JButton();
        retomarGestionBtn1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        clientesPorLlamarTable1 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        clientesLlamarMasTardeTable1 = new javax.swing.JTable();
        crearClienteBtn1 = new javax.swing.JButton();
        cancelarLlamadaBtn1 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jPanel67 = new javax.swing.JPanel();
        jTextField15 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jPanel69 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        retomarGestionBtn3 = new javax.swing.JButton();
        callInPanel = new javax.swing.JPanel();
        callInPanel4 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jRadioButton36 = new javax.swing.JRadioButton();
        jRadioButton37 = new javax.swing.JRadioButton();
        jPanel73 = new javax.swing.JPanel();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        jPanel74 = new javax.swing.JPanel();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jPanel75 = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        jTextField117 = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        jTextField118 = new javax.swing.JTextField();
        jLabel128 = new javax.swing.JLabel();
        jTextField121 = new javax.swing.JTextField();
        jLabel129 = new javax.swing.JLabel();
        jTextField123 = new javax.swing.JTextField();
        jButton70 = new javax.swing.JButton();
        jPanel76 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        jTextField124 = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        jTextField125 = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        jTextField126 = new javax.swing.JTextField();
        jTextField127 = new javax.swing.JTextField();
        jTextField128 = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        jTextField129 = new javax.swing.JTextField();
        jTextField132 = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        jTextField133 = new javax.swing.JTextField();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jTextField137 = new javax.swing.JTextField();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jSpinField1 = new com.toedter.components.JSpinField();
        jSpinField2 = new com.toedter.components.JSpinField();
        jSpinField3 = new com.toedter.components.JSpinField();
        jSpinField4 = new com.toedter.components.JSpinField();
        jPanel77 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jLabel149 = new javax.swing.JLabel();
        jTextField138 = new javax.swing.JTextField();
        jLabel150 = new javax.swing.JLabel();
        jTextField139 = new javax.swing.JTextField();
        jLabel151 = new javax.swing.JLabel();
        jTextField140 = new javax.swing.JTextField();
        jLabel152 = new javax.swing.JLabel();
        jTextField141 = new javax.swing.JTextField();
        jLabel153 = new javax.swing.JLabel();
        jTextField142 = new javax.swing.JTextField();
        jLabel154 = new javax.swing.JLabel();
        jTextField143 = new javax.swing.JTextField();
        jLabel155 = new javax.swing.JLabel();
        jTextField144 = new javax.swing.JTextField();
        jTextField145 = new javax.swing.JTextField();
        jLabel156 = new javax.swing.JLabel();
        jTextField146 = new javax.swing.JTextField();
        jComboBox14 = new javax.swing.JComboBox<>();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jCheckBox9 = new javax.swing.JCheckBox();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel159 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jButton76 = new javax.swing.JButton();
        pedInPanel = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        jPanel89 = new javax.swing.JPanel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton52 = new javax.swing.JRadioButton();
        jButton106 = new javax.swing.JButton();
        jPanel102 = new javax.swing.JPanel();
        jLabel137 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jTextField174 = new javax.swing.JTextField();
        jTextField175 = new javax.swing.JTextField();
        jTextField176 = new javax.swing.JTextField();
        jTextField177 = new javax.swing.JTextField();
        jButton107 = new javax.swing.JButton();
        gesClientesPanel = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jDateChooser9 = new com.toedter.calendar.JDateChooser();
        jDateChooser10 = new com.toedter.calendar.JDateChooser();
        jPanel48 = new javax.swing.JPanel();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jComboBox8 = new javax.swing.JComboBox<>();
        jPanel49 = new javax.swing.JPanel();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jComboBox9 = new javax.swing.JComboBox<>();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel50 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jPanel51 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jPanel52 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTable16 = new javax.swing.JTable();
        jScrollPane29 = new javax.swing.JScrollPane();
        jTable23 = new javax.swing.JTable();
        jButton34 = new javax.swing.JButton();
        gesOperadorPanel = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jDateChooser11 = new com.toedter.calendar.JDateChooser();
        jDateChooser12 = new com.toedter.calendar.JDateChooser();
        jPanel55 = new javax.swing.JPanel();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jComboBox10 = new javax.swing.JComboBox<>();
        jPanel56 = new javax.swing.JPanel();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jComboBox17 = new javax.swing.JComboBox<>();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel57 = new javax.swing.JPanel();
        jScrollPane31 = new javax.swing.JScrollPane();
        jTable25 = new javax.swing.JTable();
        jPanel58 = new javax.swing.JPanel();
        jScrollPane32 = new javax.swing.JScrollPane();
        jTable26 = new javax.swing.JTable();
        jPanel59 = new javax.swing.JPanel();
        jScrollPane34 = new javax.swing.JScrollPane();
        jTable28 = new javax.swing.JTable();
        jScrollPane35 = new javax.swing.JScrollPane();
        jTable29 = new javax.swing.JTable();
        jButton38 = new javax.swing.JButton();
        jScrollPane36 = new javax.swing.JScrollPane();
        jTable30 = new javax.swing.JTable();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        gesHorasPanel = new javax.swing.JPanel();
        jPanel90 = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        jDateChooser13 = new com.toedter.calendar.JDateChooser();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jLabel184 = new javax.swing.JLabel();
        jScrollPane38 = new javax.swing.JScrollPane();
        jTable32 = new javax.swing.JTable();
        jButton93 = new javax.swing.JButton();
        jLabel185 = new javax.swing.JLabel();
        jPanel103 = new javax.swing.JPanel();
        jPanel104 = new javax.swing.JPanel();
        jDateChooser15 = new com.toedter.calendar.JDateChooser();
        jButton108 = new javax.swing.JButton();
        jButton109 = new javax.swing.JButton();
        jButton110 = new javax.swing.JButton();
        jScrollPane41 = new javax.swing.JScrollPane();
        jTable35 = new javax.swing.JTable();
        jButton111 = new javax.swing.JButton();
        jLabel191 = new javax.swing.JLabel();
        gesCampaniasPanel = new javax.swing.JPanel();
        jPanel92 = new javax.swing.JPanel();
        jPanel93 = new javax.swing.JPanel();
        jLabel186 = new javax.swing.JLabel();
        jDateChooser14 = new com.toedter.calendar.JDateChooser();
        jPanel94 = new javax.swing.JPanel();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jPanel95 = new javax.swing.JPanel();
        jRadioButton48 = new javax.swing.JRadioButton();
        jRadioButton49 = new javax.swing.JRadioButton();
        jLabel187 = new javax.swing.JLabel();
        jTextField172 = new javax.swing.JTextField();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton96 = new javax.swing.JButton();
        jPanel96 = new javax.swing.JPanel();
        jRadioButton50 = new javax.swing.JRadioButton();
        jRadioButton51 = new javax.swing.JRadioButton();
        jLabel188 = new javax.swing.JLabel();
        jTextField173 = new javax.swing.JTextField();
        jButton97 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        cargueCampaniasPanel = new javax.swing.JPanel();
        jPanel97 = new javax.swing.JPanel();
        jButton100 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jButton103 = new javax.swing.JButton();
        jButton104 = new javax.swing.JButton();
        jScrollPane39 = new javax.swing.JScrollPane();
        jTable33 = new javax.swing.JTable();
        jButton105 = new javax.swing.JButton();
        jScrollPane40 = new javax.swing.JScrollPane();
        jTable34 = new javax.swing.JTable();
        marcacionPanel = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTable20 = new javax.swing.JTable();
        jButton66 = new javax.swing.JButton();
        jTextField122 = new javax.swing.JTextField();
        gesCampaniasPPanel = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jLabel124 = new javax.swing.JLabel();
        jScrollPane30 = new javax.swing.JScrollPane();
        jTable24 = new javax.swing.JTable();
        consCampaniasPanel = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jComboBox11 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jScrollPane27 = new javax.swing.JScrollPane();
        jTable21 = new javax.swing.JTable();
        jButton67 = new javax.swing.JButton();
        jScrollPane28 = new javax.swing.JScrollPane();
        jTable22 = new javax.swing.JTable();
        guionPanel = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton77 = new javax.swing.JButton();
        jPanel85 = new javax.swing.JPanel();
        jRadioButton46 = new javax.swing.JRadioButton();
        jRadioButton47 = new javax.swing.JRadioButton();
        jLabel132 = new javax.swing.JLabel();
        jTextField130 = new javax.swing.JTextField();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jTextField131 = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton98 = new javax.swing.JButton();
        pedVirtualesPanel = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jScrollPane33 = new javax.swing.JScrollPane();
        jTable27 = new javax.swing.JTable();
        jButton85 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jButton86 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jComboBox13 = new javax.swing.JComboBox<>();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        cambioClaveItem.setText("Cambio de Clave");
        cambioClaveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioClaveItemActionPerformed(evt);
            }
        });
        popup.add(cambioClaveItem);

        soporteItem.setText("Soporte Técnico");
        soporteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soporteItemActionPerformed(evt);
            }
        });
        popup.add(soporteItem);

        acercaDeItem.setText("Acerca De");
        acercaDeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaDeItemActionPerformed(evt);
            }
        });
        popup.add(acercaDeItem);
        popup.add(jSeparator2);

        salirItem.setText("Salir");
        salirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirItemActionPerformed(evt);
            }
        });
        popup.add(salirItem);

        cmbZonaOperadorItem.setText("Cambiar Zona del Operador");
        cmbZonaOperadorItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbZonaOperadorItemActionPerformed(evt);
            }
        });
        popupMayoreo.add(cmbZonaOperadorItem);

        subirCampaniasItem.setText("Subir Archivo Campañas");
        subirCampaniasItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirCampaniasItemActionPerformed(evt);
            }
        });
        popupMayoreo.add(subirCampaniasItem);

        gestionTelevendedorItem.setText("Gestión del Televendedor");
        gestionTelevendedorItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionTelevendedorItemActionPerformed(evt);
            }
        });
        popupMayoreo.add(gestionTelevendedorItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SerCliente - Mayoreo");
        setBackground(new java.awt.Color(245, 245, 245));
        setResizable(false);

        jPanel20.setBackground(new java.awt.Color(245, 245, 245));

        opcionesPane.setBackground(new java.awt.Color(245, 245, 245));
        opcionesPane.setToolTipText("");
        opcionesPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opcionesPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opcionesPaneStateChanged(evt);
            }
        });
        opcionesPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcionesPaneMouseClicked(evt);
            }
        });

        servicioClienteOpcionesPanel.setBackground(new java.awt.Color(245, 245, 245));

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        teleMercadeoL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teleMercadeoL.setText("Tele Mercadeo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teleMercadeoL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(teleMercadeoIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(teleMercadeoIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teleMercadeoL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.setPreferredSize(new java.awt.Dimension(88, 96));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        callInL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        callInL.setText("Call Center InBound");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(callInIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(callInL, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(callInIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(callInL)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel70.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel70.setPreferredSize(new java.awt.Dimension(88, 96));
        jPanel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel70MouseClicked(evt);
            }
        });

        callInL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        callInL1.setText("Pedidos InBound");

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pedInIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(callInL1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(pedInIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(callInL1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout servicioClienteOpcionesPanelLayout = new javax.swing.GroupLayout(servicioClienteOpcionesPanel);
        servicioClienteOpcionesPanel.setLayout(servicioClienteOpcionesPanelLayout);
        servicioClienteOpcionesPanelLayout.setHorizontalGroup(
            servicioClienteOpcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicioClienteOpcionesPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1322, Short.MAX_VALUE))
        );
        servicioClienteOpcionesPanelLayout.setVerticalGroup(
            servicioClienteOpcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        opcionesPane.addTab("Servicio al Cliente", servicioClienteOpcionesPanel);

        estadisticasPanel.setBackground(new java.awt.Color(245, 245, 245));

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        gesClientesL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gesClientesL.setText("Ges Clientes");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gesClientesL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(gesClientesIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(gesClientesIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gesClientesL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.setPreferredSize(new java.awt.Dimension(88, 96));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        gesOperadorL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gesOperadorL.setText("Ges Operador");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(gesOperadorIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(gesOperadorL, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(gesOperadorIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gesOperadorL)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel98.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel98.setPreferredSize(new java.awt.Dimension(88, 96));
        jPanel98.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel98MouseClicked(evt);
            }
        });

        gesHorasL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gesHorasL.setText("Ges Horas");

        javax.swing.GroupLayout jPanel98Layout = new javax.swing.GroupLayout(jPanel98);
        jPanel98.setLayout(jPanel98Layout);
        jPanel98Layout.setHorizontalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel98Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(gesHorasIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(gesHorasL, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel98Layout.setVerticalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel98Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(gesHorasIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gesHorasL)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.setPreferredSize(new java.awt.Dimension(88, 96));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        gesCampaniasL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gesCampaniasL.setText("Ges Campañas");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(gesCampaniasIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(gesCampaniasL, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(gesCampaniasIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gesCampaniasL)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel99.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel99.setPreferredSize(new java.awt.Dimension(88, 96));
        jPanel99.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel99MouseClicked(evt);
            }
        });

        cargueCampaniasL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cargueCampaniasL.setText("Cargue Cmp");

        javax.swing.GroupLayout jPanel99Layout = new javax.swing.GroupLayout(jPanel99);
        jPanel99.setLayout(jPanel99Layout);
        jPanel99Layout.setHorizontalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel99Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cargueCampaniasIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(cargueCampaniasL, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel99Layout.setVerticalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel99Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(cargueCampaniasIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cargueCampaniasL)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout estadisticasPanelLayout = new javax.swing.GroupLayout(estadisticasPanel);
        estadisticasPanel.setLayout(estadisticasPanelLayout);
        estadisticasPanelLayout.setHorizontalGroup(
            estadisticasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estadisticasPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1134, Short.MAX_VALUE))
        );
        estadisticasPanelLayout.setVerticalGroup(
            estadisticasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(estadisticasPanelLayout.createSequentialGroup()
                .addGroup(estadisticasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        opcionesPane.addTab("Estadísticas  ", estadisticasPanel);

        jPanel7.setBackground(new java.awt.Color(245, 245, 245));

        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });

        marcacionL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marcacionL.setText("Marcación");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(marcacionL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(marcacionIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(marcacionIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marcacionL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel11.setPreferredSize(new java.awt.Dimension(88, 96));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });

        gesCampaniasPL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gesCampaniasPL.setText("Ges Campañas");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(gesCampaniasPIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(gesCampaniasPL, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(gesCampaniasPIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gesCampaniasPL)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel100.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel100.setPreferredSize(new java.awt.Dimension(88, 96));
        jPanel100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel100MouseClicked(evt);
            }
        });

        consCampaniasL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        consCampaniasL.setText("Cons Campañas");

        javax.swing.GroupLayout jPanel100Layout = new javax.swing.GroupLayout(jPanel100);
        jPanel100.setLayout(jPanel100Layout);
        jPanel100Layout.setHorizontalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel100Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(consCampaniasIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(consCampaniasL, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel100Layout.setVerticalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel100Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(consCampaniasIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consCampaniasL)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.setPreferredSize(new java.awt.Dimension(88, 96));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });

        guionL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionL.setText("Guión");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(guionIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(guionL, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(guionIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guionL)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel101.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel101.setPreferredSize(new java.awt.Dimension(88, 96));
        jPanel101.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel101MouseClicked(evt);
            }
        });

        pedVirtualesL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pedVirtualesL.setText("Ped Virtuales");

        javax.swing.GroupLayout jPanel101Layout = new javax.swing.GroupLayout(jPanel101);
        jPanel101.setLayout(jPanel101Layout);
        jPanel101Layout.setHorizontalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel101Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pedVirtualesIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(pedVirtualesL, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel101Layout.setVerticalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel101Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(pedVirtualesIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pedVirtualesL)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.setMinimumSize(new java.awt.Dimension(88, 96));
        jPanel15.setPreferredSize(new java.awt.Dimension(88, 96));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel15MouseClicked(evt);
            }
        });

        mayoreoL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mayoreoL.setText("Mayoreo");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(mayoreoIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(mayoreoL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(mayoreoIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mayoreoL)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1040, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        opcionesPane.addTab("Procesos Especiales  ", jPanel7);

        pollitoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pollitoBtnMouseClicked(evt);
            }
        });
        pollitoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pollitoBtnActionPerformed(evt);
            }
        });

        opciones2Pane.setBackground(new java.awt.Color(245, 245, 245));

        inicioPanel.setBackground(new java.awt.Color(245, 245, 245));

        jPanel26.setBackground(new java.awt.Color(245, 245, 245));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel26.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel26.setText("Usuario: XXXXXXXX");

        jPanel27.setBackground(new java.awt.Color(174, 109, 44));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        presentacionPanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sistema Integrado Distribuidoras");

        jLabel11.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Módulo Call Center");

        fechaHoyTxt.setEditable(false);
        fechaHoyTxt.setBackground(new java.awt.Color(0, 0, 0));
        fechaHoyTxt.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        fechaHoyTxt.setForeground(new java.awt.Color(255, 255, 255));
        fechaHoyTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fechaHoyTxt.setText("dd/MM/yyyy");

        jLabel12.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha Del Proceso");

        jLabel25.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("MAYOREO");

        javax.swing.GroupLayout presentacionPanelLayout = new javax.swing.GroupLayout(presentacionPanel);
        presentacionPanel.setLayout(presentacionPanelLayout);
        presentacionPanelLayout.setHorizontalGroup(
            presentacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(presentacionPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(presentacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, presentacionPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, presentacionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(presentacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, presentacionPanelLayout.createSequentialGroup()
                        .addComponent(macPolloN1L, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, presentacionPanelLayout.createSequentialGroup()
                        .addGroup(presentacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fechaHoyTxt)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(152, 152, 152))))
        );
        presentacionPanelLayout.setVerticalGroup(
            presentacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, presentacionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaHoyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGap(16, 16, 16)
                .addComponent(macPolloN1L, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(60, 60, 60))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setText("GIRON - D001");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(presentacionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(presentacionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addContainerGap(1382, Short.MAX_VALUE))
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel26Layout.createSequentialGroup()
                    .addGap(520, 520, 520)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(520, Short.MAX_VALUE)))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addContainerGap(732, Short.MAX_VALUE))
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel26Layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(119, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout inicioPanelLayout = new javax.swing.GroupLayout(inicioPanel);
        inicioPanel.setLayout(inicioPanelLayout);
        inicioPanelLayout.setHorizontalGroup(
            inicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        inicioPanelLayout.setVerticalGroup(
            inicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        opciones2Pane.addTab("Inicio", inicioPanel);

        teleMercadeoPanel.setBackground(new java.awt.Color(245, 245, 245));

        clientesTMPanel1.setBackground(new java.awt.Color(245, 245, 245));
        clientesTMPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        fechaCampaniaPanel1.setBackground(new java.awt.Color(245, 245, 245));
        fechaCampaniaPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de Campaña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        fechaCampaniaTxt.setEditable(false);
        fechaCampaniaTxt.setBackground(new java.awt.Color(255, 255, 153));
        fechaCampaniaTxt.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        fechaCampaniaTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fechaCampaniaTxt.setText("dd/MM/yyyy");

        javax.swing.GroupLayout fechaCampaniaPanel1Layout = new javax.swing.GroupLayout(fechaCampaniaPanel1);
        fechaCampaniaPanel1.setLayout(fechaCampaniaPanel1Layout);
        fechaCampaniaPanel1Layout.setHorizontalGroup(
            fechaCampaniaPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fechaCampaniaPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(fechaCampaniaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        fechaCampaniaPanel1Layout.setVerticalGroup(
            fechaCampaniaPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fechaCampaniaPanel1Layout.createSequentialGroup()
                .addComponent(fechaCampaniaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        tipoMarcacionPanel1.setBackground(new java.awt.Color(245, 245, 245));
        tipoMarcacionPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Marcación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        tipoMarcacionTxt1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        tipoMarcacionTxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tipoMarcacionTxt1.setText("Automática");

        javax.swing.GroupLayout tipoMarcacionPanel1Layout = new javax.swing.GroupLayout(tipoMarcacionPanel1);
        tipoMarcacionPanel1.setLayout(tipoMarcacionPanel1Layout);
        tipoMarcacionPanel1Layout.setHorizontalGroup(
            tipoMarcacionPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tipoMarcacionPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tipoMarcacionTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        tipoMarcacionPanel1Layout.setVerticalGroup(
            tipoMarcacionPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tipoMarcacionPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipoMarcacionTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        marcacionAutBtn1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        marcacionAutBtn1.setText("Iniciar Marcación Autmática");

        retomarGestionBtn1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        retomarGestionBtn1.setText("Retomar Gestión");
        retomarGestionBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retomarGestionBtn1ActionPerformed(evt);
            }
        });

        jScrollPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes Pendientes Por Llamar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        clientesPorLlamarTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código SAP", "Teléfono", "Cliente", "Nombre Cliente", "Pto Vta", "Almacén", "Dirección", "Barrio", "Horario Llamada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientesPorLlamarTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesPorLlamarTable1MouseClicked(evt);
            }
        });
        clientesPorLlamarTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clientesPorLlamarTable1KeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(clientesPorLlamarTable1);

        jScrollPane7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes Por Llamar Más Tarde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        clientesLlamarMasTardeTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código SAP", "Teléfono", "Cliente", "Nombre Cliente", "Pto Vta", "Almacén", "Dirección", "Barrio", "Horario Llamada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientesLlamarMasTardeTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesLlamarMasTardeTable1MouseClicked(evt);
            }
        });
        clientesLlamarMasTardeTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clientesLlamarMasTardeTable1KeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(clientesLlamarMasTardeTable1);

        crearClienteBtn1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        crearClienteBtn1.setText("Agregar Cliente");
        crearClienteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearClienteBtn1ActionPerformed(evt);
            }
        });

        cancelarLlamadaBtn1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        cancelarLlamadaBtn1.setText("Cancelar Llamada");
        cancelarLlamadaBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarLlamadaBtn1ActionPerformed(evt);
            }
        });

        jPanel28.setBackground(new java.awt.Color(245, 245, 245));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Por Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel5.setText("Pedidos Realizados");

        jLabel6.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel6.setText("Llamadas Realizadas");

        jTextField10.setBackground(new java.awt.Color(255, 255, 153));
        jTextField10.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("0");

        jTextField14.setBackground(new java.awt.Color(255, 255, 153));
        jTextField14.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("0");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField14, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jTextField10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel67.setBackground(new java.awt.Color(245, 245, 245));
        jPanel67.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consolidado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jTextField15.setBackground(new java.awt.Color(255, 255, 153));
        jTextField15.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("0");

        jLabel27.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel27.setText("Pedidos Realizados");

        jLabel28.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel28.setText("Llamadas Realizadas");

        jTextField16.setBackground(new java.awt.Color(255, 255, 153));
        jTextField16.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("0");

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField15, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jTextField16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel69.setBackground(new java.awt.Color(245, 245, 245));
        jPanel69.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Por Llamar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel29.setText("Por Usuario");

        jTextField17.setBackground(new java.awt.Color(255, 255, 153));
        jTextField17.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("0");

        jLabel30.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel30.setText("Consolidado");

        jTextField18.setBackground(new java.awt.Color(255, 255, 153));
        jTextField18.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("0");

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField17, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jTextField18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        retomarGestionBtn3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        retomarGestionBtn3.setText("Envía Gestiones");
        retomarGestionBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retomarGestionBtn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout clientesTMPanel1Layout = new javax.swing.GroupLayout(clientesTMPanel1);
        clientesTMPanel1.setLayout(clientesTMPanel1Layout);
        clientesTMPanel1Layout.setHorizontalGroup(
            clientesTMPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesTMPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientesTMPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientesTMPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(clientesTMPanel1Layout.createSequentialGroup()
                        .addGroup(clientesTMPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(clientesTMPanel1Layout.createSequentialGroup()
                                .addComponent(fechaCampaniaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(retomarGestionBtn3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(retomarGestionBtn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(marcacionAutBtn1)
                                .addGap(28, 28, 28)
                                .addComponent(tipoMarcacionPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(crearClienteBtn1)
                                .addGap(27, 27, 27)
                                .addComponent(cancelarLlamadaBtn1)
                                .addGap(0, 240, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        clientesTMPanel1Layout.setVerticalGroup(
            clientesTMPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesTMPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientesTMPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoMarcacionPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaCampaniaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(clientesTMPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(clientesTMPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crearClienteBtn1)
                            .addComponent(cancelarLlamadaBtn1)))
                    .addGroup(clientesTMPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(clientesTMPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(marcacionAutBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(retomarGestionBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(retomarGestionBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(clientesTMPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel69, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel67, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout teleMercadeoPanelLayout = new javax.swing.GroupLayout(teleMercadeoPanel);
        teleMercadeoPanel.setLayout(teleMercadeoPanelLayout);
        teleMercadeoPanelLayout.setHorizontalGroup(
            teleMercadeoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teleMercadeoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clientesTMPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
        );
        teleMercadeoPanelLayout.setVerticalGroup(
            teleMercadeoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teleMercadeoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientesTMPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        opciones2Pane.addTab("Tele Mercadeo", teleMercadeoPanel);

        callInPanel.setBackground(new java.awt.Color(245, 245, 245));

        callInPanel4.setBackground(new java.awt.Color(245, 245, 245));
        callInPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel71.setBackground(new java.awt.Color(245, 245, 245));
        jPanel71.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jRadioButton36.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton36.setText("WhatsApp");

        jRadioButton37.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton37.setText("Llamada Entrante");

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addComponent(jRadioButton36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton37))
        );

        jPanel73.setBackground(new java.awt.Color(245, 245, 245));
        jPanel73.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jRadioButton38.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton38.setText("Domicilio Mostrador");

        jRadioButton39.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton39.setText("Cliente Identificado");
        jRadioButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton39ActionPerformed(evt);
            }
        });

        jRadioButton40.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton40.setText("Empleados");
        jRadioButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton40ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton38)
                    .addComponent(jRadioButton39)
                    .addComponent(jRadioButton40))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addComponent(jRadioButton38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton40))
        );

        jPanel74.setBackground(new java.awt.Color(245, 245, 245));
        jPanel74.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente Identificado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jButton68.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton68.setText("Buscar Cliente");
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });

        jButton69.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton69.setText("Crear Cliente");
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton69)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton68)
                    .addComponent(jButton69))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel75.setBackground(new java.awt.Color(245, 245, 245));
        jPanel75.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Domicilio Mostrador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jLabel125.setText("Nombre");

        jTextField117.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField117.setText("Camilo Andres");

        jLabel127.setText("Apellido");

        jTextField118.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField118.setText("Sanabria S");

        jLabel128.setText("Teléfono");

        jTextField121.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField121.setText("1234567890");

        jLabel129.setText("Dirección");

        jTextField123.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField123.setText("CR 4D # 12 -24");

        jButton70.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton70.setText("Crear Pedido");

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel75Layout.createSequentialGroup()
                        .addComponent(jLabel125)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField117, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel75Layout.createSequentialGroup()
                        .addComponent(jLabel128)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField121)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel75Layout.createSequentialGroup()
                        .addComponent(jLabel127)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField118))
                    .addGroup(jPanel75Layout.createSequentialGroup()
                        .addComponent(jLabel129)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField123, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton70)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125)
                    .addComponent(jTextField117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel127)
                    .addComponent(jTextField118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel128)
                    .addComponent(jTextField121, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel129)
                    .addComponent(jTextField123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton70))
                .addContainerGap())
        );

        jPanel76.setBackground(new java.awt.Color(245, 245, 245));
        jPanel76.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Principales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jLabel131.setText("Almacén");

        jTextField124.setEditable(false);
        jTextField124.setBackground(new java.awt.Color(255, 255, 153));
        jTextField124.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField124.setText("ALM PRINCIPAL");

        jLabel134.setText("Teléfonos");

        jTextField125.setEditable(false);
        jTextField125.setBackground(new java.awt.Color(255, 255, 153));
        jTextField125.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField125.setText("1234567890 - 1234567");

        jLabel135.setText("Cliente");

        jTextField126.setEditable(false);
        jTextField126.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField126.setText("123456");

        jTextField127.setEditable(false);
        jTextField127.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField127.setText("02");

        jTextField128.setEditable(false);
        jTextField128.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField128.setText("Camilo Andrés Sanabria S");
        jTextField128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField128ActionPerformed(evt);
            }
        });

        jLabel136.setText("Id Cliente");

        jTextField129.setEditable(false);
        jTextField129.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField129.setText("1234");

        jTextField132.setEditable(false);
        jTextField132.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField132.setText("CR 4D # 12 -24");

        jLabel138.setText("Dirección");

        jTextField133.setEditable(false);
        jTextField133.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField133.setText("20");

        jLabel145.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel145.setText("Fecha Entrega");

        jLabel146.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel146.setText("Horario Entrega");

        jLabel147.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel147.setText("A");

        jLabel148.setText("Teléfono");

        jTextField137.setEditable(false);
        jTextField137.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField137.setText("1234567890");

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel76Layout.createSequentialGroup()
                        .addComponent(jLabel131)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField124, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel134)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField125, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel145)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel146)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jSpinField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel147)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jSpinField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel76Layout.createSequentialGroup()
                        .addComponent(jLabel135)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField126, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField127, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField128, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel136)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField129, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel138)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField132, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField133, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel148)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField137, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel135)
                        .addComponent(jTextField126, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField127, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField128, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel136)
                        .addComponent(jTextField129, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel138)
                        .addComponent(jTextField132, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField133, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel148)
                        .addComponent(jTextField137, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel145)
                        .addComponent(jLabel146))
                    .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel131)
                        .addComponent(jTextField124, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel134)
                        .addComponent(jTextField125, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel147)
                    .addComponent(jSpinField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel77.setBackground(new java.awt.Color(245, 245, 245));
        jPanel77.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Producto", "Descripción", "Fac Ult 8", "Med", "Precio Unit", "Uni Ped", "Kilos", "Dcto", "IVA", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable14MouseClicked(evt);
            }
        });
        jScrollPane20.setViewportView(jTable14);

        jLabel149.setText("Total Unidades");

        jTextField138.setEditable(false);
        jTextField138.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField138.setText("0");

        jLabel150.setText("Total Kilos");

        jTextField139.setEditable(false);
        jTextField139.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField139.setText("0");

        jLabel151.setText("Existencias");

        jTextField140.setEditable(false);
        jTextField140.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField140.setText("0");

        jLabel152.setText("Pprom");

        jTextField141.setEditable(false);
        jTextField141.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField141.setText("0");

        jLabel153.setText("Domicilio");

        jTextField142.setEditable(false);
        jTextField142.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField142.setText("0");

        jLabel154.setText("Total Bruto");

        jTextField143.setEditable(false);
        jTextField143.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField143.setText("0");

        jLabel155.setText("- Descuentos");

        jTextField144.setEditable(false);
        jTextField144.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField144.setText("0");

        jTextField145.setEditable(false);
        jTextField145.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField145.setText("0");

        jLabel156.setText("Total Pedido");

        jTextField146.setEditable(false);
        jTextField146.setBackground(new java.awt.Color(255, 255, 153));
        jTextField146.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField146.setText("0");
        jTextField146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField146ActionPerformed(evt);
            }
        });

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Pago", "Efectivo", "Pago en Linea", "Datáfono" }));

        jButton71.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton71.setText("Guardar");

        jButton72.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton72.setText("Borrar");

        jCheckBox9.setForeground(new java.awt.Color(51, 51, 255));
        jCheckBox9.setText("Llamar cliente antes de enviar");

        jLabel157.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel157.setText("Observación Pedido");

        jLabel158.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel158.setText("Observación Cliente");

        jButton73.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton73.setText("Pedidos Trasmitidos");
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });

        jButton74.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton74.setText("Ofertas y Descuentos");
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });

        jButton75.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton75.setText("Pedidos Virtuales");
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });

        jCheckBox10.setBackground(new java.awt.Color(245, 245, 245));
        jCheckBox10.setForeground(new java.awt.Color(255, 51, 51));
        jCheckBox10.setText("Recoge en tienda");

        jLabel159.setText("IVA");

        jButton76.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton76.setText("Cupo Empleado");
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane20)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel77Layout.createSequentialGroup()
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox9)
                            .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton73, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton74, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel77Layout.createSequentialGroup()
                                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel157)
                                    .addComponent(jLabel158)
                                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox10)
                                    .addGroup(jPanel77Layout.createSequentialGroup()
                                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel77Layout.createSequentialGroup()
                                                .addComponent(jLabel149)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField138, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel77Layout.createSequentialGroup()
                                                .addComponent(jLabel150)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField139, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel151)
                                            .addComponent(jLabel152))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel77Layout.createSequentialGroup()
                                                .addComponent(jTextField140, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel77Layout.createSequentialGroup()
                                                .addComponent(jTextField141, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel77Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton71)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton72)))
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel77Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel154))
                            .addGroup(jPanel77Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel155)
                                    .addComponent(jLabel159)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel77Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel153, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel156, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField143, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(jTextField144, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField145)
                            .addComponent(jTextField142)
                            .addComponent(jTextField146))
                        .addGap(67, 67, 67)))
                .addContainerGap())
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel77Layout.createSequentialGroup()
                        .addComponent(jLabel158)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel157)
                            .addGroup(jPanel77Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel77Layout.createSequentialGroup()
                        .addComponent(jCheckBox9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton75))
                    .addGroup(jPanel77Layout.createSequentialGroup()
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel77Layout.createSequentialGroup()
                                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel154)
                                    .addComponent(jTextField143, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField144, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel155)
                                    .addComponent(jTextField141, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel152))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField145, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel159)))
                            .addGroup(jPanel77Layout.createSequentialGroup()
                                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel149)
                                    .addComponent(jTextField138, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel150)
                                    .addComponent(jTextField139, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel151)
                                .addComponent(jTextField140, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField142, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel153)
                            .addComponent(jCheckBox10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField146, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel156)
                            .addComponent(jButton71)
                            .addComponent(jButton72)))
                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout callInPanel4Layout = new javax.swing.GroupLayout(callInPanel4);
        callInPanel4.setLayout(callInPanel4Layout);
        callInPanel4Layout.setHorizontalGroup(
            callInPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(callInPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(callInPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(callInPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(callInPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        callInPanel4Layout.setVerticalGroup(
            callInPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(callInPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(callInPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout callInPanelLayout = new javax.swing.GroupLayout(callInPanel);
        callInPanel.setLayout(callInPanelLayout);
        callInPanelLayout.setHorizontalGroup(
            callInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, callInPanelLayout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addComponent(callInPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        callInPanelLayout.setVerticalGroup(
            callInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(callInPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(callInPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        opciones2Pane.addTab("Call Center InBound", callInPanel);

        pedInPanel.setBackground(new java.awt.Color(245, 245, 245));

        jPanel87.setBackground(new java.awt.Color(245, 245, 245));
        jPanel87.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel89.setBackground(new java.awt.Color(245, 245, 245));
        jPanel89.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jRadioButton9.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton9.setText("WhatsApp");

        jRadioButton52.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton52.setText("Llamada Entrante");

        javax.swing.GroupLayout jPanel89Layout = new javax.swing.GroupLayout(jPanel89);
        jPanel89.setLayout(jPanel89Layout);
        jPanel89Layout.setHorizontalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel89Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton52)
                    .addComponent(jRadioButton9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel89Layout.setVerticalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel89Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jRadioButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton52)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton106.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton106.setText("Buscar Cliente");

        jPanel102.setBackground(new java.awt.Color(245, 245, 245));
        jPanel102.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente Identificado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jLabel137.setText("Código SAP");

        jLabel139.setText("Zona SAP");

        jLabel140.setText("Nombre");

        jLabel141.setText("Distribuidora");

        jTextField174.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField174.setText("12345678");

        jTextField175.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField175.setText("1234");

        jTextField176.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField176.setText("XXXXXXXXXXXXXXXXXX");

        jTextField177.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField177.setText("XXXXXXXXXXX");

        jButton107.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton107.setText("Crear Pedido");

        javax.swing.GroupLayout jPanel102Layout = new javax.swing.GroupLayout(jPanel102);
        jPanel102.setLayout(jPanel102Layout);
        jPanel102Layout.setHorizontalGroup(
            jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel102Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel102Layout.createSequentialGroup()
                        .addGroup(jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel102Layout.createSequentialGroup()
                                .addComponent(jLabel139)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField175))
                            .addGroup(jPanel102Layout.createSequentialGroup()
                                .addComponent(jLabel137)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField174)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel102Layout.createSequentialGroup()
                                .addComponent(jLabel141)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField177, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel102Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel140)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField176, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton107))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel102Layout.setVerticalGroup(
            jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel102Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel137)
                    .addComponent(jLabel140)
                    .addComponent(jTextField174, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField176, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel139)
                    .addComponent(jLabel141)
                    .addComponent(jTextField175, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField177, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton107)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel87Layout.createSequentialGroup()
                        .addComponent(jPanel102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel87Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton106)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton106))
                .addGap(18, 18, 18)
                .addComponent(jPanel102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pedInPanelLayout = new javax.swing.GroupLayout(pedInPanel);
        pedInPanel.setLayout(pedInPanelLayout);
        pedInPanelLayout.setHorizontalGroup(
            pedInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pedInPanelLayout.createSequentialGroup()
                .addGap(598, 598, 598)
                .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(600, Short.MAX_VALUE))
        );
        pedInPanelLayout.setVerticalGroup(
            pedInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pedInPanelLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(376, Short.MAX_VALUE))
        );

        opciones2Pane.addTab("Pedidos InBound", pedInPanel);

        gesClientesPanel.setBackground(new java.awt.Color(245, 245, 245));

        jPanel30.setBackground(new java.awt.Color(245, 245, 245));
        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel47.setBackground(new java.awt.Color(245, 245, 245));
        jPanel47.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha Desde - Hasta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDateChooser10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel48.setBackground(new java.awt.Color(245, 245, 245));
        jPanel48.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Almacenes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jRadioButton21.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton21.setText("Todos");

        jRadioButton22.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton22.setText("Uno");

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Almacén1", "Almacén2", "Almacén3", "Almacén4" }));

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox8, 0, 234, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton21)
                    .addComponent(jRadioButton22)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel49.setBackground(new java.awt.Color(245, 245, 245));
        jPanel49.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campañas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jRadioButton23.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton23.setText("Todos");

        jRadioButton24.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton24.setText("Una");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CmbCampañas" }));

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox9, 0, 229, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton23)
                    .addComponent(jRadioButton24)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton28.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton28.setText("Exportar");

        jButton29.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton29.setText("Zonas");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton31.setText("Marcación");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton32.setText("Campañas");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton33.setText("Eliminar C");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jTabbedPane3.setBackground(new java.awt.Color(245, 245, 245));

        jPanel50.setBackground(new java.awt.Color(245, 245, 245));

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane18.setViewportView(jTable12);

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Gestión Campañas", jPanel50);

        jPanel51.setBackground(new java.awt.Color(245, 245, 245));

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane19.setViewportView(jTable13);

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Estado Campañas", jPanel51);

        jPanel52.setBackground(new java.awt.Color(245, 245, 245));

        jTable16.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane22.setViewportView(jTable16);

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Gestión Por Centro De Utilidad", jPanel52);

        jScrollPane29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestión Por Indicadores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jTable23.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane29.setViewportView(jTable23);

        jButton34.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton34.setText("Consultar");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addComponent(jButton33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton31))
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jButton29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton28)))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton34)
                            .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton31)
                            .addComponent(jButton32)
                            .addComponent(jButton33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton29)
                            .addComponent(jButton28)))
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton34))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane3)))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout gesClientesPanelLayout = new javax.swing.GroupLayout(gesClientesPanel);
        gesClientesPanel.setLayout(gesClientesPanelLayout);
        gesClientesPanelLayout.setHorizontalGroup(
            gesClientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesClientesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        gesClientesPanelLayout.setVerticalGroup(
            gesClientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesClientesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        opciones2Pane.addTab("Gestión de Clientes", gesClientesPanel);

        gesOperadorPanel.setBackground(new java.awt.Color(245, 245, 245));

        jPanel53.setBackground(new java.awt.Color(245, 245, 245));
        jPanel53.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel54.setBackground(new java.awt.Color(245, 245, 245));
        jPanel54.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha Desde - Hasta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDateChooser12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDateChooser11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel54Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel55.setBackground(new java.awt.Color(245, 245, 245));
        jPanel55.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Almacenes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jRadioButton25.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton25.setText("Todos");

        jRadioButton26.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton26.setText("Uno");

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Almacén1", "Almacén2", "Almacén3", "Almacén4" }));

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox10, 0, 234, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton25)
                    .addComponent(jRadioButton26)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel56.setBackground(new java.awt.Color(245, 245, 245));
        jPanel56.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campañas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jRadioButton27.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton27.setText("Todos");

        jRadioButton28.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton28.setText("Una");

        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CmbCampañas" }));

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox17, 0, 229, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton27)
                    .addComponent(jRadioButton28)
                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jButton35.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton35.setText("Exportar");

        jButton36.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton36.setText("Zonas");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton37.setText("Marcación");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jTabbedPane4.setBackground(new java.awt.Color(245, 245, 245));

        jPanel57.setBackground(new java.awt.Color(245, 245, 245));

        jTable25.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane31.setViewportView(jTable25);

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane31, javax.swing.GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane31, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Gestión Campañas", jPanel57);

        jPanel58.setBackground(new java.awt.Color(245, 245, 245));

        jTable26.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane32.setViewportView(jTable26);

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane32, javax.swing.GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane32, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Estado Campañas", jPanel58);

        jPanel59.setBackground(new java.awt.Color(245, 245, 245));

        jTable28.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane34.setViewportView(jTable28);

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane34, javax.swing.GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane34, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Gestión Por Centro De Utilidad", jPanel59);

        jScrollPane35.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pedidos Por Categoría", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jTable29.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane35.setViewportView(jTable29);

        jButton38.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton38.setText("Consultar");

        jScrollPane36.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestión Por Indicadores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jTable30.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane36.setViewportView(jTable30);

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 255));
        jLabel71.setText("Total Clientes A Llamar");

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 0, 255));
        jLabel72.setText("Promedio De Llamadas Por Operador");

        jTextField67.setBackground(new java.awt.Color(255, 255, 153));
        jTextField67.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField67.setText("123");

        jTextField68.setBackground(new java.awt.Color(255, 255, 153));
        jTextField68.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField68.setText("123");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel53Layout.createSequentialGroup()
                                .addComponent(jButton37)
                                .addGap(18, 18, 18)
                                .addComponent(jButton36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton35))
                            .addGroup(jPanel53Layout.createSequentialGroup()
                                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel72)
                                    .addComponent(jLabel71))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField68)
                                    .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1066, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane35)
                                .addComponent(jScrollPane36))
                            .addComponent(jButton38, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel53Layout.createSequentialGroup()
                                .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(9, 9, 9)
                        .addComponent(jTabbedPane4))
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel53Layout.createSequentialGroup()
                                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton35)
                                    .addComponent(jButton36)
                                    .addComponent(jButton37))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel71)
                                    .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel72)
                                    .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton38)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout gesOperadorPanelLayout = new javax.swing.GroupLayout(gesOperadorPanel);
        gesOperadorPanel.setLayout(gesOperadorPanelLayout);
        gesOperadorPanelLayout.setHorizontalGroup(
            gesOperadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesOperadorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        gesOperadorPanelLayout.setVerticalGroup(
            gesOperadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesOperadorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        opciones2Pane.addTab("Gestión por Operador", gesOperadorPanel);

        gesHorasPanel.setBackground(new java.awt.Color(245, 245, 245));

        jPanel90.setBackground(new java.awt.Color(245, 245, 245));
        jPanel90.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel91.setBackground(new java.awt.Color(245, 245, 245));
        jPanel91.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel91Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDateChooser13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel91Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDateChooser13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton90.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton90.setText("Exportar");

        jButton91.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton91.setText("Zonas");

        jButton92.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton92.setText("Marcación");

        jLabel184.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel184.setText("Gestión Por Hora");

        jTable32.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane38.setViewportView(jTable32);

        jButton93.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton93.setText("Consultar");

        jLabel185.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel185.setForeground(new java.awt.Color(255, 51, 51));
        jLabel185.setText("ESTADÍSTICAS: PEDIDOS / NÚMERO DE LLAMADAS");

        jPanel103.setBackground(new java.awt.Color(245, 245, 245));
        jPanel103.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel104.setBackground(new java.awt.Color(245, 245, 245));
        jPanel104.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N

        javax.swing.GroupLayout jPanel104Layout = new javax.swing.GroupLayout(jPanel104);
        jPanel104.setLayout(jPanel104Layout);
        jPanel104Layout.setHorizontalGroup(
            jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel104Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDateChooser15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel104Layout.setVerticalGroup(
            jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel104Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDateChooser15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton108.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton108.setText("Exportar");

        jButton109.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton109.setText("Zonas");
        jButton109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton109ActionPerformed(evt);
            }
        });

        jButton110.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton110.setText("Marcación");
        jButton110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton110ActionPerformed(evt);
            }
        });

        jScrollPane41.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestión Por Hora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jTable35.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane41.setViewportView(jTable35);

        jButton111.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton111.setText("Consultar");

        jLabel191.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel191.setForeground(new java.awt.Color(255, 51, 51));
        jLabel191.setText("ESTADÍSTICAS: PEDIDOS / NÚMERO DE LLAMADAS");

        javax.swing.GroupLayout jPanel103Layout = new javax.swing.GroupLayout(jPanel103);
        jPanel103.setLayout(jPanel103Layout);
        jPanel103Layout.setHorizontalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel103Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel103Layout.createSequentialGroup()
                        .addComponent(jPanel104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel191)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel103Layout.createSequentialGroup()
                        .addGroup(jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel103Layout.createSequentialGroup()
                                .addComponent(jButton110)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton109)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton111)
                                .addGap(18, 18, 18)
                                .addComponent(jButton108))
                            .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 32, Short.MAX_VALUE))))
        );
        jPanel103Layout.setVerticalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel103Layout.createSequentialGroup()
                .addGroup(jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel103Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel103Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel191)))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton109)
                    .addComponent(jButton110)
                    .addComponent(jButton108)
                    .addComponent(jButton111))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel90Layout.createSequentialGroup()
                        .addComponent(jPanel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel185)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel90Layout.createSequentialGroup()
                        .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel90Layout.createSequentialGroup()
                                .addGap(422, 422, 422)
                                .addComponent(jLabel184))
                            .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel90Layout.createSequentialGroup()
                                    .addComponent(jButton92)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton91)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton93)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton90))
                                .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 56, Short.MAX_VALUE))))
            .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel90Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel90Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel90Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel185)))
                .addGap(11, 11, 11)
                .addComponent(jLabel184)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton91)
                    .addComponent(jButton92)
                    .addComponent(jButton90)
                    .addComponent(jButton93))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel90Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout gesHorasPanelLayout = new javax.swing.GroupLayout(gesHorasPanel);
        gesHorasPanel.setLayout(gesHorasPanelLayout);
        gesHorasPanelLayout.setHorizontalGroup(
            gesHorasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesHorasPanelLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(298, Short.MAX_VALUE))
        );
        gesHorasPanelLayout.setVerticalGroup(
            gesHorasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesHorasPanelLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        opciones2Pane.addTab("Gestión por Horas", gesHorasPanel);

        gesCampaniasPanel.setBackground(new java.awt.Color(245, 245, 245));

        jPanel92.setBackground(new java.awt.Color(245, 245, 245));
        jPanel92.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel93.setBackground(new java.awt.Color(245, 245, 245));
        jPanel93.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N

        jLabel186.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel186.setText("Fecha de Campaña");

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel93Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel186)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel93Layout.createSequentialGroup()
                .addGroup(jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel186)
                    .addComponent(jDateChooser14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel94.setBackground(new java.awt.Color(245, 245, 245));
        jPanel94.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jRadioButton44.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton44.setText("Histórico");

        jRadioButton45.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton45.setText("Fecha Actual");
        jRadioButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton45ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel94Layout = new javax.swing.GroupLayout(jPanel94);
        jPanel94.setLayout(jPanel94Layout);
        jPanel94Layout.setHorizontalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel94Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jRadioButton44)
                .addGap(37, 37, 37)
                .addComponent(jRadioButton45)
                .addGap(28, 28, 28))
        );
        jPanel94Layout.setVerticalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel94Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton44)
                    .addComponent(jRadioButton45))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel95.setBackground(new java.awt.Color(245, 245, 245));
        jPanel95.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campaña(s)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jRadioButton48.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton48.setText("Todos");

        jRadioButton49.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton49.setText("Uno");

        jLabel187.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel187.setText("Campaña");

        jButton94.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton94.setText(">>");

        jButton95.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton95.setText("<<");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Lista Campañas");
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel95Layout = new javax.swing.GroupLayout(jPanel95);
        jPanel95.setLayout(jPanel95Layout);
        jPanel95Layout.setHorizontalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel95Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel95Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jRadioButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel95Layout.createSequentialGroup()
                        .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel95Layout.createSequentialGroup()
                                .addComponent(jLabel187)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField172))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton95)
                            .addComponent(jButton94))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel95Layout.setVerticalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel95Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton48)
                    .addComponent(jRadioButton49))
                .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel95Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel95Layout.createSequentialGroup()
                                .addComponent(jLabel187)
                                .addGap(8, 8, 8)
                                .addComponent(jTextField172, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel95Layout.createSequentialGroup()
                                .addComponent(jButton94)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton95)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel95Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3)
                        .addContainerGap())))
        );

        jButton96.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton96.setText("Ejecutar");

        jPanel96.setBackground(new java.awt.Color(245, 245, 245));
        jPanel96.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Punto(s) de Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jRadioButton50.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton50.setText("Todos");

        jRadioButton51.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton51.setText("Uno");

        jLabel188.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel188.setText("Centro Logístico");

        jButton97.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton97.setText(">>");

        jButton99.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton99.setText("<<");

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("Lista Centros");
        jScrollPane8.setViewportView(jTextArea5);

        javax.swing.GroupLayout jPanel96Layout = new javax.swing.GroupLayout(jPanel96);
        jPanel96.setLayout(jPanel96Layout);
        jPanel96Layout.setHorizontalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel96Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel96Layout.createSequentialGroup()
                        .addComponent(jRadioButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel96Layout.createSequentialGroup()
                        .addComponent(jLabel188)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField173, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton99)
                            .addComponent(jButton97))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel96Layout.setVerticalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel96Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton50)
                    .addComponent(jRadioButton51))
                .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel96Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel96Layout.createSequentialGroup()
                                .addComponent(jButton97)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton99))
                            .addGroup(jPanel96Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel188)
                                    .addComponent(jTextField173, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel96Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel92Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel92Layout.createSequentialGroup()
                            .addComponent(jPanel94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel92Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton96)
                        .addGap(269, 269, 269)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel92Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton96)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout gesCampaniasPanelLayout = new javax.swing.GroupLayout(gesCampaniasPanel);
        gesCampaniasPanel.setLayout(gesCampaniasPanelLayout);
        gesCampaniasPanelLayout.setHorizontalGroup(
            gesCampaniasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesCampaniasPanelLayout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(440, Short.MAX_VALUE))
        );
        gesCampaniasPanelLayout.setVerticalGroup(
            gesCampaniasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesCampaniasPanelLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        opciones2Pane.addTab("Gestión de Campañas", gesCampaniasPanel);

        cargueCampaniasPanel.setBackground(new java.awt.Color(245, 245, 245));

        jPanel97.setBackground(new java.awt.Color(245, 245, 245));
        jPanel97.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton100.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton100.setText("Exportar");

        jButton101.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton101.setText("Zonas");
        jButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton101ActionPerformed(evt);
            }
        });

        jButton102.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton102.setText("Marcación");
        jButton102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton102ActionPerformed(evt);
            }
        });

        jButton103.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton103.setText("Campañas");
        jButton103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton103ActionPerformed(evt);
            }
        });

        jButton104.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton104.setText("Eliminar C");
        jButton104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton104ActionPerformed(evt);
            }
        });

        jScrollPane39.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informe Guacamaya", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jTable33.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane39.setViewportView(jTable33);

        jButton105.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton105.setText("Consultar");

        jScrollPane40.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informe Televendeor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jTable34.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane40.setViewportView(jTable34);

        javax.swing.GroupLayout jPanel97Layout = new javax.swing.GroupLayout(jPanel97);
        jPanel97.setLayout(jPanel97Layout);
        jPanel97Layout.setHorizontalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel97Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel97Layout.createSequentialGroup()
                        .addComponent(jButton104)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton103)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton101)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton105)
                        .addGap(18, 18, 18)
                        .addComponent(jButton100))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel97Layout.createSequentialGroup()
                        .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel97Layout.setVerticalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel97Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane40, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton101)
                        .addComponent(jButton102)
                        .addComponent(jButton103)
                        .addComponent(jButton104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton105)
                        .addComponent(jButton100)))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cargueCampaniasPanelLayout = new javax.swing.GroupLayout(cargueCampaniasPanel);
        cargueCampaniasPanel.setLayout(cargueCampaniasPanelLayout);
        cargueCampaniasPanelLayout.setHorizontalGroup(
            cargueCampaniasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cargueCampaniasPanelLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jPanel97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        cargueCampaniasPanelLayout.setVerticalGroup(
            cargueCampaniasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cargueCampaniasPanelLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jPanel97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        opciones2Pane.addTab("Cargue por Campañas", cargueCampaniasPanel);

        marcacionPanel.setBackground(new java.awt.Color(245, 245, 245));

        jPanel33.setBackground(new java.awt.Color(245, 245, 245));
        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTable20.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Usuario", "Marcacion"
            }
        ));
        jScrollPane26.setViewportView(jTable20);

        jButton66.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton66.setText("Aceptar");

        jTextField122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField122ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField122)
                            .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jButton66)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTextField122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton66)
                .addContainerGap())
        );

        javax.swing.GroupLayout marcacionPanelLayout = new javax.swing.GroupLayout(marcacionPanel);
        marcacionPanel.setLayout(marcacionPanelLayout);
        marcacionPanelLayout.setHorizontalGroup(
            marcacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(marcacionPanelLayout.createSequentialGroup()
                .addGap(551, 551, 551)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(574, Short.MAX_VALUE))
        );
        marcacionPanelLayout.setVerticalGroup(
            marcacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(marcacionPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        opciones2Pane.addTab("Marcación Aut / Manual", marcacionPanel);

        gesCampaniasPPanel.setBackground(new java.awt.Color(245, 245, 245));

        jPanel72.setBackground(new java.awt.Color(245, 245, 245));
        jPanel72.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel124.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(255, 0, 0));
        jLabel124.setText("Doble click sobre el procedimiento para ejecutarlo");

        jTable24.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable24MouseClicked(evt);
            }
        });
        jScrollPane30.setViewportView(jTable24);

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel124)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel124)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout gesCampaniasPPanelLayout = new javax.swing.GroupLayout(gesCampaniasPPanel);
        gesCampaniasPPanel.setLayout(gesCampaniasPPanelLayout);
        gesCampaniasPPanelLayout.setHorizontalGroup(
            gesCampaniasPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesCampaniasPPanelLayout.createSequentialGroup()
                .addGap(536, 536, 536)
                .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(556, Short.MAX_VALUE))
        );
        gesCampaniasPPanelLayout.setVerticalGroup(
            gesCampaniasPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesCampaniasPPanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        opciones2Pane.addTab("Gestión Campañas", gesCampaniasPPanel);

        consCampaniasPanel.setBackground(new java.awt.Color(245, 245, 245));

        jPanel66.setBackground(new java.awt.Color(245, 245, 245));
        jPanel66.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel68.setBackground(new java.awt.Color(245, 245, 245));
        jPanel68.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jRadioButton34.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton34.setText("Campaña Hoy");

        jRadioButton35.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton35.setText("Campaña Siguiente");

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Almacén1", "Almacén2", "Almacén3", "Almacén4" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Centro");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Cedula");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Teléfono");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Nombre");

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton35, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(37, 37, 37)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton34)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton35)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jButton61.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton61.setText("Exportar");

        jButton62.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton62.setText("Zonas");
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        jButton63.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton63.setText("Marcación");
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });

        jButton64.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton64.setText("Campañas");
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jButton65.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton65.setText("Eliminar C");
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        jScrollPane27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campañas Día Siguiente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jTable21.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane27.setViewportView(jTable21);

        jButton67.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton67.setText("Consultar");

        jScrollPane28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campañas Día Siguiente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jTable22.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Zona / CU", "Cantidad"
            }
        ));
        jScrollPane28.setViewportView(jTable22);

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel66Layout.createSequentialGroup()
                        .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel66Layout.createSequentialGroup()
                                .addComponent(jButton65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton67))
                            .addGroup(jPanel66Layout.createSequentialGroup()
                                .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))))
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane28)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton67)
                    .addComponent(jButton61)
                    .addComponent(jButton62)
                    .addComponent(jButton63)
                    .addComponent(jButton64)
                    .addComponent(jButton65))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout consCampaniasPanelLayout = new javax.swing.GroupLayout(consCampaniasPanel);
        consCampaniasPanel.setLayout(consCampaniasPanelLayout);
        consCampaniasPanelLayout.setHorizontalGroup(
            consCampaniasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consCampaniasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        consCampaniasPanelLayout.setVerticalGroup(
            consCampaniasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consCampaniasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        opciones2Pane.addTab("Consultar Campañas", consCampaniasPanel);

        guionPanel.setBackground(new java.awt.Color(245, 245, 245));

        jPanel81.setBackground(new java.awt.Color(245, 245, 245));
        jPanel81.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel82.setBackground(new java.awt.Color(245, 245, 245));
        jPanel82.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Distribuidora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CmbAlmacen" }));

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel82Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton77.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton77.setText("Limpiar");

        jPanel85.setBackground(new java.awt.Color(245, 245, 245));
        jPanel85.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jRadioButton46.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton46.setText("Todos");

        jRadioButton47.setBackground(new java.awt.Color(245, 245, 245));
        jRadioButton47.setText("Uno");

        jLabel132.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel132.setText("Centro de Utilidad");

        jButton78.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton78.setText(">>");

        jButton79.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton79.setText("<<");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("Lista Centros");
        jScrollPane6.setViewportView(jTextArea4);

        jLabel130.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel130.setText("Fecha Hasta");

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField131, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel85Layout.createSequentialGroup()
                        .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel85Layout.createSequentialGroup()
                                .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel85Layout.createSequentialGroup()
                                .addComponent(jLabel132)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField130, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton79)
                                    .addComponent(jButton78))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel85Layout.createSequentialGroup()
                                .addComponent(jRadioButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jRadioButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21))
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel130)
                    .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton46)
                        .addComponent(jRadioButton47))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel85Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel85Layout.createSequentialGroup()
                                .addComponent(jButton78)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton79))
                            .addGroup(jPanel85Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel132)
                                    .addComponent(jTextField130, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jTextField131, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton98.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton98.setText("Aceptar");

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel81Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel82, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel81Layout.createSequentialGroup()
                        .addComponent(jButton98)
                        .addGap(18, 18, 18)
                        .addComponent(jButton77)
                        .addGap(12, 12, 12)))
                .addGap(41, 41, 41))
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel81Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton77)
                    .addComponent(jButton98))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout guionPanelLayout = new javax.swing.GroupLayout(guionPanel);
        guionPanel.setLayout(guionPanelLayout);
        guionPanelLayout.setHorizontalGroup(
            guionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guionPanelLayout.createSequentialGroup()
                .addContainerGap(456, Short.MAX_VALUE)
                .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(424, 424, 424))
        );
        guionPanelLayout.setVerticalGroup(
            guionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guionPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
        );

        opciones2Pane.addTab("Guión", guionPanel);

        pedVirtualesPanel.setBackground(new java.awt.Color(245, 245, 245));

        jPanel86.setBackground(new java.awt.Color(245, 245, 245));
        jPanel86.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jScrollPane33.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pedidos Virtuales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jTable27.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable27MouseClicked(evt);
            }
        });
        jScrollPane33.setViewportView(jTable27);

        jButton85.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton85.setText("Pedidos InBound");
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });

        jPanel19.setBackground(new java.awt.Color(245, 245, 245));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton86.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton86.setText("Consultar");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Fecha Entrega");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Estado Pedido");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Pto. Vta");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("N° Pedido");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Cedula");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Nombre Recibe");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Origen Pedido");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Estado Pago");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 0, 0));
        jCheckBox1.setText("Pedidos Sin Transmitir");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cmb Estado" }));

        jComboBox3.setEditable(true);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cmb Cu" }));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cmb Tipo Pedido" }));

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cmb Estado Pago" }));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, 130, Short.MAX_VALUE))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton86)
                        .addGap(106, 106, 106))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel19)
                        .addComponent(jLabel20)
                        .addComponent(jLabel21)
                        .addComponent(jLabel22)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jCheckBox1)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton86))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane33))
                .addContainerGap())
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addGap(562, 562, 562)
                .addComponent(jButton85)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton85)
                .addContainerGap())
        );

        javax.swing.GroupLayout pedVirtualesPanelLayout = new javax.swing.GroupLayout(pedVirtualesPanel);
        pedVirtualesPanel.setLayout(pedVirtualesPanelLayout);
        pedVirtualesPanelLayout.setHorizontalGroup(
            pedVirtualesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pedVirtualesPanelLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        pedVirtualesPanelLayout.setVerticalGroup(
            pedVirtualesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pedVirtualesPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        opciones2Pane.addTab("Pedidos Virtuales", pedVirtualesPanel);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(pollitoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcionesPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1603, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opciones2Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 1603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pollitoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcionesPane, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opciones2Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionesPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcionesPaneMouseClicked

    }//GEN-LAST:event_opcionesPaneMouseClicked

    private void opcionesPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opcionesPaneStateChanged

    }//GEN-LAST:event_opcionesPaneStateChanged

    private void pollitoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pollitoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pollitoBtnActionPerformed

    private void pollitoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pollitoBtnMouseClicked
        //popup.show(evt.getComponent(), evt.getX(), evt.getY());
        popup.show(evt.getComponent(), 0, evt.getComponent().getY() + evt.getComponent().getHeight() - 12);
    }//GEN-LAST:event_pollitoBtnMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int seleccionado = opciones2Pane.getSelectedIndex();
        if (seleccionado != 0) {
            opciones2Pane.remove(seleccionado);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        navegar("Tele Mercadeo", teleMercadeoPanel);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        navegar("Call Center InBound", callInPanel);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel70MouseClicked
        navegar("Pedidos InBound", pedInPanel);
    }//GEN-LAST:event_jPanel70MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        navegar("Gestión de Clientes", gesClientesPanel);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        navegar("Gestión por Operador", gesOperadorPanel);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel98MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel98MouseClicked
        navegar("Gestión por Horas", gesHorasPanel);
    }//GEN-LAST:event_jPanel98MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        navegar("Gestión de Campañas", gesCampaniasPanel);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel99MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel99MouseClicked
        navegar("Cargue por Campañas", cargueCampaniasPanel);
    }//GEN-LAST:event_jPanel99MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        navegar("Marcación Aut / Manual", marcacionPanel);
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        navegar("Gestión Campañas", gesCampaniasPPanel);
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jPanel100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel100MouseClicked
        navegar("Consultar Campañas", consCampaniasPanel);
    }//GEN-LAST:event_jPanel100MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        navegar("Guión", guionPanel);
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jPanel101MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel101MouseClicked
        navegar("Pedidos Virtuales", pedVirtualesPanel);
    }//GEN-LAST:event_jPanel101MouseClicked

    private void jPanel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseClicked
        Component componente = evt.getComponent();

        popupMayoreo.show(componente, mayoreoL.getX(), componente.getY() + componente.getHeight() - 10);
    }//GEN-LAST:event_jPanel15MouseClicked

    private void cmbZonaOperadorItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbZonaOperadorItemActionPerformed
        new FrmCambiarZona(this, true).setVisible(true);
    }//GEN-LAST:event_cmbZonaOperadorItemActionPerformed

    private void gestionTelevendedorItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionTelevendedorItemActionPerformed
        new FrmGestionTelevendedor(this, true).setVisible(true);
    }//GEN-LAST:event_gestionTelevendedorItemActionPerformed

    private void jTextField122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField122ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField122ActionPerformed

    private void acercaDeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaDeItemActionPerformed
        new FrmAcercaDe(this, true).setVisible(true);
    }//GEN-LAST:event_acercaDeItemActionPerformed

    private void cambioClaveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioClaveItemActionPerformed
        new FrmCambioClave(this, true).setVisible(true);
    }//GEN-LAST:event_cambioClaveItemActionPerformed

    private void soporteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soporteItemActionPerformed
        new FrmSoporteTecnico(this, true).setVisible(true);
    }//GEN-LAST:event_soporteItemActionPerformed

    private void salirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirItemActionPerformed
        this.dispose();
        new FrmCall().setVisible(true);
    }//GEN-LAST:event_salirItemActionPerformed

    private void retomarGestionBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retomarGestionBtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retomarGestionBtn3ActionPerformed

    private void retomarGestionBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retomarGestionBtn1ActionPerformed
        new FrmRetomarGestion(this, true).setVisible(true);
    }//GEN-LAST:event_retomarGestionBtn1ActionPerformed

    private void clientesPorLlamarTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesPorLlamarTable1MouseClicked
        if (evt.getClickCount() == 2) {
            abrirVentanaSerCliente();
        }
    }//GEN-LAST:event_clientesPorLlamarTable1MouseClicked

    private void clientesPorLlamarTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clientesPorLlamarTable1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            abrirVentanaSerCliente();
        }
    }//GEN-LAST:event_clientesPorLlamarTable1KeyPressed

    private void clientesLlamarMasTardeTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesLlamarMasTardeTable1MouseClicked
        if (evt.getClickCount() == 2) {
            abrirVentanaSerCliente();
        }
    }//GEN-LAST:event_clientesLlamarMasTardeTable1MouseClicked

    private void clientesLlamarMasTardeTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clientesLlamarMasTardeTable1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            abrirVentanaSerCliente();
        }
    }//GEN-LAST:event_clientesLlamarMasTardeTable1KeyPressed

    private void crearClienteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearClienteBtn1ActionPerformed
        new FrmNit(this, true).setVisible(true);
    }//GEN-LAST:event_crearClienteBtn1ActionPerformed

    private void cancelarLlamadaBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarLlamadaBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarLlamadaBtn1ActionPerformed

    private void jRadioButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton39ActionPerformed

    private void jRadioButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton40ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        new FrmNit(this, true).setVisible(true);
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        //abrirVentanaAlmacenes("MaestroClientes");
        new FrmCreacionClientes(this, true).setVisible(true);
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jTextField128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField128ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField128ActionPerformed

    private void jTable14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable14MouseClicked

    }//GEN-LAST:event_jTable14MouseClicked

    private void jTextField146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField146ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField146ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        //abrirVentanaAlmacenes("PedidosTransmitidos");
        new FrmPedidosTransmitidos(this, true).setVisible(true);
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        new FrmOftasDsctos(this, true).setVisible(true);
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        navegar("Pedidos Virtuales", pedVirtualesPanel);
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        new FrmCupoEmpleado(this, true).setVisible(true);
    }//GEN-LAST:event_jButton76ActionPerformed

    private void subirCampaniasItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirCampaniasItemActionPerformed
        new FrmSubirCampanias(this, true).setVisible(true);
    }//GEN-LAST:event_subirCampaniasItemActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        //abrirVentanaAlmacenes("CambiarCuOperador");
        new FrmCambiarCu(this, true).setVisible(true);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        navegar("Marcación Aut / Manual", marcacionPanel);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        //abrirVentanaAlmacenes("SubirArchivoCampanias");
        new FrmSubirCampanias(this, true).setVisible(true);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        navegar("Gestión Campañas", gesCampaniasPPanel);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        //abrirVentanaAlmacenes("CambiarCuOperador");
        new FrmCambiarCu(this, true).setVisible(true);
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        navegar("Marcación Aut / Manual", marcacionPanel);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton109ActionPerformed
        //abrirVentanaAlmacenes("CambiarCuOperador");
        new FrmCambiarCu(this, true).setVisible(true);
    }//GEN-LAST:event_jButton109ActionPerformed

    private void jButton110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton110ActionPerformed
        navegar("Marcación Aut / Manual", marcacionPanel);
    }//GEN-LAST:event_jButton110ActionPerformed

    private void jRadioButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton45ActionPerformed

    private void jButton101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton101ActionPerformed
        //Procesos especiales -> Mayoreo -> cambiar zona del operador
        //abrirVentanaAlmacenes("CambiarCuOperador");
        new FrmCambiarCu(this, true).setVisible(true);
    }//GEN-LAST:event_jButton101ActionPerformed

    private void jButton102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton102ActionPerformed
        navegar("Marcación Aut / Manual", marcacionPanel);
    }//GEN-LAST:event_jButton102ActionPerformed

    private void jButton103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton103ActionPerformed
        //Subir plano my
        //abrirVentanaAlmacenes("SubirArchivoCampanias");
        new FrmSubirCampanias(this, true).setVisible(true);
    }//GEN-LAST:event_jButton103ActionPerformed

    private void jButton104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton104ActionPerformed
        navegar("Gestión Campañas", gesCampaniasPPanel);
    }//GEN-LAST:event_jButton104ActionPerformed

    private void jTable24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable24MouseClicked
        if (evt.getClickCount() == 2) {
            new FrmProcedimiento(this, true).setVisible(true);
        }
    }//GEN-LAST:event_jTable24MouseClicked

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        //abrirVentanaAlmacenes("CambiarCuOperador");
        new FrmCambiarCu(this, true).setVisible(true);
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        navegar("Marcación Aut / Manual", marcacionPanel);
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        //abrirVentanaAlmacenes("SubirArchivoCampanias");
        new FrmSubirCampanias(this, true).setVisible(true);
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        navegar("Gestión Campañas", gesCampaniasPPanel);
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jTable27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable27MouseClicked
        if (evt.getClickCount() == 2) {
            //new FrmDetPedido(this, true).setVisible(true);
        }
    }//GEN-LAST:event_jTable27MouseClicked

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
        navegar("Pedidos InBound", pedInPanel);
    }//GEN-LAST:event_jButton85ActionPerformed

    public void navegar(String titulo, Component componente) {
        if (opciones2Pane.isAncestorOf(componente)) {
            opciones2Pane.setSelectedComponent(componente);
        } else {
            opciones2Pane.setSelectedComponent(opciones2Pane.add(titulo, componente));
        }
    }
    
    public void abrirVentanaSerCliente() {
        if (!vSerCliente.isShowing()) {
            vSerCliente.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Tiene una gestión abierta, por favor termínela antes de abrir una nueva gestión", "Mensaje del Sistema", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem acercaDeItem;
    private javax.swing.JLabel callInIconL;
    private javax.swing.JLabel callInL;
    private javax.swing.JLabel callInL1;
    private javax.swing.JPanel callInPanel;
    private javax.swing.JPanel callInPanel4;
    private javax.swing.JMenuItem cambioClaveItem;
    private javax.swing.JButton cancelarLlamadaBtn1;
    private javax.swing.JLabel cargueCampaniasIconL;
    private javax.swing.JLabel cargueCampaniasL;
    private javax.swing.JPanel cargueCampaniasPanel;
    private javax.swing.JTable clientesLlamarMasTardeTable1;
    private javax.swing.JTable clientesPorLlamarTable1;
    private javax.swing.JPanel clientesTMPanel1;
    private javax.swing.JMenuItem cmbZonaOperadorItem;
    private javax.swing.JLabel consCampaniasIconL;
    private javax.swing.JLabel consCampaniasL;
    private javax.swing.JPanel consCampaniasPanel;
    private javax.swing.JButton crearClienteBtn1;
    private javax.swing.JPanel estadisticasPanel;
    private javax.swing.JPanel fechaCampaniaPanel1;
    private javax.swing.JTextField fechaCampaniaTxt;
    private javax.swing.JTextField fechaHoyTxt;
    private javax.swing.JLabel gesCampaniasIconL;
    private javax.swing.JLabel gesCampaniasL;
    private javax.swing.JLabel gesCampaniasPIconL;
    private javax.swing.JLabel gesCampaniasPL;
    private javax.swing.JPanel gesCampaniasPPanel;
    private javax.swing.JPanel gesCampaniasPanel;
    private javax.swing.JLabel gesClientesIconL;
    private javax.swing.JLabel gesClientesL;
    private javax.swing.JPanel gesClientesPanel;
    private javax.swing.JLabel gesHorasIconL;
    private javax.swing.JLabel gesHorasL;
    private javax.swing.JPanel gesHorasPanel;
    private javax.swing.JLabel gesOperadorIconL;
    private javax.swing.JLabel gesOperadorL;
    private javax.swing.JPanel gesOperadorPanel;
    private javax.swing.JMenuItem gestionTelevendedorItem;
    private javax.swing.JLabel guionIconL;
    private javax.swing.JLabel guionL;
    private javax.swing.JPanel guionPanel;
    private javax.swing.JPanel inicioPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton104;
    private javax.swing.JButton jButton105;
    private javax.swing.JButton jButton106;
    private javax.swing.JButton jButton107;
    private javax.swing.JButton jButton108;
    private javax.swing.JButton jButton109;
    private javax.swing.JButton jButton110;
    private javax.swing.JButton jButton111;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser10;
    private com.toedter.calendar.JDateChooser jDateChooser11;
    private com.toedter.calendar.JDateChooser jDateChooser12;
    private com.toedter.calendar.JDateChooser jDateChooser13;
    private com.toedter.calendar.JDateChooser jDateChooser14;
    private com.toedter.calendar.JDateChooser jDateChooser15;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel191;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton49;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton51;
    private javax.swing.JRadioButton jRadioButton52;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private com.toedter.components.JSpinField jSpinField1;
    private com.toedter.components.JSpinField jSpinField2;
    private com.toedter.components.JSpinField jSpinField3;
    private com.toedter.components.JSpinField jSpinField4;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable16;
    private javax.swing.JTable jTable20;
    private javax.swing.JTable jTable21;
    private javax.swing.JTable jTable22;
    private javax.swing.JTable jTable23;
    private javax.swing.JTable jTable24;
    private javax.swing.JTable jTable25;
    private javax.swing.JTable jTable26;
    private javax.swing.JTable jTable27;
    private javax.swing.JTable jTable28;
    private javax.swing.JTable jTable29;
    private javax.swing.JTable jTable30;
    private javax.swing.JTable jTable32;
    private javax.swing.JTable jTable33;
    private javax.swing.JTable jTable34;
    private javax.swing.JTable jTable35;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField117;
    private javax.swing.JTextField jTextField118;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField121;
    private javax.swing.JTextField jTextField122;
    private javax.swing.JTextField jTextField123;
    private javax.swing.JTextField jTextField124;
    private javax.swing.JTextField jTextField125;
    private javax.swing.JTextField jTextField126;
    private javax.swing.JTextField jTextField127;
    private javax.swing.JTextField jTextField128;
    private javax.swing.JTextField jTextField129;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField130;
    private javax.swing.JTextField jTextField131;
    private javax.swing.JTextField jTextField132;
    private javax.swing.JTextField jTextField133;
    private javax.swing.JTextField jTextField137;
    private javax.swing.JTextField jTextField138;
    private javax.swing.JTextField jTextField139;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField140;
    private javax.swing.JTextField jTextField141;
    private javax.swing.JTextField jTextField142;
    private javax.swing.JTextField jTextField143;
    private javax.swing.JTextField jTextField144;
    private javax.swing.JTextField jTextField145;
    private javax.swing.JTextField jTextField146;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField172;
    private javax.swing.JTextField jTextField173;
    private javax.swing.JTextField jTextField174;
    private javax.swing.JTextField jTextField175;
    private javax.swing.JTextField jTextField176;
    private javax.swing.JTextField jTextField177;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel macPolloN1L;
    private javax.swing.JButton marcacionAutBtn1;
    private javax.swing.JLabel marcacionIconL;
    private javax.swing.JLabel marcacionL;
    private javax.swing.JPanel marcacionPanel;
    private javax.swing.JLabel mayoreoIconL;
    private javax.swing.JLabel mayoreoL;
    private javax.swing.JTabbedPane opciones2Pane;
    private javax.swing.JTabbedPane opcionesPane;
    private javax.swing.JLabel pedInIconL;
    private javax.swing.JPanel pedInPanel;
    private javax.swing.JLabel pedVirtualesIconL;
    private javax.swing.JLabel pedVirtualesL;
    private javax.swing.JPanel pedVirtualesPanel;
    private javax.swing.JButton pollitoBtn;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JPopupMenu popupMayoreo;
    private javax.swing.JPanel presentacionPanel;
    private javax.swing.JButton retomarGestionBtn1;
    private javax.swing.JButton retomarGestionBtn3;
    private javax.swing.JMenuItem salirItem;
    private javax.swing.JPanel servicioClienteOpcionesPanel;
    private javax.swing.JMenuItem soporteItem;
    private javax.swing.JMenuItem subirCampaniasItem;
    private javax.swing.JLabel teleMercadeoIconL;
    private javax.swing.JLabel teleMercadeoL;
    private javax.swing.JPanel teleMercadeoPanel;
    private javax.swing.JPanel tipoMarcacionPanel1;
    private javax.swing.JTextField tipoMarcacionTxt1;
    // End of variables declaration//GEN-END:variables
    
    public JPanel getGesOperadorPanel() {
        return gesOperadorPanel;
    }

    public JPanel getGesClientesPanel() {
        return gesClientesPanel;
    }
}
