package RefatoracaoMedium;

public class execucao02 { public static void main(String[] args) {
    exercicio02 exercicio02 = new exercicio02();
    double valorInvestimento = 100000.00;
    double valorJuros = exercicio02.calcularInvestimentoJurosCompostos(valorInvestimento);
    double valorTotal = valorInvestimento + valorJuros;

    System.out.println("O Valor investido rendeu : " + valorJuros + "de Juros");
    System.out.println("Você investiu: " + valorInvestimento);
    System.out.println("O Valor total são : " + valorTotal);
}
    
}
