package Concessionaria.main;
import Concessionaria.model.Veiculo.Carro;

public class Concessionaria {
    public static void main(String[] args) {
        Carro carro1 = new Carro(4250, 2012, "branca", "Honda", "Civic");

        Carro carro2 = new Carro(2000, 2018, "preta", "Audi", "TT");

        System.out.printf("\nCarro do pai: \n");
        carro1.mostrarCarro();

        System.out.printf("\nCarro do filho: \n");
        carro2.mostrarCarro();

    }
}
