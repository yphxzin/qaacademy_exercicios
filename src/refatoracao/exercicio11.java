package refatoracao;

public class exercicio11 {
    public int somardois(int numerodigitado) {
        int i = 1;
        while (i <= 100) {
            numerodigitado = numerodigitado + 2;
            i++;
        }
        return numerodigitado;
    }

    public int[] somarDoisComVetor(int numeroDigitado) {
        int[] vetorSoma = new int[100];

        int i = 1;
        while (i <= 100) {
            numeroDigitado = numeroDigitado + 2;
            vetorSoma[i - 1] = numeroDigitado;
            i++; // i = i +1;
        }
        return vetorSoma;
    }

}
