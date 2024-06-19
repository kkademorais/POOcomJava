package PilaresPOO.MessengerProject;

public class Telegram extends ServicoMensagemInstantanea{

    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram!");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Telegram!");
        salvarHistoricoMensagem();
    }
    private void validarConectadoInternet(){
        System.out.println("Validando pelo Telegram se está conectado a internet!");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando no Telegram o histórico das mensagens!");
    }

}
