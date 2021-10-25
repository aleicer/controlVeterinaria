package Vista;

import Clases.*;
import com.sun.net.httpserver.Headers;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import controlador.controlCenter;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Interfase extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    controlCenter control;
    LinkedList<Cliente> listaClientes = new LinkedList<>();
    LinkedList<Mascota> listaMascotas = new LinkedList<>();
    LinkedList<Planes> listaPlanes = new LinkedList<>();

    public Interfase() {
        this.setContentPane(fondo);
        initComponents();
        this.control = new controlCenter();
        this.listaClientes = control.listaCliente();
        this.listaPlanes = control.listaPlanes();
        this.listaMascotas = control.listaMascotas();
        this.listaC();
        this.listaP();
        this.listaM();
        txtFechaConsulta.setEditable(false);
        refrescarGrafica();

    }
    
    private void refrescarGrafica (){
        LinkedList<Consultas> consultaM= control.graficaMascotas();
        DefaultPieDataset dataSet= new DefaultPieDataset();
        for (Consultas grafica : consultaM) {
            dataSet.setValue(grafica.getTipoEspecie(), grafica.getCantidadEspecie());
        }
        JFreeChart chart= ChartFactory.createPieChart("Clasificacion Por Especie", dataSet, true, true, true);
        ChartPanel panel= new ChartPanel(chart);
        panel.setMouseWheelEnabled(true);
        panelGraficos.setLayout(new java.awt.BorderLayout());
        panelGraficos.add(panel, BorderLayout.CENTER);
        panelGraficos.validate();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new FondoPrincipal();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new FondoPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        botonCrearC = new javax.swing.JButton();
        botonBuscarC = new javax.swing.JButton();
        botonEditarC = new javax.swing.JButton();
        botonEliminarC = new javax.swing.JButton();
        botonLimpiarC = new javax.swing.JButton();
        jPanel5 = new FondoPagos();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtCuotasPago = new javax.swing.JTextField();
        cbPlanPago = new javax.swing.JComboBox<>();
        cbMascotaPago = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        botonCrearPago = new javax.swing.JButton();
        botonBuscarPago = new javax.swing.JButton();
        botonModificarPago = new javax.swing.JButton();
        botonEliminarPago = new javax.swing.JButton();
        txtFechaDia = new javax.swing.JTextField();
        txtFechaMes = new javax.swing.JTextField();
        txtFechaAño = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtIdPago = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtFechaConsulta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new FondoPanel2();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbNombreP = new javax.swing.JComboBox<>();
        txtPrecioP = new javax.swing.JTextField();
        botonCrearP = new javax.swing.JButton();
        botonBuscarP = new javax.swing.JButton();
        botonEditarP = new javax.swing.JButton();
        botonEliminarP = new javax.swing.JButton();
        botonLimpiarP = new javax.swing.JButton();
        txtDescripcionP = new javax.swing.JTextField();
        jPanel4 = new FondoPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCodigoM = new javax.swing.JTextField();
        txtNombreM = new javax.swing.JTextField();
        txtEdadM = new javax.swing.JTextField();
        txtPesoM = new javax.swing.JTextField();
        cbEspecieM = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        botonCrearM = new javax.swing.JButton();
        botonBuscarM = new javax.swing.JButton();
        botonEditarM = new javax.swing.JButton();
        botonEliminarM = new javax.swing.JButton();
        cbDueñoM = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        botonExportar = new javax.swing.JButton();
        panelListaC = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientesLista = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        mascotasLista = new javax.swing.JList<>();
        panelGraficos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("MASCOTA FELIZ MENU");

        jTabbedPane2.setBackground(new java.awt.Color(204, 255, 255));
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setForeground(new java.awt.Color(153, 204, 255));

        jLabel2.setBackground(new java.awt.Color(204, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Identificacion");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Nombre");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(255, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Apellido");
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(255, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Direccion");
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Telefono");
        jLabel6.setOpaque(true);

        txtIdentificacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        botonCrearC.setBackground(new java.awt.Color(204, 255, 204));
        botonCrearC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonCrearC.setText("Crear");
        botonCrearC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearCActionPerformed(evt);
            }
        });

        botonBuscarC.setBackground(new java.awt.Color(204, 255, 204));
        botonBuscarC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonBuscarC.setText("Buscar");
        botonBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarCActionPerformed(evt);
            }
        });

        botonEditarC.setBackground(new java.awt.Color(204, 255, 204));
        botonEditarC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonEditarC.setText("Editar");
        botonEditarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarCActionPerformed(evt);
            }
        });

        botonEliminarC.setBackground(new java.awt.Color(204, 255, 204));
        botonEliminarC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonEliminarC.setText("Eliminar");
        botonEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCActionPerformed(evt);
            }
        });

        botonLimpiarC.setBackground(new java.awt.Color(255, 102, 102));
        botonLimpiarC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonLimpiarC.setText("Limpiar campos");
        botonLimpiarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonLimpiarC)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(botonCrearC)
                        .addGap(48, 48, 48)
                        .addComponent(botonBuscarC)
                        .addGap(55, 55, 55)
                        .addComponent(botonEditarC)
                        .addGap(61, 61, 61)
                        .addComponent(botonEliminarC)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(65, 65, 65))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(botonLimpiarC)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(135, 135, 135)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCrearC)
                    .addComponent(botonBuscarC)
                    .addComponent(botonEditarC)
                    .addComponent(botonEliminarC))
                .addContainerGap())
        );

        jTabbedPane2.addTab("CLIENTE", jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(255, 255, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Numero Cuotas");
        jLabel7.setOpaque(true);

        jLabel20.setBackground(new java.awt.Color(255, 255, 204));
        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 204));
        jLabel20.setText("Fecha Pago");
        jLabel20.setOpaque(true);

        jLabel21.setBackground(new java.awt.Color(255, 255, 204));
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 153));
        jLabel21.setText("Plan");
        jLabel21.setOpaque(true);

        jLabel22.setBackground(new java.awt.Color(255, 255, 204));
        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 153));
        jLabel22.setText("Mascota");
        jLabel22.setOpaque(true);

        txtCuotasPago.setBackground(new java.awt.Color(204, 255, 204));
        txtCuotasPago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCuotasPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuotasPagoKeyTyped(evt);
            }
        });

        cbPlanPago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbPlanPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno" }));

        cbMascotaPago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbMascotaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno" }));

        jLabel23.setBackground(new java.awt.Color(204, 255, 204));
        jLabel23.setText("DIA");
        jLabel23.setOpaque(true);

        jLabel24.setBackground(new java.awt.Color(204, 255, 204));
        jLabel24.setText("MES");
        jLabel24.setOpaque(true);

        jLabel25.setBackground(new java.awt.Color(204, 255, 204));
        jLabel25.setText("AÑO");
        jLabel25.setOpaque(true);

        botonCrearPago.setBackground(new java.awt.Color(255, 255, 0));
        botonCrearPago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonCrearPago.setForeground(new java.awt.Color(0, 255, 204));
        botonCrearPago.setText("CREAR");
        botonCrearPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearPagoActionPerformed(evt);
            }
        });

        botonBuscarPago.setBackground(new java.awt.Color(255, 255, 51));
        botonBuscarPago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonBuscarPago.setForeground(new java.awt.Color(0, 255, 204));
        botonBuscarPago.setText("BUSCAR");
        botonBuscarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarPagoActionPerformed(evt);
            }
        });

        botonModificarPago.setBackground(new java.awt.Color(255, 255, 0));
        botonModificarPago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonModificarPago.setForeground(new java.awt.Color(0, 255, 204));
        botonModificarPago.setText("MODIFICAR");
        botonModificarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarPagoActionPerformed(evt);
            }
        });

        botonEliminarPago.setBackground(new java.awt.Color(255, 255, 51));
        botonEliminarPago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonEliminarPago.setForeground(new java.awt.Color(0, 255, 204));
        botonEliminarPago.setText("ELIMINAR");
        botonEliminarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarPagoActionPerformed(evt);
            }
        });

        txtFechaDia.setBackground(new java.awt.Color(204, 255, 204));
        txtFechaDia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFechaDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaDiaKeyTyped(evt);
            }
        });

        txtFechaMes.setBackground(new java.awt.Color(204, 255, 204));
        txtFechaMes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFechaMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaMesKeyTyped(evt);
            }
        });

        txtFechaAño.setBackground(new java.awt.Color(204, 255, 204));
        txtFechaAño.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFechaAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaAñoKeyTyped(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(255, 204, 204));
        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 204));
        jLabel26.setText("Consultar Pago ID:");
        jLabel26.setOpaque(true);

        txtIdPago.setBackground(new java.awt.Color(204, 255, 204));
        txtIdPago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIdPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdPagoKeyTyped(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(255, 204, 204));
        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 204));
        jLabel27.setText("Fecha del pago");
        jLabel27.setOpaque(true);

        txtFechaConsulta.setBackground(new java.awt.Color(204, 255, 204));
        txtFechaConsulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCrearPago)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbPlanPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarPago))
                .addGap(70, 70, 70)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(botonModificarPago)
                        .addGap(41, 41, 41)
                        .addComponent(botonEliminarPago)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cbMascotaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtFechaMes, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaAño, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(59, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel26)
                            .addGap(18, 18, 18)
                            .addComponent(txtIdPago))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtCuotasPago, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtIdPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(txtFechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCuotasPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPlanPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(cbMascotaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCrearPago)
                    .addComponent(botonBuscarPago)
                    .addComponent(botonModificarPago)
                    .addComponent(botonEliminarPago))
                .addGap(56, 56, 56))
        );

        jTabbedPane2.addTab("PAGOS", jPanel5);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel8.setBackground(new java.awt.Color(204, 255, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Nombre");
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(204, 255, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Precio");
        jLabel9.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(204, 255, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Descripcion");
        jLabel10.setOpaque(true);

        cbNombreP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbNombreP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bienestar", "Elite", "Diamante" }));

        txtPrecioP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrecioP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioPKeyTyped(evt);
            }
        });

        botonCrearP.setBackground(new java.awt.Color(204, 255, 255));
        botonCrearP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonCrearP.setText("Crear");
        botonCrearP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearPActionPerformed(evt);
            }
        });

        botonBuscarP.setBackground(new java.awt.Color(204, 255, 255));
        botonBuscarP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonBuscarP.setText("Buscar");
        botonBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarPActionPerformed(evt);
            }
        });

        botonEditarP.setBackground(new java.awt.Color(204, 255, 255));
        botonEditarP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonEditarP.setText("Editar");
        botonEditarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarPActionPerformed(evt);
            }
        });

        botonEliminarP.setBackground(new java.awt.Color(204, 255, 255));
        botonEliminarP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonEliminarP.setText("Eliminar");
        botonEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarPActionPerformed(evt);
            }
        });

        botonLimpiarP.setBackground(new java.awt.Color(255, 102, 102));
        botonLimpiarP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonLimpiarP.setText("Limpiar campos");
        botonLimpiarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarPActionPerformed(evt);
            }
        });

        txtDescripcionP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPrecioP, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(botonCrearP)
                    .addComponent(cbNombreP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(botonBuscarP)
                        .addGap(47, 47, 47)
                        .addComponent(botonEditarP)
                        .addGap(28, 28, 28)
                        .addComponent(botonEliminarP))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescripcionP, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonLimpiarP))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(botonLimpiarP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPrecioP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtDescripcionP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addGap(106, 106, 106)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCrearP)
                    .addComponent(botonBuscarP)
                    .addComponent(botonEditarP)
                    .addComponent(botonEliminarP))
                .addGap(65, 65, 65))
        );

        jTabbedPane2.addTab("PLANES", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jLabel11.setBackground(new java.awt.Color(255, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("ID Mascota");
        jLabel11.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(0, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Nombre");
        jLabel12.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(0, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Edad");
        jLabel13.setOpaque(true);

        jLabel14.setBackground(new java.awt.Color(0, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Peso");
        jLabel14.setOpaque(true);

        txtCodigoM.setBackground(new java.awt.Color(0, 255, 51));
        txtCodigoM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCodigoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoMKeyTyped(evt);
            }
        });

        txtNombreM.setBackground(new java.awt.Color(0, 255, 51));
        txtNombreM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombreM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreMKeyTyped(evt);
            }
        });

        txtEdadM.setBackground(new java.awt.Color(0, 255, 51));
        txtEdadM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEdadM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadMKeyTyped(evt);
            }
        });

        txtPesoM.setBackground(new java.awt.Color(0, 255, 51));
        txtPesoM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPesoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoMKeyTyped(evt);
            }
        });

        cbEspecieM.setBackground(new java.awt.Color(255, 0, 255));
        cbEspecieM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbEspecieM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perro", "Gato", "Otro" }));

        jLabel15.setBackground(new java.awt.Color(0, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Especie");
        jLabel15.setOpaque(true);

        botonCrearM.setBackground(new java.awt.Color(255, 51, 255));
        botonCrearM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonCrearM.setText("Crear");
        botonCrearM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearMActionPerformed(evt);
            }
        });

        botonBuscarM.setBackground(new java.awt.Color(255, 51, 255));
        botonBuscarM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonBuscarM.setText("Buscar");
        botonBuscarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarMActionPerformed(evt);
            }
        });

        botonEditarM.setBackground(new java.awt.Color(255, 51, 255));
        botonEditarM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonEditarM.setText("Editar");
        botonEditarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarMActionPerformed(evt);
            }
        });

        botonEliminarM.setBackground(new java.awt.Color(255, 0, 255));
        botonEliminarM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonEliminarM.setText("Eliminar");
        botonEliminarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarMActionPerformed(evt);
            }
        });

        cbDueñoM.setBackground(new java.awt.Color(204, 0, 204));
        cbDueñoM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel16.setBackground(new java.awt.Color(0, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Dueño");
        jLabel16.setOpaque(true);

        jLabel18.setBackground(new java.awt.Color(255, 255, 0));
        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Años");
        jLabel18.setOpaque(true);

        jLabel19.setBackground(new java.awt.Color(255, 255, 0));
        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Kg");
        jLabel19.setOpaque(true);

        jLabel17.setBackground(new java.awt.Color(255, 0, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Buscar");
        jLabel17.setOpaque(true);

        botonExportar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonExportar.setText("Exportar Excel");
        botonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(botonCrearM)
                        .addGap(85, 85, 85)
                        .addComponent(botonBuscarM)
                        .addGap(107, 107, 107)
                        .addComponent(botonEditarM)
                        .addGap(86, 86, 86)
                        .addComponent(botonEliminarM)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoM, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtEdadM, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel18)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cbDueñoM, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEspecieM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(botonExportar)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(txtPesoM, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(68, 68, 68))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtCodigoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(txtEdadM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cbDueñoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(cbEspecieM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addComponent(botonExportar)
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCrearM)
                    .addComponent(botonBuscarM)
                    .addComponent(botonEditarM)
                    .addComponent(botonEliminarM))
                .addGap(28, 28, 28))
        );

        jTabbedPane2.addTab("MASCOTA", jPanel4);

        panelListaC.setBackground(new java.awt.Color(204, 204, 255));

        clientesLista.setBackground(new java.awt.Color(204, 204, 255));
        clientesLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        clientesLista.setEnabled(false);
        jScrollPane1.setViewportView(clientesLista);

        panelListaC.addTab("Lista Clientes", jScrollPane1);

        mascotasLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(mascotasLista);

        panelListaC.addTab("Lista Mascotas", jScrollPane2);

        jTabbedPane2.addTab("LISTAS", panelListaC);

        javax.swing.GroupLayout panelGraficosLayout = new javax.swing.GroupLayout(panelGraficos);
        panelGraficos.setLayout(panelGraficosLayout);
        panelGraficosLayout.setHorizontalGroup(
            panelGraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 791, Short.MAX_VALUE)
        );
        panelGraficosLayout.setVerticalGroup(
            panelGraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("GRAFICAS", panelGraficos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel1)
                .addContainerGap(381, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarMActionPerformed
        int idMascota = Integer.parseInt(txtCodigoM.getText());
        Mascota m = control.buscarMascota(idMascota);
        if (m == null) {
            JOptionPane.showMessageDialog(this, "Mascota no encontrada");
        } else {
            JOptionPane.showMessageDialog(this, "Mascota encontado");            
            txtNombreM.setText(m.getNombre());
            txtEdadM.setText(m.getEdad()+ "");
            txtPesoM.setText(m.getPeso()+ "");
            String amo=m.getAmo().getIdentidicacion()+" "+ m.getAmo().getNombre()+" "+ m.getAmo().getApellidos();
            cbDueñoM.setSelectedItem(amo);
            cbEspecieM.setSelectedItem(m.getEspecie());
            
        }
    }//GEN-LAST:event_botonBuscarMActionPerformed

    private void botonCrearMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearMActionPerformed
        int codigo = 0;
        String nombre = txtNombreM.getText();
        int edad = Integer.parseInt(txtEdadM.getText());
        int peso = Integer.parseInt(txtPesoM.getText());
        String especie = cbEspecieM.getSelectedItem().toString();
        String numeroAmo= cbDueñoM.getSelectedItem().toString();
        int idCliente = this.optenerId(numeroAmo);
        Cliente amo = this.buscarCliente(idCliente);
        if (txtNombreM.getText().equals("")
                || txtEdadM.getText().equals("")
                || txtPesoM.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los datos");
        } else {
            Mascota m = new Mascota(codigo, nombre, edad, peso, especie, amo);
            boolean verificador = control.crearMascota(m);
            if (verificador) {
                JOptionPane.showMessageDialog(null, "Datos guardados con exito");
                this.limpiarMascota();
            } else {
                JOptionPane.showMessageDialog(null, "Error, verifique conexion");
            }          
        }
    }//GEN-LAST:event_botonCrearMActionPerformed

    /*
    -----------------------------------------------------------------------
    ||||||||||VALIDACIONES DE INGRESO DE TECLAS|||||||||
    -----------------------------------------------------------------------
     */

    private void txtPesoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoMKeyTyped
        if (txtTelefono.getText().length() >= 9) {
            evt.consume();
        }

        char tipoTecla = evt.getKeyChar();
        if (Character.isAlphabetic(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPesoMKeyTyped

    private void txtEdadMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadMKeyTyped
        if (txtTelefono.getText().length() >= 6) {
            evt.consume();
        }

        char tipoTecla = evt.getKeyChar();
        if (Character.isAlphabetic(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEdadMKeyTyped

    private void txtNombreMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreMKeyTyped
        char tipoTecla = evt.getKeyChar();
        if (Character.isDigit(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreMKeyTyped

    private void txtCodigoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoMKeyTyped
        if (txtTelefono.getText().length() >= 9) {
            evt.consume();
        }

        char tipoTecla = evt.getKeyChar();
        if (Character.isAlphabetic(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoMKeyTyped

    private void botonLimpiarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarPActionPerformed
        txtPrecioP.setText("");
        txtDescripcionP.setText("");
    }//GEN-LAST:event_botonLimpiarPActionPerformed

    private void botonEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarPActionPerformed
        String nombre = cbNombreP.getSelectedItem().toString();
        boolean borrado = control.borrarPlan(nombre);
        if (borrado) {
            JOptionPane.showMessageDialog(this, "Registro borrado");
            this.limpiarPlan();
        } else {
            JOptionPane.showMessageDialog(this, "Error, no se pudo borrar registro");
        }
    }//GEN-LAST:event_botonEliminarPActionPerformed

    private void botonEditarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarPActionPerformed
        int idPlan = 0;
        String nombre = cbNombreP.getSelectedItem().toString();
        String descripcion = txtDescripcionP.getText();
        int precio = Integer.parseInt(txtPrecioP.getText());

        Planes p = new Planes(idPlan, nombre, precio, descripcion);
        boolean respuesta = control.modificarPlan(p);
        if (respuesta) {
            JOptionPane.showMessageDialog(this, "Plan Actualizado");
        } else {
            JOptionPane.showMessageDialog(this, "Error actualizando el registro");
        }
        this.limpiarPlan();
    }//GEN-LAST:event_botonEditarPActionPerformed

    private void botonBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarPActionPerformed
        String nombre = cbNombreP.getSelectedItem().toString();
        Planes p = control.buscarPlan(nombre);
        if (p == null) {
            JOptionPane.showMessageDialog(this, "Plan no encontrado");
        } else {
            JOptionPane.showMessageDialog(this, "Plan encontado");
            txtDescripcionP.setText(p.getDescripcion());
            txtPrecioP.setText(p.getPrecio() + "");
        }
    }//GEN-LAST:event_botonBuscarPActionPerformed

    private void botonCrearPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearPActionPerformed
        int idPlan = 0;
        String nombre = cbNombreP.getSelectedItem().toString();
        int precio = Integer.parseInt(txtPrecioP.getText());
        String descripcion = txtDescripcionP.getText();

        if (txtPrecioP.getText().equals("")
                || txtDescripcionP.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingresar todos los datos");
        } else {
            Planes plan = new Planes(idPlan, nombre, precio, descripcion);
            boolean verificador = control.CrearPlan(plan);
            if (verificador) {
                JOptionPane.showMessageDialog(null, "Plan guardado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Error, verifique conexion");
            }

            this.limpiarPlan();
        }
    }//GEN-LAST:event_botonCrearPActionPerformed

    private void txtPrecioPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioPKeyTyped
        if (txtPrecioP.getText().length() >= 9) {
            evt.consume();
        }

        char tipoTecla = evt.getKeyChar();
        if (Character.isAlphabetic(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioPKeyTyped

    private void botonLimpiarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarCActionPerformed
        txtIdentificacion.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
    }//GEN-LAST:event_botonLimpiarCActionPerformed

    private void botonEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCActionPerformed
        int identificacion = Integer.parseInt(txtIdentificacion.getText());
        boolean borrado = control.borrarCliente(identificacion);
        if (borrado) {
            JOptionPane.showMessageDialog(this, "Cliente borrado");
            this.limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "Error, no se pudo borrar registro");
        }
    }//GEN-LAST:event_botonEliminarCActionPerformed

    private void botonEditarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarCActionPerformed
        int idCliente= 0;
        int identificacion = Integer.parseInt(txtIdentificacion.getText());
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int telefono = Integer.parseInt(txtTelefono.getText());
        String direccion = txtDireccion.getText();
        Cliente c = new Cliente(idCliente, identificacion, nombre, apellido, direccion, telefono);
        boolean respuesta = control.modificarCliente(c);
        if (respuesta) {
            limpiar();
            JOptionPane.showMessageDialog(this, "Cliente Actualizado");
        } else {
            JOptionPane.showMessageDialog(this, "Error actualizando el registro");
        }
    }//GEN-LAST:event_botonEditarCActionPerformed

    private void botonBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarCActionPerformed
        int identificacion = Integer.parseInt(txtIdentificacion.getText());
        Cliente c = control.buscarCliente(identificacion);
        if (c == null) {
            JOptionPane.showMessageDialog(this, "Error al buscar cliente");
        } else {
            JOptionPane.showMessageDialog(this, "Cliente encontrado");
            txtNombre.setText(c.getNombre());
            txtApellido.setText(c.getApellidos());
            txtDireccion.setText(c.getDireccion());
            txtTelefono.setText(c.getTelefono() + "");
        }

    }//GEN-LAST:event_botonBuscarCActionPerformed

    private void botonCrearCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearCActionPerformed
        int idCliente= 0;
        int identificacion = Integer.parseInt(txtIdentificacion.getText());
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int telefono = Integer.parseInt(txtTelefono.getText());
        String direccion = txtDireccion.getText();

        if (txtIdentificacion.getText().equals("")
                || txtNombre.getText().equals("")
                || txtApellido.getText().equals("")
                || txtTelefono.getText().equals("")
                || txtDireccion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingresar todos los datos");
        } else {
            Cliente c = new Cliente(idCliente, identificacion, nombre, apellido, direccion, telefono);
            boolean verificador = control.CrearCliente(c);
            if (verificador) {
                limpiar();
                JOptionPane.showMessageDialog(null, "Datos guardados con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Error, verifique conexion");
            }

        }
    }//GEN-LAST:event_botonCrearCActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (txtTelefono.getText().length() >= 9) {
            evt.consume();
        }

        char tipoTecla = evt.getKeyChar();
        if (Character.isAlphabetic(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char tipoTecla = evt.getKeyChar();
        if (Character.isDigit(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char tipoTecla = evt.getKeyChar();
        if (Character.isDigit(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
        if (txtIdentificacion.getText().length() >= 9) {
            evt.consume();
        }
        char tipoTecla = evt.getKeyChar();
        if (Character.isAlphabetic(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdentificacionKeyTyped

    private void txtFechaAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaAñoKeyTyped
        if (txtFechaAño.getText().length() >= 4) {
            evt.consume();
        }
        char tipoTecla = evt.getKeyChar();
        if (Character.isAlphabetic(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFechaAñoKeyTyped

    private void txtFechaMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaMesKeyTyped
        if (txtFechaMes.getText().length() >= 2) {
            evt.consume();
        }
        char tipoTecla = evt.getKeyChar();
        if (Character.isAlphabetic(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFechaMesKeyTyped

    private void txtFechaDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaDiaKeyTyped
        if (txtFechaDia.getText().length() >= 2) {
            evt.consume();
        }
        char tipoTecla = evt.getKeyChar();
        if (Character.isAlphabetic(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFechaDiaKeyTyped

    private void botonCrearPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearPagoActionPerformed
        int idPagoPlan = 0;
        int cuotas = Integer.parseInt(txtCuotasPago.getText());
        int dia = Integer.parseInt(txtFechaDia.getText());
        int mes = Integer.parseInt(txtFechaMes.getText());
        int año = Integer.parseInt(txtFechaAño.getText());
        String fecha = dia + "/" + mes + "/" + año;
        String planPago = cbPlanPago.getSelectedItem().toString();
        Planes plan = this.planPagoPlan(planPago);
        String mascotaPago = cbMascotaPago.getSelectedItem().toString();
        Mascota mp = this.planMascota(mascotaPago);
        if (dia > 31 || mes > 12 || año > 2021 || año < 2021 || txtCuotasPago.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese la fecha o datos correctos");
        } else {
            pagoPlan pp = new pagoPlan(idPagoPlan, cuotas, fecha, plan, mp);
            boolean verificador = control.crearPagoPlan(pp);
            if (verificador) {
                limpiarPagoPlan();
                JOptionPane.showMessageDialog(null, "Pago guardados con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Error, verifique conexion");
            }

        }
    }//GEN-LAST:event_botonCrearPagoActionPerformed

    private void txtCuotasPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuotasPagoKeyTyped
        if (txtCuotasPago.getText().length() >= 4) {
            evt.consume();
        }
        char tipoTecla = evt.getKeyChar();
        if (Character.isAlphabetic(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCuotasPagoKeyTyped

    private void txtIdPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPagoKeyTyped
        if (txtIdPago.getText().length() >= 4) {
            evt.consume();
        }
        char tipoTecla = evt.getKeyChar();
        if (Character.isAlphabetic(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdPagoKeyTyped

    private void botonBuscarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarPagoActionPerformed
        int idPago = Integer.parseInt(txtIdPago.getText());
        pagoPlan pp = control.buscarPagoPlan(idPago);
        if (pp == null) {
            JOptionPane.showMessageDialog(this, "Registro de pago no encontrado");
        } else {
            JOptionPane.showMessageDialog(this, "Pago encontado");
            txtIdPago.setText(pp.getIdPagoPlan() + "");
            txtCuotasPago.setText(pp.getCantidadCuotas() + "");
            txtFechaConsulta.setText(pp.getFechaPago());
            String plan = pp.getPlan().getNombre();
            String mascota = pp.getMascota().getNombre();
            cbPlanPago.setSelectedItem(plan);
            cbMascotaPago.setSelectedItem(mascota);
        }
    }//GEN-LAST:event_botonBuscarPagoActionPerformed

    private void botonModificarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarPagoActionPerformed
        int idPagoPlan = Integer.parseInt(txtIdPago.getText());
        int cuotas = Integer.parseInt(txtCuotasPago.getText());
        int dia = Integer.parseInt(txtFechaDia.getText());
        int mes = Integer.parseInt(txtFechaMes.getText());
        int año = Integer.parseInt(txtFechaAño.getText());
        String fecha = dia + "/" + mes + "/" + año;
        String planPago = cbPlanPago.getSelectedItem().toString();
        Planes plan = this.planPagoPlan(planPago);
        String mascotaPago = cbMascotaPago.getSelectedItem().toString();
        Mascota mp = this.planMascota(mascotaPago);
        if (dia > 31 || mes > 12 || año > 2021 || año < 2021 || txtCuotasPago.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese la fecha o datos correctos");
        } else {
            pagoPlan pp = new pagoPlan(idPagoPlan, cuotas, fecha, plan, mp);
            boolean verificador = control.modificarPagoPlan(pp);
            if (verificador) {
                limpiarPagoPlan();
                JOptionPane.showMessageDialog(this, "Pago Actualizado");
            } else {
                JOptionPane.showMessageDialog(this, "Error actualizando el pago");
            }
        }
    }//GEN-LAST:event_botonModificarPagoActionPerformed

    private void botonEliminarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarPagoActionPerformed
        int idPagoPlan = Integer.parseInt(txtIdPago.getText());
        boolean borrado = control.borrarPagoPlan(idPagoPlan);
        if (borrado) {
            JOptionPane.showMessageDialog(this, "Registro borrado");
            this.limpiarPagoPlan();
        } else {
            JOptionPane.showMessageDialog(this, "Error, no se pudo borrar registro");
        }
    }//GEN-LAST:event_botonEliminarPagoActionPerformed

    private void botonEditarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarMActionPerformed
        int codigo = Integer.parseInt(txtCodigoM.getText());
        String nombre = txtNombreM.getText();
        int edad = Integer.parseInt(txtEdadM.getText());
        int peso = Integer.parseInt(txtPesoM.getText());
        String especie = cbEspecieM.getSelectedItem().toString();
        String numeroAmo= cbDueñoM.getSelectedItem().toString();
        int idCliente = this.optenerId(numeroAmo);
        Cliente amo = this.buscarCliente(idCliente);
        if (txtNombreM.getText().equals("")
                || txtEdadM.getText().equals("")
                || txtPesoM.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los datos");
        } else {
            Mascota m = new Mascota(codigo, nombre, edad, peso, especie, amo);
            boolean verificador = control.modificarMascota(m);
            if (verificador) {
                JOptionPane.showMessageDialog(null, "Mascota guardada con exito");
                this.limpiarMascota();
            } else {
                JOptionPane.showMessageDialog(null, "Error, verifique conexion");
            }          
        }
    }//GEN-LAST:event_botonEditarMActionPerformed

    private void botonEliminarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarMActionPerformed
        int idMascota = Integer.parseInt(txtCodigoM.getText());
        boolean borrado = control.borrarMascota(idMascota);
        if (borrado) {
            JOptionPane.showMessageDialog(this, "Mascota borrada");
            this.limpiarMascota();
        } else {
            JOptionPane.showMessageDialog(this, "Error, no se pudo borrar registro");
        }
    }//GEN-LAST:event_botonEliminarMActionPerformed

    private void botonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExportarActionPerformed
        HSSFWorkbook book= new HSSFWorkbook();
        HSSFSheet sheet= book.createSheet();
        book.setSheetName(0, "Lista Mascotas");
        
        String[] encabezados= new String[]{
            "ID",
            "MASCOTA",
            "EDAD",
            "PESO",
            "ESPECIE",
            "DUEÑO",
            "CEDULA DUEÑO"
        };
        
        CellStyle estiloEncabezado= book.createCellStyle();
        HSSFFont font= book.createFont();
        font.setBold(true);
        estiloEncabezado.setFont(font);
        
        HSSFRow headersRow = sheet.createRow(0);
        for (int i = 0; i < encabezados.length; i++) {
            String encabezado = encabezados[i];
            HSSFCell celda= headersRow.createCell(i);
            celda.setCellStyle(estiloEncabezado);
            celda.setCellValue(encabezado);
        }
        
        for (int i = 0; i < listaMascotas.size(); i++) {
            HSSFRow row = sheet.createRow(i + 1);
            int id= listaMascotas.get(i).getCodigo();
            String nombre= listaMascotas.get(i).getNombre();
            int edad= listaMascotas.get(i).getEdad();
            int peso= listaMascotas.get(i).getPeso();
            String especie= listaMascotas.get(i).getEspecie();
            String dueño= listaMascotas.get(i).getAmo().getNombre()+ " "+ listaMascotas.get(i).getAmo().getApellidos();
            int cedulaDueño= listaMascotas.get(i).getAmo().getIdentidicacion();
            row.createCell(0).setCellValue(id);
            row.createCell(1).setCellValue(nombre);
            row.createCell(2).setCellValue(edad);
            row.createCell(3).setCellValue(peso);
            row.createCell(4).setCellValue(especie);
            row.createCell(5).setCellValue(dueño);
            row.createCell(6).setCellValue(cedulaDueño);
        }
        
        try {
            FileOutputStream archivo = new FileOutputStream("Lista_de_mascotas.xls");
            book.write(archivo);
            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interfase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonExportarActionPerformed

    private Planes planPagoPlan(String planPago) {
        try {
            for (Planes plan : listaPlanes) {
                if (plan.getNombre() == planPago) {
                    int idPlan = plan.getIdPlan();
                    String nombre = plan.getNombre();
                    int precio = plan.getPrecio();
                    String descripcion = plan.getDescripcion();
                    Planes pp = new Planes(idPlan, nombre, precio, descripcion);
                    return pp;
                }
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    private Mascota planMascota(String mascotaPago) {
        for (Mascota pet : listaMascotas) {
            if (pet.getNombre() == mascotaPago) {
                int codigo = pet.getCodigo();
                String nombre = pet.getNombre();
                int edad = pet.getEdad();
                int peso = pet.getPeso();
                String especie = pet.getEspecie();
                Cliente amo = pet.getAmo();
                Mascota mp = new Mascota(codigo, nombre, edad, peso, especie, amo);
                return mp;
            }
        }
        return null;
    }
    
    private Cliente buscarCliente(int idCliente) {
        for (Cliente c : listaClientes) {
            if (c.getIdentidicacion() == idCliente) {
                int idC = c.getIdCliente();
                int cedula= c.getIdentidicacion();
                String nombre= c.getNombre();
                String apellido= c.getApellidos();
                String direccion= c.getDireccion();
                int telefono = c.getTelefono();
                Cliente cm= new Cliente(idC, cedula, nombre, apellido, direccion, telefono);                    
                return cm;
            }
        }
        return null;
    }

    private void listaC() {
        DefaultListModel modelo = new DefaultListModel();
        int index = 0;
        for (Cliente usuario : listaClientes) {
            String datos = usuario.getIdentidicacion() + " " + usuario.getNombre() + " " + usuario.getApellidos();
            cbDueñoM.addItem(datos);
            modelo.add(index, datos);
            index++;
        }
        clientesLista.setModel(modelo);

    }

    private void listaP() {
        listaPlanes.stream().map(plan -> plan.getNombre()).forEachOrdered(datos -> {
            cbPlanPago.addItem(datos);
        });
    }

    private void listaM() {
        DefaultListModel modeloM = new DefaultListModel();
        int index = 0;
        for (Mascota mascota : listaMascotas) {
            String datos = mascota.getNombre();
            cbMascotaPago.addItem(datos);
            modeloM.add(index, datos);
            index++;
        }
        mascotasLista.setModel(modeloM);
    }

    private void limpiar() {
        txtIdentificacion.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
    }

    private void limpiarPlan() {
        txtPrecioP.setText("");
        txtDescripcionP.setText("");
    }

    private void limpiarPagoPlan() {
        txtIdPago.setText("");
        txtCuotasPago.setText("");
        txtFechaConsulta.setText("");
        txtFechaDia.setText("");
        txtFechaMes.setText("");
        txtFechaAño.setText("");
    }

    private void limpiarMascota() {
        txtCodigoM.setText("");
        txtNombreM.setText("");
        txtEdadM.setText("");
        txtPesoM.setText("");
    }

    private int optenerId (String cadena){
        char[] caracteres = cadena.toCharArray();
        String n= "";
        for (int i = 0; i < caracteres.length; i++) {
            if (Character.isDigit(caracteres[i])){
                n+= caracteres[i];                
            }           
        }
        int idCliente= Integer.parseInt(n);
        return idCliente;
        
    } 
            
            
    /*
    =======================================================================
    ||||||||||||||| NO TOCAR  ||||||||||
    =======================================================================
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
            java.util.logging.Logger.getLogger(Interfase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarC;
    private javax.swing.JButton botonBuscarM;
    private javax.swing.JButton botonBuscarP;
    private javax.swing.JButton botonBuscarPago;
    private javax.swing.JButton botonCrearC;
    private javax.swing.JButton botonCrearM;
    private javax.swing.JButton botonCrearP;
    private javax.swing.JButton botonCrearPago;
    private javax.swing.JButton botonEditarC;
    private javax.swing.JButton botonEditarM;
    private javax.swing.JButton botonEditarP;
    private javax.swing.JButton botonEliminarC;
    private javax.swing.JButton botonEliminarM;
    private javax.swing.JButton botonEliminarP;
    private javax.swing.JButton botonEliminarPago;
    private javax.swing.JButton botonExportar;
    private javax.swing.JButton botonLimpiarC;
    private javax.swing.JButton botonLimpiarP;
    private javax.swing.JButton botonModificarPago;
    private javax.swing.JComboBox<String> cbDueñoM;
    private javax.swing.JComboBox<String> cbEspecieM;
    private javax.swing.JComboBox<String> cbMascotaPago;
    private javax.swing.JComboBox<String> cbNombreP;
    private javax.swing.JComboBox<String> cbPlanPago;
    private javax.swing.JList<String> clientesLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JList<String> mascotasLista;
    private javax.swing.JPanel panelGraficos;
    private javax.swing.JTabbedPane panelListaC;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigoM;
    private javax.swing.JTextField txtCuotasPago;
    private javax.swing.JTextField txtDescripcionP;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdadM;
    private javax.swing.JTextField txtFechaAño;
    private javax.swing.JTextField txtFechaConsulta;
    private javax.swing.JTextField txtFechaDia;
    private javax.swing.JTextField txtFechaMes;
    private javax.swing.JTextField txtIdPago;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreM;
    private javax.swing.JTextField txtPesoM;
    private javax.swing.JTextField txtPrecioP;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/imagenveterinaria.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    class FondoPanel2 extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondopanel2.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    class FondoPrincipal extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondojframe.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    class FondoPagos extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondopagos.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
