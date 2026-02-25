package br.com.fiapride.main;


import br.com.fiapride.model.Mochila;

public class SistemaPrincipal {

    public static void main(String[] args) {
        
        Mochila mochila1 = new Mochila();
        mochila1.material = "Couro";
        mochila1.pesoAtual = 10;
        mochila1.quantidadeBolsos = 5;

        
        Mochila mochila2 = new Mochila();
        mochila2.material = "Plastico";
        mochila2.pesoAtual = 12.50;
        mochila2.quantidadeBolsos = 3;
 
       
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Mochila 1 - Material: " + mochila1.material + " | Peso Atual: " + mochila1.pesoAtual + "KG | Quantidade de Bolsos: " +mochila1.quantidadeBolsos);
        System.out.println("Mochila 2 - Material: " + mochila2.material + " | Peso Atual: " + mochila2.pesoAtual + "KG | Quantidade de Bolsos: " +mochila2.quantidadeBolsos);
        
       
    }
}