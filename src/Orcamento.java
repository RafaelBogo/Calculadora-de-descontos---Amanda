public class Orcamento {
    private double valor;
    private int quantidadeMeses;
    private int quantidadeDeAlunos;
    private double totalDesconto;

    public double getTotalDesconto() {
        return totalDesconto;
    }

    public double setTotalDesconto(double totalDesconto) {
        this.totalDesconto = totalDesconto;
        return totalDesconto;
    }

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
