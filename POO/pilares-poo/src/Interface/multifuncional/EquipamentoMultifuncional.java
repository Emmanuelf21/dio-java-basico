package Interface.multifuncional;

import Interface.equipamentos.copiadora.Copiadora;
import Interface.equipamentos.digitalizadora.Digitalizadora;
import Interface.equipamentos.impressora.Impressora;

//Java não permite herança multipla
//ou seja, não é possivel usar extends para cada classe
//para poder representar a henrança multipla, usamos interface e implements
public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional.");
    }
    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional.");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional.");
    }
}
