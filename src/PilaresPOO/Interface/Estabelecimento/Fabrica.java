package PilaresPOO.Interface.Estabelecimento;

import PilaresPOO.Interface.Equipamentos.Impressora.Impressora;
import PilaresPOO.Interface.Equipamentos.Multifuncional.Multifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Multifuncional mf = new Multifuncional();

        mf.copiar();
        mf.digitalizar();
        mf.imprimir();
    }
}
