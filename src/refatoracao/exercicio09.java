package refatoracao;

public class exercicio09 {
    public int[] calculartabuada(int numeroDigitado) {
        int[] vetorTabuada = new int[10];
        int i = 1;
        while (i <= 10) {
            vetorTabuada[i - 1] = numeroDigitado * i;
            i++;
        }
        return vetorTabuada;

    }

}
