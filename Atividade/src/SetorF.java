public enum SetorF {
    TECNOLOGIA("Tecnologia"),
    MATERIAL_CONSTRUCAO("Material construção"),
    MATERIA_PRIMA("Materia Prima"),
    ALIMENTICIO("Alimento");

    protected final String nome;

    SetorF(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
