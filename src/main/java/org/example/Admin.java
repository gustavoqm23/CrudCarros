package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Admin extends Usuario {
    public Admin(int id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
    }

    //Função para cadastrar um carro
    public void cadastrarCarro(String nome,String marca,String placa,int ano) {
        try(Connection con = ConexaoDB.conectar()) {
            String sql = "INSERT INTO tbCarros(nome, marca, placa, ano) VALUES(?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, marca);
            stmt.setString(3, placa);
            stmt.setInt(4, ano);

            stmt.executeUpdate();
            System.out.println("Carro cadastrado com sucesso!");
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    //Função para editar um carro
    public void editarCarro(int id, String nome, String marca, String placa, int ano){
        try(Connection con = ConexaoDB.conectar()) {
            String sql = "UPDATE tbCarros SET nome = ?, marca = ?, placa = ?, ano = ? WHERE idCarro = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, marca);
            stmt.setString(3, placa);
            stmt.setInt(4, ano);
            stmt.setInt(5, id);

            stmt.executeUpdate();
            System.out.println("Carro editado com sucesso!");
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void excluirCarro(int id){
        try(Connection con = ConexaoDB.conectar()){
            String sql = "DELETE FROM tbCarros WHERE idCarro = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.executeUpdate();
            System.out.println("Carro excluído com sucesso!");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
