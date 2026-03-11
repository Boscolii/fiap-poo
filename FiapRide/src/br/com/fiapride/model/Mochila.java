package br.com.fiapride.model;

public class Mochila {

    private String material;
    private double pesoAtual;
    private int quantidadeBolsos;
    private double pesoMaximo;

    public Mochila(String material,double pesoMaximo) {
        this.setMaterial(material);
        this.setPesoMaximo(pesoMaximo);
        this.pesoAtual = 0;
        this.quantidadeBolsos = 0;
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


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public int getQuantidadeBolsos() {

        return quantidadeBolsos;
    }

    public void setQuantidadeBolsos(int quantidadeBolsos) {
        if (quantidadeBolsos < 1 || quantidadeBolsos > 10){
            System.out.println("A quantidade de bolsos precisa estar entre 1 e 10");
            return;
        }
        this.quantidadeBolsos = quantidadeBolsos;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }



}
