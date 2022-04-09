package refatoracao;

public class execucao09 {
    public static void main(String[] args) {
        exercicio09 exercicio09 = new exercicio09();
        int[] vetorTabuada = exercicio09.calculartabuada(10);
        exibirVetor(vetorTabuada);
    }

    public static void exibirVetor(int[] vetorParaImprimir) {
        int i = 0;
        while (i < vetorParaImprimir.length) {
            System.out.println(vetorParaImprimir[i]);
            i++;

        }
    }
}
