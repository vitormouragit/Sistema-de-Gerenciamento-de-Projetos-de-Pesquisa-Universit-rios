import java.util.List;

public interface UsuarioInterface {
    String getNome();
    String getEmail();
    String getSenha();
    void setSenha(String senha);
    boolean isAtivo();
    void ativar();
    void desativar();
    void adicionarNotificacao(String mensagem);
    List<String> getNotificacoes();
    void limparNotificacoes();
    String getTipo();
}