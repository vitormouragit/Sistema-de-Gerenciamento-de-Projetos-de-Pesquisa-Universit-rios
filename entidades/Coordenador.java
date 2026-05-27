package entidades;

import interfaces.UsuarioAtivacao;

public class Coordenador extends Professor implements UsuarioAtivacao{
    
    public Coordenador(String nome, String email, String senha){
        super(nome, email, senha);
    }

    @Override
    public void ativar(){
       this.ativo = true;
    }

    @Override
    public void desativar(){
        this.ativo = false;
    }

}
