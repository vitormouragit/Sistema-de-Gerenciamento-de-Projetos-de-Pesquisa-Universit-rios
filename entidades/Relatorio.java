package entidades;

public class Relatorio {
    private final Projeto projeto;
    private final Aluno autor;
    private final String conteudo;
    private boolean validado;

    public Relatorio(Projeto projeto, Aluno autor, String conteudo) {
        this.projeto = projeto;
        this.autor = autor;
        this.conteudo = conteudo;
        this.validado = false;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public Aluno getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public boolean isValidado() {
        return validado;
    }

    public void validar() {
        this.validado = true;
    }
}
