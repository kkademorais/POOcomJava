package FundamentosPOO.VisibilidadeRecursos.Lanchonete.Lanchonete;

import FundamentosPOO.VisibilidadeRecursos.Lanchonete.atendimento.cozinha.Almoxarife;
import FundamentosPOO.VisibilidadeRecursos.Lanchonete.atendimento.Atendente.Atendente;
import FundamentosPOO.VisibilidadeRecursos.Lanchonete.area.cliente.Cliente.Cliente;
import FundamentosPOO.VisibilidadeRecursos.Lanchonete.atendimento.cozinha.Cozinheiro;


public class Lanchonete {
    public static void main(String[] args) {
        Almoxarife Almoxarife = new Almoxarife();
        Atendente Atendente = new Atendente();
        Cliente Cliente = new Cliente();
        Cozinheiro Cozinheiro = new Cozinheiro();

        Almoxarife.controlarEntrada();
        Cliente.entrarLanchonete();
        Cliente.escolherLanche();
        Atendente.pegarPedidoMesa();
        Cliente.fazerPedido();
        Atendente.enviandoPedidoCozinha();
        System.out.println();

        Cozinheiro.recebendoPedidoCozinha();
        Cozinheiro.adicionarComboBalcao();
        System.out.println();

        Atendente.pegarPedidoBalcao();
        Atendente.servindoMesa();
        Cliente.consumindo();
        System.out.println();

        Cliente.finalizarAtendimento();
        Cliente.pagarConta();
        Atendente.receberPagamento();
        System.out.println();

        Cliente.sairLanchonete();
        Almoxarife.controlarSaida();
        System.out.println();
    }
}
