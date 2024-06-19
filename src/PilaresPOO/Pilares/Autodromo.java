package PilaresPOO.Pilares;

public class Autodromo {
    public static void main(String[] args) {
        Carro Civic = new Carro();
        Carro HB20 = new Carro();

        Civic.setMarca("Honda");
        Civic.setModelo("Civic");
        System.out.printf("\nEntrando no Carro: %s %s\n", Civic.getMarca(), Civic.getModelo());
        Civic.ligar();

        HB20.setMarca("Hyundai");
        HB20.setModelo("HB20");
        System.out.printf("\nEntrando no Carro: %s %s\n", HB20.getMarca(), HB20.getModelo());
        HB20.ligar();


        Moto XRE = new Moto();

        XRE.setMarca("Honda");
        XRE.setModelo("XRE");
        System.out.printf("\nSubindo na Moto: %s %s\n", XRE.getMarca(), XRE.getModelo());
        XRE.ligar();

        System.out.println();

        Civic.darCavaloPau();
        System.out.println();
        XRE.darGrau();

    }
}
