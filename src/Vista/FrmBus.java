package Vista;
import Controlador.ControladorBus;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
 
public class FrmBus extends JFrame {
 
    /**************** ATRIBUTOS ***************************/
    //CONTENEDOR PRINCIPAL
    private JPanel contenedorGeneral;
 
    //DEFINICIÓN DE LAS ETIQUETAS
    private JLabel lblPlaca;
    private JLabel lblAño;
    private JLabel lblMarca;
    private JLabel lblModelo;
    private JLabel lblNumAsientos;
 
    //DEFINICIÓN DE LOS CUADROS DE TEXTO
    public JTextField txtPlaca;
    public JTextField txtAño;
    public JTextField txtMarca;
    public JTextField txtModelo;
    public JTextField txtNumAsientos;
 
    //DEFINICIÓN DE LOS BOTONES
    protected JButton btnAdd;
    protected JButton btnDel;
    protected JButton btnActualizar;
    protected JButton btnSgte;
 
    //DEFINICIÓN DE LOS OBJETOS PARA LA TABLA
    private JScrollPane scroll; //Panel de scroll que contiene la tabla
    protected Object[][] datos; //Cuerpo de la tabla
    protected String[] cabecera;    //Cabecera de la tabla
    public JTable tabla; //Tabla propiamente dicha
 
