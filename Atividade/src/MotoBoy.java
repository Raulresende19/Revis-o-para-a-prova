import java.time.LocalDate;

public class MotoBoy extends Funcionario{
    private String carteiraDeHabilitacao;

    public MotoBoy(String nome, String telefone, String email, Endereco endereco, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor, double salario, String carteiraDeHabilitacao) {
        super(nome, telefone, email, endereco, genero, estadoCivil, dataNascimento, cpf, rg, matricula, setor, salario);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "" +
                super.toString()+
                "carteiraDeHabilitacao='" + carteiraDeHabilitacao ;
    }

    @Override
    public double getSalarioFinal() {
        return salario;
    }
}
