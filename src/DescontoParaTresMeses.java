public class DescontoParaTresMeses extends Desconto{
    public DescontoParaTresMeses(Desconto proximo) {
        super(proximo);
    }

    @Override
    public double calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeMeses() >= 3) {
            double desconto = orcamento.getValor() * 0.03;
            orcamento.setTotalDesconto(orcamento.getTotalDesconto() + desconto);
        }
            return proximo.calcular(orcamento);

    }
}
