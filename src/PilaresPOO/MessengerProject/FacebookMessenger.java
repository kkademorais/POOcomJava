package PilaresPOO.MessengerProject;

public class FacebookMessenger extends ServicoMensagemInstantanea{

    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook!");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook!");
        salvarHistoricoMensagem();
    }
    private void validarConectadoInternet(){
        System.out.println("Validando pelo Facebook se está conectado a internet!");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando no Facebook o histórico das mensagens!");
    }

}
