package br.com.fiapride.model;

public class Mochila {

    public String material;
    public double pesoAtual;
    public int quantidadeBolsos;
    public double pesoMaximo;

    public Mochila(String material,double pesoMaximo, int quantidadeBolsos) {
        this.material = material;
        this.pesoMaximo = pesoMaximo;
        this.pesoAtual = 0;
        this.quantidadeBolsos = quantidadeBolsos;
    }

    public void inserirItem(double peso) {
        if (pesoAtual >= pesoMaximo || pesoAtual + peso > pesoMaximo) {
            System.out.println("Item ira ultrapassar capacidade maxima da mochila, escolha outro. Peso atual:" + pesoAtual+" KG");
            return;
        }
        pesoAtual += peso;
        System.out.println("Item adicionado! Peso atual:"+ pesoAtual +" KG");
    }

    public void retirarItem(double peso) {
        if (pesoAtual <= 0) {
            System.out.println("Nao é possivel retirar peso,a mochila esta vazia!");
            return;
        }
        pesoAtual -= peso;
        System.out.println("Peso retirado! Peso atual:" + pesoAtual+" KG");


    }
}
