package PilaresPOO.MessengerProject;

public class MSNMessenger extends ServicoMensagemInstantanea{

    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN!");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo MSN!");
        salvarHistoricoMensagem();
    }
    private void validarConectadoInternet(){
        System.out.println("Validando pelo MSN se está conectado a internet!");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando no MSN o histórico das mensagens!");
    }

}
