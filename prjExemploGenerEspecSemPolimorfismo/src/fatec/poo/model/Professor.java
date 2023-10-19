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
public class Professor extends Pessoa{
    private int RegFuncional;
    private double Salario;

    public Professor(int RegFuncional, String nome, String DataNascimento) {
        super(nome, DataNascimento);
        this.RegFuncional = RegFuncional;
    }

    public int getRegFuncional() {
        return RegFuncional;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }


    
    
}
