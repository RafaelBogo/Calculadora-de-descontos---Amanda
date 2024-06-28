public class Main {
    public static void main(String[] args) {
        Orcamento o1 = new Orcamento(55, 3, 2);
        CalcularDesconto calc = new CalcularDesconto();
        System.out.println(calc.calcular(o1));
    }
}