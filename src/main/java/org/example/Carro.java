package org.example;

public class Carro {
    private int id;
    private String nome;
    private String marca;
    private String placa;
    private int ano;

    public Carro(int id, String nome, String marca, String placa, int ano) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.placa = placa;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno(){
        return ano;
    }
}
