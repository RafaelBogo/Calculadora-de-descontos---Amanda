public class CalculadoraDesconto {
    public double calcular(Orcamento orcamento){
        Desconto desconto = new DescontoParaTresMeses(new DescontoPara3Alunos(new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
