import entidades.Aluno;
import entidades.Coordenador;
import entidades.Professor;
import entidades.Projeto;
import entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaPrincipal {

    private static List<Usuario> listaUsuarios = new ArrayList<>();
    private static List<Projeto> listaProjetos = new ArrayList<>();
    
    private static Usuario usuarioLogado = null; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        inicializarDados();

        int opcao = 0;
        
        while (opcao != 3) {
            System.out.println("\n--- SISTEMA DE PESQUISA UFC ---");
            System.out.println("1 - Realizar Login");
            System.out.println("2 - Cadastrar-se (Aluno)");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Digite o e-mail: ");
                    String email = scanner.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = scanner.nextLine();
                    
                    fazerLogin(email, senha);
                    break;
                case 2:
                    System.out.println("Funcionalidade de cadastro a ser implementada...");
                    break;
                case 3:
                    System.out.println("Sistema encerrado. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        
        scanner.close();
    }

    private static void fazerLogin(String email, String senha) {
        boolean sucesso = false;

        for (Usuario u : listaUsuarios) {
            if (u.autenticar(email, senha)) {
                usuarioLogado = u;
                sucesso = true;
                break;
            }
        }

        if (sucesso) {
            System.out.println("\n-> Login efetuado com sucesso! Bem-vindo, " + usuarioLogado.getNome() + ".");
            
            usuarioLogado.exibirMenu(); 
            
            usuarioLogado = null; 
        } else {
            System.out.println("\n[Erro] E-mail incorreto, senha incorreta ou utilizador desativado.");
        }
    }

    private static void inicializarDados() {
        listaUsuarios.add(new Aluno("Carlos Silva", "carlos@ufc.br", "aluno123"));
        listaUsuarios.add(new Professor("Prof. Alan", "alan@ufc.br", "prof123"));
        listaUsuarios.add(new Coordenador("Coord. Maria", "maria@ufc.br", "coord123"));
    }
}