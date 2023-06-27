import java.time.LocalDate;

public class PrestacaoServico extends Juridico{
    private LocalDate contratoInicio;
    private LocalDate contratoFim;

    public PrestacaoServico(String nome, String telefone, String email, Endereco endereco, String cnpj, String inscricaoEstadual, LocalDate contratoInicio, LocalDate contratoFim) {
        super(nome, telefone, email, endereco, cnpj, inscricaoEstadual);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public LocalDate getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(LocalDate contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public LocalDate getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(LocalDate contratoFim) {
        this.contratoFim = contratoFim;
    }

    @Override
    public String toString() {
        return "" +
                super.toString()+
                "contratoInicio=" + contratoInicio +
                ", contratoFim=" + contratoFim ;
    }
}
