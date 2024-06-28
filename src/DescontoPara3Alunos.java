public class DescontoPara3Alunos extends Desconto{

    public DescontoPara3Alunos(Desconto proximo) {
        super(proximo);
    }

    @Override
    public double calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeDeAlunos() > 2){
            double desconto = orcamento.getValor() * 0.03;
            orcamento.setTotalDesconto(orcamento.getTotalDesconto() + desconto);
        }
            return proximo.calcular(orcamento);

    }
}
