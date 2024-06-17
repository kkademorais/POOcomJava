package FundamentosPOO.VisibilidadeRecursos.Lanchonete.atendimento.cozinha;

public class Cozinheiro {

    public void recebendoPedidoCozinha(){
        System.out.println("Recebendo pedido do cliente na cozinha! ");
        Almoxarife parceiro = new Almoxarife();
        pedirTrocarGas(parceiro);
        prepararCombo();
    }

    public void adicionarLancheBalcao(){
        System.out.println("Adicionando lanche natural no balcão! ");
    }

    public void adicionarSucoBalcao(){
        System.out.println("Adicionando suco natural no balcão! ");
    }

    public void adicionarComboBalcao(){
        adicionarLancheBalcao();
        adicionarSucoBalcao();
        System.out.println("Combo adicionado! ");
    }

    //Privado
    private void prepararLanche(){
        System.out.println("Preparando lanche! Pronto em: 15 minutos");
    }

    //Privado
    private void prepararVitamina(){
        System.out.println("Preparando vitamina! Pronto em: 5 minutos");
    }

    //Privado
    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
        System.out.println("Preparando combo!");
    }

    //Default
    void pedirTrocarGas(Almoxarife parceiro){
        parceiro.trocarGas();
    }


}
