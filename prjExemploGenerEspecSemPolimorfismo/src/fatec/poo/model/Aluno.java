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
public class Aluno extends Pessoa{
    private int RegEscolar;
    private double Mensalidade;

    public Aluno(int RegEscolar, String nome, String DataNascimento) {
        super(nome, DataNascimento); //chamada do método construtor
                                    //da super classe Pessoa
        this.RegEscolar = RegEscolar; 
    }

    public void setMensalidade(double Mensalidade) {
        this.Mensalidade = Mensalidade;
    }

    public int getRegEscolar() {
        return RegEscolar;
    }

    public double getMensalidade() {
        return Mensalidade;
    }
    
    
    
}
