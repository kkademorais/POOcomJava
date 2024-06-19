package PilaresPOO.MessengerProject;

import java.util.Scanner;
import java.util.Locale;

public class ComputadorBastiao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        ServicoMensagemInstantanea smi = null;


        System.out.println("**Serviços de Mensagem Instantânea Disponíveis**");
        System.out.println("MSN (msn)");
        System.out.println("Facebook (face)");
        System.out.println("Telegram (tg)");
        System.out.println("Digite o aplicativo que deseja entrar: ");
        String appEscolhido = scanner.next();

        System.out.println();
        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
            System.out.println("App escolhido: MSN");
            System.out.println("Entrando no MSN: ");
        }
        else if(appEscolhido.equals("face")){
            smi = new FacebookMessenger();
            System.out.println("App escolhido: Facebook");
            System.out.println("Entrando no Facebook: ");
        }
        else if(appEscolhido.equals("tg")){
            smi = new Telegram();
            System.out.println("App escolhido: Telegram");
            System.out.println("Entrando no Telegram: ");
        }
        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
