package view;

import com.sun.tools.javac.util.Convert;
import controller.ControladorRequerimientosReto4;
import java.awt.BorderLayout;
import model.vo.*;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class VistaRequerimientosReto4 extends JFrame{
    
    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();
   
   private static final  long serialVersionUID = 1L;
   private JPanel contentPane;
   JScrollPane scrollJass;
   
   String title[] = {"Id Proyecto","Fecha Inicio","Constructora","Serial"};
               
   String data[][] = {{"X","X","X","X"},{"X","X","X","X"}};
   
     
   public VistaRequerimientosReto4(){
       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(450, 200, 800, 650);
       contentPane = new JPanel();
       contentPane.setBorder(new EmptyBorder(5,5,5,5));
       setContentPane(contentPane);
       contentPane.setLayout(null);
       
       JLabel lblTitulo = new JLabel("Reto 5");
       lblTitulo.setBounds(28,6,61,16);
       contentPane.add(lblTitulo);
       
       JButton btnConsulta1 = new JButton("Consulta 1");
       btnConsulta1.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               consulta1();
               
               setLayout(new BorderLayout());
               JTable tabla = new JTable(data,title);
               tabla.setShowHorizontalLines(false);
               tabla.setRowSelectionAllowed(true);
               tabla.setColumnSelectionAllowed(true);
               tabla.setBounds(28,70,737,455);                 
               scrollJass = new JScrollPane(tabla);               
               scrollJass.setBounds(28,70,737,455);
               contentPane.add(scrollJass, BorderLayout.CENTER);                
           }
       });
       
       
       btnConsulta1.setBounds(20,537,133,29);
       contentPane.add(btnConsulta1);
       
       JButton btnConsulta2 = new JButton("Consulta 2");
       btnConsulta2.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               consulta2();
               
               setLayout(new BorderLayout());
               JTable tabla = new JTable(data,title);
               tabla.setShowHorizontalLines(false);
               tabla.setRowSelectionAllowed(true);
               tabla.setColumnSelectionAllowed(true);
               tabla.setBounds(28,70,737,455);               
               scrollJass = new JScrollPane(tabla);              
               scrollJass.setBounds(28,70,737,455);
               contentPane.add(scrollJass, BorderLayout.CENTER); 
           }
       });
       btnConsulta2.setBounds(157,537,133,29);
       contentPane.add(btnConsulta2);
       
       JButton btnConsulta3 = new JButton("Consulta 3");
       btnConsulta3.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               consulta3();
                 
               setLayout(new BorderLayout());
               JTable tabla = new JTable(data,title);
               tabla.setShowHorizontalLines(false);
               tabla.setRowSelectionAllowed(true);
               tabla.setColumnSelectionAllowed(true);
               tabla.setBounds(28,70,737,455);               
               scrollJass = new JScrollPane(tabla);               
               scrollJass.setBounds(28,70,737,455);
               contentPane.add(scrollJass, BorderLayout.CENTER); 
           }
       });
       btnConsulta3.setBounds(294,537,133,29);
       contentPane.add(btnConsulta3);
       
   }
    
    public  void consulta1(){
        //String salida = "-----Consulta 1------- \n\nid_proyecto\tFecha_Ini\tconstructora\tSerial\n\n"; 
               
        try{
            title = new String[4];
            title[0] = "id_proyecto";
            title[1] = "fecha_inicio";
            title[2] = "constructora";
            title[3] = "serial";
            
            ArrayList<Consulta1VO_19> lista = controlador.realizarConsulta1();

            
            //Cada VO cargado, mostrarlo en la vista           
            
            
            data = new String[lista.size()][4];
            int i = 0;
            for (Consulta1VO_19 elemento : lista){
                data[i][0] = String.valueOf(elemento.getIdProyecto());
                data[i][1] = elemento.getFechaInicio();
                data[i][2] = elemento.getConstructora();
                data[i][3] = elemento.getSerial();
                
                i++;
                
            }
            //textArea.setText(salida);
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }      
    }

    public  void consulta2(){
        
        try{
            title = new String[2];
            title[0] = "id_proyecto";
            title[1] = "area_max";
            
            ArrayList<Consulta2VO_19> lista = controlador.realizarConsulta2();

            //Encabezado del resultado
            
            
            //Cada VO cargado, mostrarlo en la vista
            data = new String[lista.size()][2];
            int i = 0;
            for (Consulta2VO_19 elemento : lista){
                
                data[i][0] = String.valueOf(elemento.getIdProyecto());
                data[i][1] = String.valueOf(elemento.getAreaMax());
                
                i++;    
            }
            
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }      
    }


    public  void consulta3(){
        
        try{
            title = new String[2];
            title[0] = "id_proyecto";
            title[1] = "nombreapellido";
            ArrayList<Consulta3VO_19> lista = controlador.realizarConsulta3();

            //Encabezado del resultado
           
            
            //Cada VO cargado, mostrarlo en la vista
            data = new String[lista.size()][2];
            int i = 0;
            for (Consulta3VO_19 elemento : lista){                
                
                data[i][0] = String.valueOf(elemento.getIdProyecto());
                data[i][1] = elemento.getNombreApellido();
                
                i++;
            }
            
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }      
    }

    
}
