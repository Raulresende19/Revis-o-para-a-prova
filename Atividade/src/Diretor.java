import java.time.LocalDate;

public class Diretor extends Funcionario implements Contratacao{
    private final double PREMIO = 0.2;

    public Diretor(String nome, String telefone, String email, Endereco endereco, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor, double salario) {
        super(nome, telefone, email, endereco, genero, estadoCivil, dataNascimento, cpf, rg, matricula, setor, salario);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                '}';
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salario * this.PREMIO;
        salarioFinal += super.salario;
        return salarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Funcionario admitido" +funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Funcionario demitido" +funcionario.toString());

    }
}
