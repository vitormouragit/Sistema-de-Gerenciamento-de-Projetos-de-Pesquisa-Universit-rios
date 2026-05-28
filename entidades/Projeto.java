package entidades;
import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private int id;
    private String titulo;
    private String descricao;
    private Professor orientador;
    private String area;
    private String dataInicio;
    private String prazo;
    private int vagas;
    private boolean ativo;
    private List<Aluno> participantes;
    private List<Aluno> solicitantes;
    private List<Relatorio> relatoriosParciais;

    public Projeto(int id, String titulo, String descricao, Professor orientador, String area, String dataInicio, String prazo, int vagas){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.orientador = orientador;
        this.area = area;
        this.dataInicio = dataInicio;
        this.prazo = prazo;
        this.vagas = vagas;
        this.ativo = true;
        this.participantes = new ArrayList<>();
        this.solicitantes = new ArrayList<>();
        this.relatoriosParciais = new ArrayList<>();
    }

    public List<Aluno> getParticipantes() {
        return participantes;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Professor getOrientador() {
        return orientador;
    }

    public String getArea() {
        return area;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getPrazo() {
        return prazo;
    }

    public int getVagas() {
        return vagas;
    }

    public boolean isAtivo() {
        return ativo;
    }

    
    public boolean solicitarParticipacao(Aluno aluno) {
        if (!ativo || solicitantes.contains(aluno) || participantes.contains(aluno) || participantes.size() >= vagas) {
            return false;
        }
        boolean added = solicitantes.add(aluno);
        if (added) {
            coordenador.adicionarNotificacao("Solicitação de participação: " + aluno.getNome() + " no projeto " + this.titulo);
        }
        return added;
    }

    public boolean aceitarParticipacao(Aluno aluno) {
        if (!solicitantes.remove(aluno) || participantsContains(aluno) || participantes.size() >= vagas) {
            return false;
        }
        boolean added = participantes.add(aluno);
        if (added) {
            coordenador.adicionarNotificacao("Aluno " + aluno.getNome() + " aceito no projeto " + this.titulo);
            aluno.adicionarNotificacao("Você foi aceito no projeto: " + this.titulo);
        }
        return added;
    }

    private boolean participantsContains(Aluno aluno) {
        return participantes.contains(aluno);
    }

    public boolean desistirParticipacao(Aluno aluno) {
        boolean removed = participantes.remove(aluno);
        if (removed) {
            coordenador.adicionarNotificacao("Aluno " + aluno.getNome() + " desistiu do projeto " + this.titulo);
            aluno.adicionarNotificacao("Você desistiu do projeto: " + this.titulo);
        }
        return removed;
    }
    
}
