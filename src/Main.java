public class Main {
    public static void main(String[] args) {
        Orcamento o1 = new Orcamento(55, 3, 3);
        CalculadoraDesconto calc = new CalculadoraDesconto();
        System.out.println(calc.calcular(o1));
    }
}