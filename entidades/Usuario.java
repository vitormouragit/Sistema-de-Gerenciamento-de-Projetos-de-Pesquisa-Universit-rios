package entidades;

import interfaces.UsuarioNotificacao;
import java.util.ArrayList;
import java.util.List;

public abstract class Usuario implements UsuarioNotificacao{
    private String nome;
    private String email;
    private String senha;
    protected boolean ativo;
    private List<String> notificacoes;

    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.ativo = true;
        this.notificacoes = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public boolean isAtivo(){
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public void adicionarNotificacao(String mensagem) {
        this.notificacoes.add(mensagem);
    }

    @Override
    public List<String> getNotificacoes() {
        return this.notificacoes;
    }

    @Override
    public void limparNotificacoes() {
        this.notificacoes.clear();
    }

    public abstract void exibirMenu();
}