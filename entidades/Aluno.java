package entidades;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario{

    public Aluno(String nome, String email, String senha){
        super(nome, email, senha);
    }

    @Override
    public String getTipo(){
        return "Aluno";
    }
}
