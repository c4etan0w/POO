
package fatec.poo.model;

/*author 0030482211022
 */
public class FuncionarioHorista extends Funcionario{
    private double valHorTrab;
    private int qtdeHorTrab;

 

    public FuncionarioHorista( int registro, String nome, String dtAdmissao, double valHorTrab) {
        super(registro, nome, dtAdmissao);
        this.valHorTrab = valHorTrab;
    }

 

    public void setQtdeHorTrab(int qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }

    public double calcGratificacao(){
        return(calcSalBruto() * 0.075);
    }

    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto() + calcGratificacao());
    }


    //aplicação do polimorfismo
    public double calcSalBruto(){
        return(valHorTrab * qtdeHorTrab);
    }
}