    /**************** MÉTODOS ***************************/
    //CONSTRUCTOR
    public FrmBus(){
        //Métodos de la JFrame
        setBounds(100, 100, 450, 400);//Definir las dimensiones de la ventana
        setTitle("GESTIÓN DE CLIENTES");    //Barra de título
        setDefaultCloseOperation(EXIT_ON_CLOSE);    //Acción al pulsar salir
 
        //CREAR EL CONTENEDOR PRINCIPAL Y AÑADIRLO A LA VENTANA
        contenedorGeneral = new JPanel();
        getContentPane().add(contenedorGeneral);
 
        //INDICAR QUE SE QUIERE USAR SPRINGLAYOUT
        SpringLayout layoutSprint = new SpringLayout();
        contenedorGeneral.setLayout(layoutSprint);
 
        /****************  ETIQUETAS  vvvvvvvvvvvvvvvv **/
    
        lblAño = new JLabel("Año:");  //Crear el objeto
        contenedorGeneral.add(lblAño);      //Añadirlo al contenedorGeneral
        layoutSprint.putConstraint(SpringLayout.NORTH, lblAño, 10, SpringLayout.NORTH, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.WEST, lblAño,  10,SpringLayout.WEST, contenedorGeneral);
        lblMarca = new JLabel("Marca:");  //Crear el objeto
        contenedorGeneral.add(lblMarca);      //Añadirlo al contenedorGeneral
        layoutSprint.putConstraint(SpringLayout.NORTH, lblMarca, 50, SpringLayout.NORTH, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.WEST, lblMarca,  10,SpringLayout.WEST, contenedorGeneral);
        lblPlaca = new JLabel("Placa:");
        contenedorGeneral.add(lblPlaca);
        layoutSprint.putConstraint(SpringLayout.NORTH, lblPlaca, 90,SpringLayout.NORTH, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.WEST, lblPlaca,  10,SpringLayout.WEST, contenedorGeneral);
        lblModelo = new JLabel("Modelo:");
        contenedorGeneral.add(lblModelo);
        layoutSprint.putConstraint(SpringLayout.NORTH, lblModelo, 130,SpringLayout.NORTH, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.WEST, lblModelo,  10,SpringLayout.WEST, contenedorGeneral);
        lblNumAsientos = new JLabel("N° Asientos:");
        contenedorGeneral.add(lblNumAsientos);
        layoutSprint.putConstraint(SpringLayout.NORTH, lblNumAsientos, 170,SpringLayout.NORTH, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.WEST, lblNumAsientos,  10,SpringLayout.WEST, contenedorGeneral);
    
        txtAño= new JTextField();
        contenedorGeneral.add(txtAño);
        layoutSprint.putConstraint(SpringLayout.NORTH, txtAño, 10,SpringLayout.NORTH, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.WEST, txtAño, 100,SpringLayout.WEST, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.EAST, txtAño, 300,SpringLayout.WEST, contenedorGeneral);
        //CUADRO DE TEXTO PARA EL dni
        txtMarca = new JTextField();
        contenedorGeneral.add(txtMarca);    //añadir al contenedorGeneral
        layoutSprint.putConstraint(SpringLayout.NORTH, txtMarca, 50,SpringLayout.NORTH, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.WEST, txtMarca, 100,SpringLayout.WEST, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.EAST, txtMarca, 300,SpringLayout.WEST, contenedorGeneral);
        //CUADRO DE TEXTO PARA LOS APELLIDOS
        txtPlaca= new JTextField();
        contenedorGeneral.add(txtPlaca);
        layoutSprint.putConstraint(SpringLayout.NORTH, txtPlaca, 90, SpringLayout.NORTH, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.WEST, txtPlaca, 100, SpringLayout.WEST, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.EAST, txtPlaca, 300, SpringLayout.WEST, contenedorGeneral);
        txtModelo= new JTextField();
        contenedorGeneral.add(txtModelo);
        layoutSprint.putConstraint(SpringLayout.NORTH, txtModelo, 130, SpringLayout.NORTH, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.WEST, txtModelo, 100, SpringLayout.WEST, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.EAST, txtModelo, 300, SpringLayout.WEST, contenedorGeneral);
        txtNumAsientos= new JTextField();
        contenedorGeneral.add(txtNumAsientos);
        layoutSprint.putConstraint(SpringLayout.NORTH, txtNumAsientos, 170, SpringLayout.NORTH, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.WEST, txtNumAsientos, 100, SpringLayout.WEST, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.EAST, txtNumAsientos, 300, SpringLayout.WEST, contenedorGeneral);
        
        scroll      = new JScrollPane();
        
        tabla       = new JTable();
        scroll.setViewportView(tabla);
     
        contenedorGeneral.add(scroll); //añadir al contenedorGeneral
        layoutSprint.putConstraint(SpringLayout.NORTH, scroll, 200, SpringLayout.NORTH, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.WEST, scroll,   10,SpringLayout.WEST, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.EAST, scroll,  -10, SpringLayout.EAST, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.SOUTH, scroll, -50,SpringLayout.SOUTH, contenedorGeneral);
        /****************  TABLA ^^^^^^^^^^^^^^^^^^^^ **/
 
        /****************  BOTONES vvvvvvvvvvvvvvvvvv **/
        //BOTÓN AÑADIR
        btnAdd          = new JButton("Añadir");
        contenedorGeneral.add(btnAdd);
        layoutSprint.putConstraint(SpringLayout.SOUTH, btnAdd, -10,SpringLayout.SOUTH, contenedorGeneral);//colocarlo
        layoutSprint.putConstraint(SpringLayout.WEST, btnAdd,   20,SpringLayout.WEST, contenedorGeneral);
        //BOTÓN BORRAR
        btnDel          = new JButton("Borrar");
        contenedorGeneral.add(btnDel);
        layoutSprint.putConstraint(SpringLayout.SOUTH, btnDel, -10,SpringLayout.SOUTH, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.WEST, btnDel,  120,SpringLayout.WEST, contenedorGeneral);
        //BOTÓN MODIFICAR
        btnActualizar          = new JButton("Editar");
        contenedorGeneral.add(btnActualizar);
        layoutSprint.putConstraint(SpringLayout.SOUTH, btnActualizar, -10,SpringLayout.SOUTH, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.WEST, btnActualizar,  220,SpringLayout.WEST, contenedorGeneral);
        btnSgte          = new JButton("Siguiente");
        contenedorGeneral.add(btnSgte);
        layoutSprint.putConstraint(SpringLayout.SOUTH, btnSgte, -10,SpringLayout.SOUTH, contenedorGeneral);
        layoutSprint.putConstraint(SpringLayout.WEST, btnSgte,  320,SpringLayout.WEST, contenedorGeneral);
        /****************  BOTONES ^^^^^^^^^^^^^^^^^^^^ **/
 
        //Se hace visible la ventana
        setVisible(true);
 
    }
 
    public void conectaControlador(ControladorBus c ){
 
        btnAdd.addActionListener(c);
        btnAdd.setActionCommand("INSERTAR");
 
        btnDel.addActionListener(c);
        btnDel.setActionCommand("BORRAR");
 
        btnActualizar.addActionListener(c);
        btnActualizar.setActionCommand("MODIFICAR");
        
        btnSgte.addActionListener(c);
        btnSgte.setActionCommand("SGTE");
 
        tabla.addMouseListener(c);
        //sólo se permite pulsar una fila a la vez.
        tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}