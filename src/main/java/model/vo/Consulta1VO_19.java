package model.vo;

import java.sql.Timestamp;

public class Consulta1VO_19 {
    
    int idProyecto;    
    String constructora;
    String serial;
    String fechaInicio;
    
    
    
    
    public void setIdProyecto(int idProyecto){
        this.idProyecto = idProyecto;
    }
            
    public int getIdProyecto(){
        return this.idProyecto;
    }
    
    public void setFechaInicio(String fecha){
        this.fechaInicio = fecha;
    }
            
    public String getFechaInicio(){
        return this.fechaInicio;
    }
    
    public void setConstructora(String constructora){
        this.constructora = constructora;
    }
            
    public String getConstructora(){
        return this.constructora;
    }
    
    public  void setSerial(String serial){
        this.serial = serial;
    }
            
    public String getSerial(){
        return this.serial;
    }
    
    
}
