# Projeto de Cálculo de Descontos

Este projeto implementa um sistema de cálculo de descontos utilizando o padrão de projeto "Chain of Responsibility". O sistema permite aplicar múltiplos descontos de forma cumulativa, baseados em condições específicas.

## Estrutura do Projeto

O projeto consiste em várias classes Java, cada uma desempenhando um papel específico no sistema de cálculo de descontos:

- `Main`: Classe principal que inicializa o sistema e executa o cálculo de descontos.
- `CalcularDesconto`: Classe responsável por iniciar a cadeia de descontos.
- `Desconto`: Classe abstrata que define a estrutura básica para os diferentes tipos de descontos.
- `SemDesconto`: Classe que representa o fim da cadeia de descontos, retornando o valor original.
- `DescontoPara3Alunos`: Classe que aplica um desconto de 3% se houver 3 ou mais alunos.
- `DescontoParaTresMeses`: Classe que aplica um desconto de 3% se a duração for de 3 ou mais meses.
- `Orcamento`: Classe que representa o orçamento e seus atributos.

## Como Funciona

1. **Criação do Orçamento**: Um objeto `Orcamento` é criado com o valor, a quantidade de alunos e a quantidade de meses.
2. **Cálculo dos Descontos**: O objeto `Orcamento` é passado para a classe `CalcularDesconto`, que inicia a cadeia de descontos.
3. **Aplicação dos Descontos**: Cada classe de desconto na cadeia verifica se a condição para o desconto é atendida. Se for, o desconto é aplicado ao valor do orçamento, e o próximo desconto na cadeia é chamado.
4. **Resultado Final**: O valor final do orçamento, após a aplicação de todos os descontos aplicáveis, é retornado e exibido.

## Exemplo de Uso

Aqui está um exemplo de como usar o sistema de cálculo de descontos:

```java
public class Main {
    public static void main(String[] args) {
        // Criação de um orçamento
        Orcamento o1 = new Orcamento(55, 3, 3); // Valor: 55, 3 alunos, 3 meses
        
        // Inicialização do cálculo de descontos
        CalcularDesconto calc = new CalcularDesconto();
        
        // Cálculo e exibição do valor final com descontos aplicados
        System.out.println(calc.calcular(o1));
    }
}
