package interfaces;

public interface UsuarioBase {
    String getNome();
    String getEmail();
    String getSenha();
    void setSenha(String senha);
}