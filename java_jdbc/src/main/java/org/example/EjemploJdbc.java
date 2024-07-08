package org.example;

import java.sql.*;

public class EjemploJdbc  {
    public static void main(String[] args){

        String url= "jdbc:mysql://localhost:3306/sidecarenterprise?serverTimezone=UTC";
        String username= "root";
        String password= "";
        Connection conn= null;
        Statement stmt= null;
        ResultSet resultado= null;

        try {
            conn= DriverManager.getConnection(url, username, password);
            stmt= conn.createStatement();
            resultado= stmt.executeQuery("SELECT * FROM marketing");

            while(resultado.next()){
                System.out.println(resultado.getString("Nom"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }finally {
            try {
                stmt.close();
                conn.close();
                resultado.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }
}


