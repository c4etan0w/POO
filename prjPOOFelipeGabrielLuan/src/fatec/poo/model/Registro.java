/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 0030482211022
 */
public class Registro {
    private int codigo;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private double valorHospedagem;
    private Recepcionista recepcionista;
    private Quarto quarto;
    private Hospede hospede;
    private ArrayList<ServicoQuarto> servicos;

    public Registro(int codigo, LocalDate dataEntrada,Recepcionista recepcionista  ) {
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        this.recepcionista = recepcionista;
        this.servicos = new ArrayList <ServicoQuarto>();
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public double getValorHospedagem() {
        return valorHospedagem;
    }

    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    public void setRecepcionista(Recepcionista recepcionista) {
        this.recepcionista = recepcionista;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }
    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }


    public ArrayList<ServicoQuarto> getServicos() {
        return servicos;
    }

    public void addServico(ServicoQuarto sq1) {
        this.servicos.add(sq1);
    }

    public void reservarQuarto(Hospede hospede, Quarto quarto) {
	this.hospede = hospede;
        this.quarto = quarto;
        quarto.reservar();
    }

	public double liberarQuarto() {
   double valorHospedagem = this.quarto.getValorDiaria() * (this.dataSaida.getDayOfYear() - this.dataEntrada.getDayOfYear());


    if (this.hospede.getTaxaDesconto() > 0) {
        valorHospedagem = valorHospedagem * (1 - this.hospede.getTaxaDesconto());
    }

    double valorServicos = 0;
    for (ServicoQuarto servicoQuarto : this.servicos) {
        valorServicos += servicoQuarto.getValor();
    }

    return valorHospedagem + valorServicos;
}

  
}
