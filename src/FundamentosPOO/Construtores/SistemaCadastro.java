package FundamentosPOO.Construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Kaike", "777");

        pessoa1.setEndereco("Rua Ademar Camargo");


        System.out.printf("\nPessoa 1 chama %s, portador do CPF %s e mora na %s \n", pessoa1.getNome(), pessoa1.getCpf(), pessoa1.getEndereco());
    }
}
