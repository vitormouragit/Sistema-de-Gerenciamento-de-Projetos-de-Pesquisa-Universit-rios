package entidades;

public class Aluno extends Usuario{

    public Aluno(String nome, String email, String senha){
        super(nome, email, senha);
    }

    @Override
    public void exibirMenu(){

    }

    public boolean solicitarParticipacao(Projeto projeto) {
        return projeto.solicitarParticipacao(this);
    }
}
