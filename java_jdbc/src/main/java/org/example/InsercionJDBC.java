package org.example;

import java.sql.*;

public class InsercionJDBC {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/eventos?serverTimezone=UTC";
        String username = "root";
        String password = "";
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = DriverManager.getConnection(url, username, password);

            // Creamos una tabla "empleados" si no existe
            String createTableSQL = "CREATE TABLE IF NOT EXISTS PresupuestoEvento (id INT AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(255), presupuesto DOUBLE)";
            stmt = conn.prepareStatement(createTableSQL);
            stmt.execute();

            // Insertamos un nuevo evento
            String insertSQL = "INSERT INTO PresupuestoEvento (nombre, presupuesto) VALUES (?, ?)";
            stmt = conn.prepareStatement(insertSQL);
            stmt.setString(1, "Cena de Navidad");
            stmt.setDouble(2, 50000.0);
            stmt.executeUpdate();

            System.out.println("Fila insertada correctamente.");

        } catch (SQLException e) {
            throw new RuntimeException(e);

        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

