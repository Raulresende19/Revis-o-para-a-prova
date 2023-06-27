public class Fornecedor extends Juridico{
    private Setor setor;
    private Produto produto;

    public Fornecedor(String nome, String telefone, String email, Endereco endereco, String cnpj, String inscricaoEstadual, Setor setor, Produto produto) {
        super(nome, telefone, email, endereco, cnpj, inscricaoEstadual);
        this.setor = setor;
        this.produto = produto;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "" +
                super.toString()+
                "setor=" + setor +
                ", produto=" + produto ;
    }
}
