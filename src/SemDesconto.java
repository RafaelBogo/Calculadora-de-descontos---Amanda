public class SemDesconto extends Desconto{

    public SemDesconto() {
        super(null);
    }

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getValor();
    }
}
