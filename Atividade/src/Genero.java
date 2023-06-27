public enum Genero {
    MASCULINO('M',"Masculino"),
    FEMININO('F',"Feminono");

    protected final char caractere;
    protected final String texto;

    Genero(char caractere, String texto) {
        this.caractere = caractere;
        this.texto = texto;
    }

    public char getCaractere() {
        return caractere;
    }

    public String getTexto() {
        return texto;
    }
}
