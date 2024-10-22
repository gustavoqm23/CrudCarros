package org.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ConexaoDB {
    // Parâmetros de conexão
    private static final String URL = "jdbc:postgresql://localhost:5432/dbAv2";
    private static final String USER = "postgres";
    private static final String PASSWORD = "root";

    // Método para conectar ao banco de dados
    public static Connection conectar() {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão estabelecida com sucesso.");
            return con;
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null; // Retorna null em caso de falha na conexão
        }
    }
}





/*

public class ConexaoDB {
    private static final String URL = "jdbc:postgresql://localhost:5432/dbAv2";
    private static final String USER = "postgres";
    private static final String PASSWORD = "root";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

*/

