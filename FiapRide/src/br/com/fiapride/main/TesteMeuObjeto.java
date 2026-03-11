package br.com.fiapride.main;
import br.com.fiapride.model.Mochila;

public class TesteMeuObjeto {
    public static void main(String[] args) {
    Mochila mochila1 = new Mochila("Metal", 50);
    mochila1.setQuantidadeBolsos(0);
    mochila1.inserirItem(2);


    Mochila mochila2 = new Mochila("Plastico",25);
    mochila2.setQuantidadeBolsos(11);
    mochila2.inserirItem(10);
    mochila2.retirarItem(9);

        System.out.println("Mochila 1 - Material: " + mochila1.getMaterial() + "| Peso Atual: "
        + mochila1.getPesoAtual() + "KG| Quantidade de bolsos: " + mochila1.getQuantidadeBolsos());

        System.out.println("Mochila 2 - Material: " + mochila2.getMaterial() + "| Peso Atual: "
                + mochila2.getPesoAtual() + "KG| Quantidade de bolsos: " + mochila2.getQuantidadeBolsos());


    }
}
