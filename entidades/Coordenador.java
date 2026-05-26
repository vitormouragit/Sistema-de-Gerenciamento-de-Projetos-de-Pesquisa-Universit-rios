package entidades;

import interfaces.UsuarioAtivacao;

public class Coordenador extends Professor implements UsuarioAtivacao{
    
    public Coordenador(String nome, String email, String senha, boolean ativo){
        super(nome, email, senha, ativo);
    }

    public boolean ativar(){
       return true;
    }

    public boolean desativar(){
        return false;
    }

}
