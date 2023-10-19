/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luiz Inácio Lula da Silva
 */
public class Exemplo3 {
    public static void main(String[] args) {
      double numero;
      
      numero = Math.random() * 100;
      
      if (numero >50) {
            System.out.println("o numero " + numero + "é maior que 50");
    }
      else {
            System.out.println("o numero " + numero + "é menor ou igual que 50");
      }
    }
    
}
