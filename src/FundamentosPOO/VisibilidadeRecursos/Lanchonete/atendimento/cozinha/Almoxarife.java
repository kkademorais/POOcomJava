package FundamentosPOO.VisibilidadeRecursos.Lanchonete.atendimento.cozinha;

public class Almoxarife {

    //Default
    void trocarGas(){
        System.out.println("Trocando gás da cozinha! ");
        System.out.println("Gás trocado e pronto pra uso! ");
    }

    public void controlarEntrada(){
        System.out.println("Abrindo lanchonete! ");
        System.out.println("Controlando entrada dos clientes!");
    }

    public void controlarSaida(){
        System.out.println("Fechando lanchonete! ");
        System.out.println("Controlando saída dos clientes");
    }
}
