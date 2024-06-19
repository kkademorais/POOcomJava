package PilaresPOO.Pilares;

public class Carro extends Veiculo{

    //Métodos
    public void darCavaloPau(){
        System.out.println("Dando cavalo de pau como se tivesse no gelo!!");
        System.out.println("Shit it's Brian!!");
    }

    private void confereCombustivel(){
        System.out.println("Conferindo combustível!");
    }
    private void confereCambio(){
        System.out.println("Conferindo câmbio em P!");
    }

    public void ligar(){
        confereCombustivel();
        confereCambio();
        System.out.println("Carro ligado!");
    }

}
