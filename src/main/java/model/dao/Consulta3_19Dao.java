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

public class Consulta3_19Dao {
    
    Connection conn = null;
    Statement comando = null;
    ResultSet result = null;
    
    ArrayList<Consulta3VO_19> lista = new ArrayList();
    
   
    public ArrayList<Consulta3VO_19> consulta3DAO() throws SQLException{
       
        JDBCUtilities objJdbc = new JDBCUtilities();

         conn = objJdbc.getConnection();
         comando = conn.createStatement();
         result = comando.executeQuery("SELECT P.ID_PROYECTO, L.Nombre   || \" \" || L.Primer_Apellido as nombreapellido  FROM PROYECTO P INNER JOIN LIDER L ON P.ID_Lider  = L.ID_Lider WHERE P.Banco_Vinculado  = 'Bancolombia';");

         while (result.next()){
             int idProyecto = result.getInt("ID_PROYECTO");
             String nombre = result.getString("nombreapellido");           

             Consulta3VO_19 obj = new Consulta3VO_19();

             obj.setIdProyecto(idProyecto);
             obj.setNombreApellido(nombre);

             lista.add(obj);

         }        

         return lista;
        
    }  
}
