package br.com.fiapride.model;

// A Classe define a estrutura. Ela não é o passageiro real, é apenas o modelo.
public class Passageiro {

    public String nome;
    public double saldo;
    public String cpf;

    public Passageiro(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }
    public void adicionarSaldo(double valor){
        if (valor <= 0){
            System.out.println("Erro: o valor da recarga deve ser maior que zero");
            return;
        }
        this.saldo += valor;
        System.out.println("Recarga realizada para " + this.nome + ". Novo saldo:"+ this.saldo);
    }

    public void pagarViagem(double custo){
        if (custo <= 0){
            System.out.println("Erro: o valor da passagem é inválido");
            return;
        }
        this.saldo -= custo;
        System.out.println("Viagem paga. Saldo restante:"+ this.saldo);
    }
}