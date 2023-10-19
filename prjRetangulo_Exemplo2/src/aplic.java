
import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 *
 * @author Bonoro
 */
public class aplic {

    public static void main(String[] args) {
        Retangulo objRet = new Retangulo(); //instanciação do objeto
        Scanner entrada = new Scanner(System.in);
        double medBase, medAlt;
        int opcao = 0;
        
        //Montar o retângulo
        System.out.println("digite a medida da Base do Retângulo: ");
        medBase = entrada.nextDouble();
        System.out.println("digite a medida da Base do Retângulo: ");
        medAlt = entrada.nextDouble();
        
        objRet.setBase(medBase);
        objRet.setAltura(medAlt);
        
        do {
            System.out.println("\n1-Consultar área do retângulo");
            System.out.println("\n2-Consultar perímetro do retângulo");
            System.out.println("\n3-Consultar diagonal do retângulo");
            System.out.println("\n4-Sair");
            System.out.println("\n\tDigite a opção"); 
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                System.out.println("\nMedida da altura do retângulo: " + objRet.getAltura());
                System.out.println("Medida da base do retângulo: " + objRet.getBase());
                System.out.println("Medida da Área: " + objRet.calcArea());  
            } else
                if (opcao == 2){
                    System.out.println("\nMedida da altura do retângulo: " + objRet.getAltura());
                    System.out.println("Medida da base do retângulo: " + objRet.getBase());
                    System.out.println("Medida do Perímetro: " + objRet.calcPerimetro());
                } else
                if (opcao == 3){
                    System.out.println("\nMedida da altura do retângulo: " + objRet.getAltura());
                    System.out.println("Medida da base do retângulo: " + objRet.getBase());
                    System.out.println("Medida da diagonal: " + objRet.calcDiagonal());
                }
            
        }while(opcao < 4);        
        
    }
    
}
