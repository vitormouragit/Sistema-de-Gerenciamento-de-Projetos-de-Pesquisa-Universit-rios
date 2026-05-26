package entidades;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario{
    private String nome;
    private String email;
    private String senha;
    private boolean ativo;
    private List<String> notificacoes;

    public Usuario(String nome, String email, String senha, boolean ativo){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.ativo = ativo;
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

    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }

    public void adicionarNotificacao(String mensagem){
        this.notificacoes.add(mensagem);
        
    }

    public List<String> getNotificacoes(){
        return new ArrayList<>(notificacoes);
    }

    public void limparNotificacoes(){
        this.notificacoes.clear();
    }

    public abstract String toString();
    
}