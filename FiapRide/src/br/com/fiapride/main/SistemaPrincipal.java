package br.com.fiapride.main;


import br.com.fiapride.model.Mochila;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Mochila mochila1 = new Mochila("Aço", 100, 3);
        mochila1.inserirItem(35.0);
        mochila1.retirarItem(12.0);


        Mochila mochila2 = new Mochila("Plastico", 35.0, 2);
        mochila2.inserirItem(34.0);
        mochila2.inserirItem(10.0);



        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Mochila 1 - Material: " + mochila1.getMaterial() + " | Peso Atual: "
                + mochila1.getPesoAtual() + "KG | Quantidade de Bolsos: " +mochila1.getQuantidadeBolsos());
        System.out.println("Mochila 2 - Material: " + mochila2.getMaterial() + " | Peso Atual: "
                + mochila2.getPesoAtual() + "KG | Quantidade de Bolsos: " +mochila2.getQuantidadeBolsos());


    }
}