package entidades;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario{
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

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", ativo=" + ativo +
                '}';
    }
    
}