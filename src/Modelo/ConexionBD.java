package Modelo;

import java.sql.*;

public class ConexionBD {

    public static Connection getConexion() {
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=SistemaFarmacia;"
                + "user=sa;"
                + "password=sise2021;"
                + "loginTimeout=30";
        try {
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
