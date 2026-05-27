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

    public void adicionarParticipante(Aluno aluno) {
        if (this.vagas > 0) {
            this.participantes.add(aluno);
            this.vagas--;
        } else {
            // Aqui futuramente você pode lançar a sua VagasEsgotadasException!
        }
    }
}
