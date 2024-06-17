package FundamentosPOO.VisibilidadeRecursos.Lanchonete.area.cliente.Cliente;

public class Cliente {
    public void entrarLanchonete(){
        System.out.println("Cliente entrou na lanchonete! ");
    }

    public void escolherLanche(){
        System.out.println("Escolhendo lanche!");
    }

    public void fazerPedido(){
        System.out.println("Fazendo o pedido! ");
    }

    public void consumindo(){
        System.out.println("Pedido está uma delícia! ");
    }

    public void finalizarAtendimento(){
        System.out.println("Parceiro fecha a conta pra mim fazendo favor! ");
    }

    private void verificarSaldoAplicativo(){
        System.out.println("Verificando saldo no aplicativo! ");
    }

    public void pagarConta(){
        verificarSaldoAplicativo();
        System.out.println("Pagando conta!");
    }

    public void sairLanchonete(){
        System.out.println("Cliente saiu da lanchonete!");
    }

}
