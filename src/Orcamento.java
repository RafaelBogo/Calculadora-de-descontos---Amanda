public class Orcamento {
    private double valor;
    private int quantidadeMeses;
    private int quantidadeDeAlunos;

    public Orcamento(double valor, int quantidadeMeses, int quantidadeDeAlunos) {
        this.valor = valor;
        this.quantidadeMeses = quantidadeMeses;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public int getQuantidadeMeses() {
        return quantidadeMeses;
    }

    public double getValor() {
        return valor;
    }
}
