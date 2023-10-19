
package fatec.poo.model;

/**
 *
 * @author Jorge Washington
 */
public class Circulo {
    private String unidadeMedida;
    private double raio;
    
    public Circulo(String unimed){
        unidadeMedida = unimed;
    }

    public Circulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setRaio(double r){
        raio = r;
    }
    public double getRaio (){
        return (raio);
    }
    public double calcArea(){
        return (3.1416 * (Math.pow(raio, 2)));
    }
        
    public String getUnidadeMedida() {
        return unidadeMedida;
    }
    public double calcPerimetro(){
        return (2 * 3.1416 * raio);
    }
    public double calcDiametro (){
        return (2 * raio);
    }
    
    
}
