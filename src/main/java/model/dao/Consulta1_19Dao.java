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

public class Consulta1_19Dao {
    
    Connection conn = null;
    Statement comando = null;
    ResultSet result = null;
    ArrayList<Consulta1VO_19> lista = new ArrayList();
    
    
    
    public ArrayList<Consulta1VO_19> consulta1DAO() throws SQLException {
        
            
        JDBCUtilities objJdbc = new JDBCUtilities();

        conn = objJdbc.getConnection();
        comando = conn.createStatement();
        result = comando.executeQuery("SELECT ID_Proyecto, Fecha_Inicio, Constructora, Serial FROM PROYECTO WHERE ID_PROYECTO < 15");
        //result = comando.executeQuery("SELECT ID_Proyecto, Constructora, Serial FROM PROYECTO WHERE ID_PROYECTO < 15");

        while (result.next()){
            int idProyecto = result.getInt("ID_Proyecto");
            String fechaIni = result.getString("Fecha_Inicio");
            String constructora = result.getString("Constructora");
            String serial = result.getString("Serial");            
            Consulta1VO_19 obj = new Consulta1VO_19();

            obj.setIdProyecto(idProyecto);
            obj.setFechaInicio(fechaIni);                
            obj.setConstructora(constructora);                
            obj.setSerial(serial);                

            lista.add(obj);

        }   

        return lista;
    }  
}
