import entidades.Professor;

public class Projeto {
    private int id;
    private String titulo;
    private String descricao;
    private Professor coordenador;
    private String area;
    private String dataInicio;
    private String prazo;
    private int vagas;
    private boolean ativo;

    public Projeto(int id, String titulo, String descricao, Professor coordenador, String area, String dataInicio, String prazo, int vagas){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.coordenador = coordenador;
        this.area = area;
        this.dataInicio = dataInicio;
        this.prazo = prazo;
        this.vagas = vagas;
        this.ativo = true;
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

    public Professor getCoordenador() {
        return coordenador;
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
}
