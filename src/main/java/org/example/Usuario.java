package org.example;

public class Usuario {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;

    public Usuario(int id, String nome, String cpf, String senha, String s) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getEmail(){
        return email;
    }

    public String getSenha(){
        return senha;
    }
}
