package refatoracao;

public class execucao10 {
    public static void main(String[] args) {
        exercicio10 exercicio10 = new exercicio10();
        double valorInvestimento = 10000.00;
        double taxaJuros = 0.05;
        double valorJuros = exercicio10.calcularInvestimento(valorInvestimento, taxaJuros);
        System.out.println("O Valor do Jusros será: R$" + valorJuros);
        System.out.println("Você investiu: " + valorInvestimento);
        System.out.println("O Valor total são : " + (valorInvestimento + valorJuros));

    }

}
