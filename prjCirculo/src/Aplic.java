
import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 *
 * @author Jorge Wellington
 */
public class Aplic {


    public static void main(String[] args) {
        
        Circulo objCir = new Circulo(); //instanciação do objeto
        Scanner entrada = new Scanner(System.in);
        double medRaio;
        int opcao = 0;
        
        //Montar o retângulo
        System.out.println("Digite a medida raio do Circulo: ");
        medRaio = entrada.nextDouble();

        
        objCir.setRaio(medRaio);
        
        do {
            System.out.println("\n1-Consultar área do circulo");
            System.out.println("\n2-Consultar perímetro do circulo");
            System.out.println("\n3-Consultar diâmetro do circulo");
            System.out.println("\n4-Sair");
            System.out.println("\n\tDigite a opção"); 
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                System.out.println("\nMedida do raio do circulo: " + objCir.getRaio());
                System.out.println("Medida da Área: " + objCir.calcArea());  
            } else
                if (opcao == 2){
                System.out.println("\nMedida do raio do circulo: " + objCir.getRaio());
                    System.out.println("Medida do Perímetro: " + objCir.calcPerimetro());
                } else
                if (opcao == 3){
                System.out.println("\nMedida do raio do circulo: " + objCir.getRaio());
                    System.out.println("Medida do diametro: " + objCir.calcDiametro());
                }
            
        }while(opcao < 4);        
        
    }
    
}
