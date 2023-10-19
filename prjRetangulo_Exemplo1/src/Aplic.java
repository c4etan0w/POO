
import fatec.poo.model.Retangulo;

/**
 *
 * @author Jorge Ben Jor
 */
public class Aplic {

    public static void main(String[] args) {
        Retangulo objRet;
        
        objRet = new Retangulo();
        
        //Mecanismo de passagem de mensagens
        objRet.setAltura(5.0);
        objRet.setBase(8.0);    
        System.out.println("Medida da Área: " + objRet.calcArea());
        System.out.println("Medida do Perímetro: " + objRet.calcPerimetro());
    }
    
}
