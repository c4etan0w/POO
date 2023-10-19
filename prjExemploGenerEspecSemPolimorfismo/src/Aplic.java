
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
import java.text.DecimalFormat;


public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        Aluno objAluno = new Aluno(1010, "Carlos Silveira", "15/03/1978");
        Professor objProfessor = new Professor (2, "Dimas Cardoso", "14/05/1968");
        
        objAluno.setMensalidade(1500);
        System.out.println("Registro Escolar: " + objAluno.getRegEscolar());
        System.out.println("Nome: " + objAluno.getNome());
        System.out.println("Data Nascimento: " + objAluno.getDataNascimento());
        System.out.println("Mensalidade: " + df.format(objAluno.getMensalidade()));
        
        objProfessor.setSalario(12000);
        System.out.println("Registro Funcional: " + objProfessor.getRegFuncional());
        System.out.println("Nome: " + objProfessor.getNome());
        System.out.println("Data Nascimento: " + objProfessor.getDataNascimento());
        System.out.println("Mensalidade: " + df.format(objProfessor.getSalario()));
                

    }
    
}
