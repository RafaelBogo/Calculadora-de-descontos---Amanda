public class DescontoPara3Alunos extends Desconto{

    public DescontoPara3Alunos(Desconto proximo) {
        super(proximo);
    }

    @Override
    public double calcular(Orcamento orcamento) {
        double total;
        if (orcamento.getQuantidadeDeAlunos() > 2){
            return proximo.calcular(new Orcamento(orcamento.getValor() * 0.97, orcamento.getQuantidadeMeses(), orcamento.getQuantidadeDeAlunos()));
        } else {
            return proximo.calcular(orcamento);
        }

    }
}
