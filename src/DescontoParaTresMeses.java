public class DescontoParaTresMeses extends Desconto{
    public DescontoParaTresMeses(Desconto proximo) {
        super(proximo);
    }

    @Override
    public double calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeMeses() >= 3){
            return proximo.calcular(new Orcamento(orcamento.getValor() * 0.97, orcamento.getQuantidadeDeAlunos(), orcamento.getQuantidadeMeses()));
        } else {
            return proximo.calcular(orcamento);
        }

    }
}
