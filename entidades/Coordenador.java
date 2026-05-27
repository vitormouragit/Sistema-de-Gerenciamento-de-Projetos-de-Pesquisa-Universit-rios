package entidades;

public class Coordenador extends Professor {
    
    public Coordenador(String nome, String email, String senha){
        super(nome, email, senha);
    }

    public void alterarStatusUsuario(Usuario usuario, boolean novoStatus) {
        usuario.setAtivo(novoStatus);
    }
}
