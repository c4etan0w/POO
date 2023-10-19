
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;


public class Aplic {

    public static void main(String[] args) {
       
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,"Pedro Silveira", "14/05/1977", 15.80);
        
        funcHor.setQtdeHorTrab(140);
        funcHor.setCargo("Delegado");
        System.out.println("\n\tFuncionario Horista");
        System.out.println("Nome            =>  " + funcHor.getNome());
        System.out.println("Registro        =>  " + funcHor.getRegistro());
        System.out.println("Data Admissão   =>  " + funcHor.getDtAdmissao());
        System.out.println("Cargo           =>  " + funcHor.getCargo());
        System.out.println("Salário Bruto   =>  " + df.format(funcHor.calcSalBruto()));
        System.out.println("Gratificação    =>  " + df.format(funcHor.calcGratificacao()));
        System.out.println("Desconto        =>  " + df.format(funcHor.calcDesconto()));
        System.out.println("Salário Liquido =>  " + df.format(funcHor.calcSalLiquido()));
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(1234, "Gabriel o Gol", "30/08/1996", 1320);
        
        funcMen.setNumSalMin(5);
        funcMen.setCargo("Modelo");
        System.out.println("\n\tFuncionario Mensalista");
        System.out.println("Nome            =>  " + funcMen.getNome());
        System.out.println("Registro        =>  " + funcMen.getRegistro());
        System.out.println("Data Admissão   =>  " + funcMen.getDtAdmissao());
        System.out.println("Cargo           =>  " + funcMen.getCargo());
        System.out.println("Salário Bruto   =>  " + df.format(funcMen.calcSalBruto()));
        System.out.println("Desconto        =>  " + df.format(funcMen.calcDesconto()));
        System.out.println("Salário Liquido =>  " + df.format(funcMen.calcSalLiquido()));
        
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(777, "Maria Gabriela", "26/04/2005", 2.5);
        
        
        System.out.println("\n\tFuncionario Comissionado");
        
        funcCom.setCargo("Estagiária");
        funcCom.addVendas(6410);
        funcCom.setSalBase(1320.00);
        
        System.out.println("Nome            =>  " + funcCom.getNome());
        System.out.println("Registro        =>  " + funcCom.getRegistro());
        System.out.println("Data Admissão   =>  " + funcCom.getDtAdmissao());
        System.out.println("Cargo           =>  " + funcCom.getCargo());
        System.out.println("Salário Bruto   =>  " + df.format(funcCom.calcSalBruto()));
        System.out.println("Desconto        =>  " + df.format(funcCom.calcDesconto()));
        System.out.println("Gratificação    =>  " + df.format(funcCom.calcGratificacao()));
        System.out.println("Salário Liquido =>  " + df.format(funcCom.calcSalLiquido()));
    }
    
}
