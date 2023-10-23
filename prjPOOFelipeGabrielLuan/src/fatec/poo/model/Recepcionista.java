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
public class Recepcionista extends Pessoa {
    private int regFunc;
    private String turno;
    private ArrayList<Registro> registros;
    
    public Recepcionista(int regFunc, String nome) {
        super(nome);
        this.regFunc = regFunc;
        this.registros = new ArrayList<>();
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getRegFunc() {
        return this.regFunc;
    }

    public String getTurno() {
        return this.turno;
    }

 public void adicionarRegistro(Registro registro) {
        this.registros.add(registro);
    }

    public ArrayList<Registro> getRegistros() {
        return this.registros;
    }
}
