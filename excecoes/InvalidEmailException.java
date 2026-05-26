package excecoes;

public class InvalidEmailException extends RuntimeException{
    public InvalidEmailException(String mensagem){
        super(mensagem);
    }
}