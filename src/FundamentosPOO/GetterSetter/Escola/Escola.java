package FundamentosPOO.GetterSetter.Escola;
import java.util.Locale;
import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.setNome("Kaike");
        aluno1.setIdade(19);

        System.out.println("Digite seu nome: ");
        String nomeAluno2 = scanner.next();
        System.out.printf("Digite sua idade: ");
        int idadeAluno2 = scanner.nextInt();

        aluno2.setNome(nomeAluno2);
        aluno2.setIdade(idadeAluno2);

        System.out.printf("\nO aluno 1 chama %s e tem %d anos \n", aluno1.getNome(), aluno1.getIdade());

        System.out.printf("\nJá o aluno 2 chama %s e tem %d anos \n", aluno2.getNome(), aluno2.getIdade());
    }
}
