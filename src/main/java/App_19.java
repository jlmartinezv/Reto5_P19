
import view.*;

import java.awt.EventQueue;


/**
 * Persistencia Proyectos Construcción
 *
 */
public class App_19 {
    
    
    public static void main( String[] args ){        

        
        //Casos de prueba 
        //Consulta 1
        /*VistaRequerimientosReto4.consulta1();
        System.out.println();
        //Consulta 2
        VistaRequerimientosReto4.consulta2();
        System.out.println();
        //Consulta 3
        VistaRequerimientosReto4.consulta3();
        System.out.println();*/
        //////////Fin de los llamados a los requerimientos
        
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                try{
                    VistaRequerimientosReto4 frame = new VistaRequerimientosReto4();
                    frame.setVisible(true);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

    }
}
