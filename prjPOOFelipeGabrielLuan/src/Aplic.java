import fatec.poo.model.Hospede;
import fatec.poo.model.Quarto;
import fatec.poo.model.Recepcionista;
import fatec.poo.model.Registro;
import fatec.poo.model.ServicoQuarto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author andre
 */
public class Aplic {

    public static void main(String[] args) {
        Hospede h1 = new Hospede("12312412", "Julia Cassemiro");
        h1.setEndereco("Rua não sabo");
        h1.setTelefone("9999999");
        h1.setTaxaDesconto(10.0);
        
        Recepcionista r1 = new Recepcionista(123, "Rarissa Correa");
        r1.setEndereco("Rua maraca");
        r1.setTelefone("88888888");
        r1.setTurno("N");
        
        Quarto q1 = new Quarto(10, "D", 500.00);
        
        ServicoQuarto sq1 = new ServicoQuarto(1, "Comida");
        sq1.setValor(100.00);
        
        ServicoQuarto sq2 = new ServicoQuarto(2, "Afonsada");
        sq2.setValor(999999.00);
        
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse("15/10/2023", f1);
        
        Registro reg1 = new Registro(1234, data, r1);
        
        reg1.reservarQuarto(h1, q1);
        reg1.setDataSaida(LocalDate.now());
        reg1.addServico(sq1);
        reg1.addServico(sq1);
        
        double val = reg1.liberarQuarto();
        
        System.out.println(reg1.getQuarto().getSituacao());
        System.out.println(val);
    }
    
}
