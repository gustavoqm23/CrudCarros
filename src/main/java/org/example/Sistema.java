package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sistema {
    //Função para listar carros

    public void listarCarros() {
        try (Connection con = ConexaoDB.conectar()) {
            String sql = "SELECT * FROM tbCarros";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Lista de carros: ");
            while (rs.next()) {
                int id = rs.getInt("idCarro");
                String nome = rs.getString("nome");
                String marca = rs.getString("marca");
                String placa = rs.getString("placa");
                int ano = rs.getInt("ano");

                System.out.println("ID: " + id + ",Nome: " + nome + ",Marca: " + marca + ",Placa: " + placa + ",Ano: " + ano);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Função para listar usuários
    public void listarUsuarios() {
        try (Connection con = ConexaoDB.conectar()) {
            String sql = "SELECT * FROM tbUsuarios";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Lista de Usuários: ");
            while (rs.next()) {
                int id = rs.getInt("idUsuario");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Nome: " + nome + ", CPF: " + cpf + ", Email: " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

