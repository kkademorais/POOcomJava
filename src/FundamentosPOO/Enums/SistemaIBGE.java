package FundamentosPOO.Enums;

public class SistemaIBGE {
    public static void main(String[] args) {
        System.out.printf("\nEstados registrados no IBGE 2024:\n");
        for(EstadosBrasileiros e: EstadosBrasileiros.values()){
            System.out.printf("%s => %s -> %d\n", e.getSigla(), e.getNome(), e.getDdd());
        }

        EstadosBrasileiros estadoNascimento = EstadosBrasileiros.MinasGerais;

        System.out.printf("\nEu nasci no estado de %s \n", estadoNascimento.getNome());
    }
}
