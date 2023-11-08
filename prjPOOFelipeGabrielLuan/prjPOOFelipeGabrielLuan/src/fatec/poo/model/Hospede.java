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
        this.registros = new ArrayList<Registro>();
    }

    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    public String getCpf() {
        return cpf;
    }

    public double getTaxaDesconto() {
        return this.taxaDesconto;
    }
    
public void addRegistro(Registro r) {
        this.registros.add(r);
    }

    public ArrayList<Registro> getRegistros() {
        return this.registros;
    }
    
}
