package Utilities;

import java.sql.*;

public class Conexion {

    private static final String UBICACION_BD = "ProyectosConstruccion.db";

    String url = "jdbc:sqlite:" + UBICACION_BD;
    Connection conn = null;
    
    public Conexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url);
            System.out.println("Conexión Establecida");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ResultSet consultarRegistros(String url) {
        try {
            PreparedStatement pstm = conn.prepareStatement(url);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
