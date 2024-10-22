package org.example;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Admin admin = new Admin(1, "Admin", "029.055.873-50","gustavo@gmail.com","senha123");

        Scanner sc = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("=====MENU=====");
            System.out.println("1 - CADASTRAR CARRO");
            System.out.println("2 - EDITAR CARRO");
            System.out.println("3 - EXCLUIR CARRO");
            System.out.println("4 - LISTAR CARROS");
            System.out.println("0 - SAIR");

            escolha = sc.nextInt();

            switch(escolha) {
                case 1:
                    System.out.println("Nome do carro: ");
                    String nome = sc.next();

                    System.out.println("Marca do carro: ");
                    String marca = sc.next();

                    System.out.println("Placa do carro: ");
                    String placa = sc.next();

                    System.out.println("Ano do carro: ");
                    int ano = sc.nextInt();

                    admin.cadastrarCarro(nome, marca, placa, ano);
                    break;

                case 2:
                    System.out.println("ID do carro a editar: ");
                    int idEditar = sc.nextInt();

                    System.out.println("Novo nome: ");
                    String novoNome = sc.next();

                    System.out.println("Nova marca: ");
                    String novaMarca = sc.next();

                    System.out.println("Nova placa: ");
                    String novaPlaca = sc.next();

                    System.out.println("Novo ano: ");
                    int novoAno = sc.nextInt();

                    admin.editarCarro(idEditar, novoNome, novaMarca, novaPlaca, novoAno);
                    break;

                case 3:
                    System.out.print("ID do carro a excluir: ");
                    int idExcluir = sc.nextInt();

                    admin.excluirCarro(idExcluir);
                    break;

                case 4:
                    sistema.listarCarros();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while (escolha != 0);

        sc.close();
    }
}