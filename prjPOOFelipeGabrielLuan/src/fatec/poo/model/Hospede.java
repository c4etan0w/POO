/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author 0030482211022
 */
public class Hospede extends Pessoa {
    private String cpf;
    private double taxaDesconto;
    private ArrayList<Registro> registros;
    
    public Hospede(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
        this.registros = new ArrayList<>();
    }

    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getTaxaDesconto() {
        return this.taxaDesconto;
    }
    
public void adicionarRegistro(Registro registro) {
        this.registros.add(registro);
    }

    public ArrayList<Registro> getRegistros() {
        return this.registros;
    }
    
}
