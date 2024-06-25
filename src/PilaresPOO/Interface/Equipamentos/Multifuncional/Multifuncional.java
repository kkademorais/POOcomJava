package PilaresPOO.Interface.Equipamentos.Multifuncional;

import PilaresPOO.Interface.Equipamentos.Copiadora.Copiadora;
import PilaresPOO.Interface.Equipamentos.Digitalizadora.Digitalizadora;
import PilaresPOO.Interface.Equipamentos.Impressora.Impressora;

public class Multifuncional implements Digitalizadora, Impressora, Copiadora {
    @Override
    public void digitalizar() {
        System.out.println("Digitalizando pela Multifuncional...");
    }

    @Override
    public void copiar() {
        System.out.println("Copiando pela Multifuncional...");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo pela Multifuncional...");
    }
}
