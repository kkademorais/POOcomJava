package PilaresPOO.Pilares;

public class Moto extends Veiculo{

    //Métodos
    public void darGrau(){
        System.out.println("Empinando a moto como se fosse pipa!!");
        System.out.println("Moleque zica!!");
    }

    private void colocarCapacete(){
        System.out.println("Colocando capacete!");
    }

    public void ligar(){
        colocarCapacete();
        System.out.println("Moto ligada!");
    }

}
