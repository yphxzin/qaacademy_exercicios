package RefatoracaoMedium;

public class exercicio04 {
    public int[] multiplicaatemil(){
        int [] vetorMultiplicacao = new int [1000]; 
        int i = 1, multi = 1;

        while (i <= 1000) {
            multi = i * multi;
            vetorMultiplicacao[i-1] = multi; 
            if (multi >= 1000) {
                multi = 1;
                vetorMultiplicacao[i-1] = multi;
            }
            System.out.println(multi);
            i++;
        }
        return vetorMultiplicacao;

    }
    
}
