package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.*;

public class Consulta2_19Dao {
    
    Connection conn = null;
    Statement comando = null;
    ResultSet result = null;
    
    ArrayList<Consulta2VO_19> lista = new ArrayList();
    
   
    
    public ArrayList<Consulta2VO_19> consulta2DAO() throws SQLException{
        
        
        JDBCUtilities objJdbc = new JDBCUtilities();

         conn = objJdbc.getConnection();
         comando = conn.createStatement();
         result = comando.executeQuery("SELECT P.ID_PROYECTO, T.Area_Max  FROM PROYECTO P INNER JOIN TIPO T ON P.ID_Tipo  = T.ID_Tipo WHERE P.Numero_Habitaciones = 2");

         while (result.next()){
             int idProyecto = result.getInt("ID_PROYECTO");
             int area = result.getInt("Area_Max");           

             Consulta2VO_19 obj = new Consulta2VO_19();

             obj.setIdProyecto(idProyecto);
             obj.setAreaMax(area);

             lista.add(obj);

         }

         return lista;      
        
    }  
}
