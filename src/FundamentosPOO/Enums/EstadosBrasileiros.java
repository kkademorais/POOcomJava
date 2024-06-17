package FundamentosPOO.Enums;

public enum EstadosBrasileiros {
    SaoPaulo ("SP", "São Paulo", 11),
    MinasGerais ("MG", "Minas Gerais", 34),
    RioJaneiro ("RJ", "Rio de Janeiro", 17);

    private EstadosBrasileiros(String sigla, String nome, int ddd){
        this.sigla = sigla;
        this.nome = nome;
        this.ddd = ddd;
    }

    private String sigla;
    private String nome;
    private int ddd;

    public String getSigla(){
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getDdd() {
        return ddd;
    }
}
