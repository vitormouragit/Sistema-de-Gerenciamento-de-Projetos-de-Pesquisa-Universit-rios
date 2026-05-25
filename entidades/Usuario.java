package entidades;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario implements UsuarioInterface{
    private String nome;
    private String email;
    private String senha;
    private boolean ativo;
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

    public void ativar(){
        this.ativo = true;
    }

    public void desativar(){
        this.ativo = false;
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

    public abstract String getTipo();

    public String toString(){
        return "Usuario{" + 
        "nome: " + getNome() + 
        ", Email: " + getEmail() + 
        ", Tipo: " + getTipo() + 
        ", Ativo: " + isAtivo() + "}";
    }
    
}