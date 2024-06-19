package PilaresPOO.Pilares;

public abstract class Veiculo {

    //Atributos
    private String Marca;
    private String Modelo;

    //Getters
    public String getMarca() {
        return Marca;
    }
    public String getModelo(){
        return Modelo;
    }

    //Setters
    public void setMarca(String marca) {
        this.Marca = marca;
    }
    public void setModelo(String modelo){
        this.Modelo = modelo;
    }

    //Métodos
    public abstract void ligar();


}
