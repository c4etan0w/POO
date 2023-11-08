/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author 0030482211022
 */
public class Quarto {
    private int numero;
    private String tipo;
    private boolean situacao;
    private double valorDiaria;
    private double totalFaturado;
    private Registro registro;

    public Quarto(int numero, String tipo, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
        this.registro = null;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    } public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }


    public void reservar() {
        this.situacao = true;
    }

    public double liberar(int qtdDiasHospedado) {
        situacao = false;
        double valorHospedagem = valorDiaria * qtdDiasHospedado;
        this.totalFaturado += valorHospedagem;

        return valorHospedagem;
    }
}