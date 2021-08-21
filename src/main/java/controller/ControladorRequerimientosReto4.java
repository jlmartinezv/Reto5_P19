package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Modelos (acceso y objetos contenedores)
import model.dao.*;
import model.vo.*;

//Librerías para bases de datos
import java.sql.SQLException;

public class ControladorRequerimientosReto4 {       

   
    
    public ArrayList<Consulta1VO_19> realizarConsulta1()  throws SQLException{
        Consulta1_19Dao obj = new Consulta1_19Dao();
        return obj.consulta1DAO();
    }
    
    public ArrayList<Consulta2VO_19> realizarConsulta2() throws SQLException{
        Consulta2_19Dao obj = new Consulta2_19Dao();
        return obj.consulta2DAO();
    }
    
    public ArrayList<Consulta3VO_19> realizarConsulta3() throws SQLException{
        Consulta3_19Dao obj = new Consulta3_19Dao();
        return obj.consulta3DAO();
    }
}
