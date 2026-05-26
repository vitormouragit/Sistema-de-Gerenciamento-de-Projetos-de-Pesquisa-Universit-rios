package interfaces;

public interface UsuarioInterface extends UsuarioBase, UsuarioAtivacao, UsuarioNotificacao{

    String getTipo();
}